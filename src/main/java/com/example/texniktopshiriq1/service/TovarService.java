package com.example.texniktopshiriq1.service;

import com.example.texniktopshiriq1.entity.DeclarationData;
import com.example.texniktopshiriq1.entity.Tovar;
import com.example.texniktopshiriq1.payload.ApiResponse;
import com.example.texniktopshiriq1.payload.TovarDTO;
import com.example.texniktopshiriq1.repository.DeclarationDataRepository;
import com.example.texniktopshiriq1.repository.TovarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TovarService {
    @Autowired
    TovarRepository tovarRepository;

    @Autowired
    DeclarationDataRepository declarationDataRepository;
    public ApiResponse getTovar() {
        return new ApiResponse("Ok",true, tovarRepository.findAll());
    }

    public ApiResponse addTovar(TovarDTO tovarDTO) {
        Optional<DeclarationData> optionalDeclarationData = declarationDataRepository.findById(tovarDTO.getDeclarationDataId());
        if (!optionalDeclarationData.isPresent()) {
            return new ApiResponse("Bunday Deklaratsiya mavjud emas", false);
        }
        Tovar tovar = new Tovar();
        tovar.setG32(tovarDTO.getG32());
        tovar.setG43(tovarDTO.getG43());
        tovar.setG31_NAME(tovarDTO.getG31_NAME());
        tovar.setG31_6(tovarDTO.getG31_6());
        tovar.setDeclarationData(optionalDeclarationData.get());
        return new ApiResponse("Tovar saqlandi", true);
    }
}
