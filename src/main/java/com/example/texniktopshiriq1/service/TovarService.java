package com.example.texniktopshiriq1.service;

import com.example.texniktopshiriq1.entity.Tovar;
import com.example.texniktopshiriq1.payload.ApiResponse;
import com.example.texniktopshiriq1.payload.TovarDTO;
import com.example.texniktopshiriq1.repository.TovarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TovarService {
    @Autowired
    TovarRepository tovarRepository;
    public ApiResponse getTovar() {
        return new ApiResponse("Ok",true, tovarRepository.findAll());
    }

    public ApiResponse addTovar(TovarDTO tovarDTO) {
        Tovar tovar = new Tovar();
        tovar.setG32(tovarDTO.getG32());
        tovar.setG43(tovarDTO.getG43());
        tovar.setG31_NAME(tovarDTO.getG31_NAME());
        tovar.setG31_6(tovarDTO.getG31_6());
        return null;
    }
}
