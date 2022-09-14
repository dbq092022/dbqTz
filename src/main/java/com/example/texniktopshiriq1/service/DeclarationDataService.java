package com.example.texniktopshiriq1.service;

import com.example.texniktopshiriq1.entity.DeclarationData;
import com.example.texniktopshiriq1.entity.GTDInformation;
import com.example.texniktopshiriq1.payload.ApiResponse;
import com.example.texniktopshiriq1.payload.DeclarationDataDTO;
import com.example.texniktopshiriq1.repository.DeclarationDataRepository;
import com.example.texniktopshiriq1.repository.GTDInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeclarationDataService {
    @Autowired
    DeclarationDataRepository declarationDataRepository;

    @Autowired
    GTDInformationRepository gtdInformationRepository;
    public ApiResponse getDeclarationData() {
            return new ApiResponse("Ok",true,declarationDataRepository.findAll() );
    }

    public ApiResponse addDeclarationData(DeclarationDataDTO declarationDataDTO) {
        Optional<GTDInformation> optionalGTDInformation = gtdInformationRepository.findById(declarationDataDTO.getGtdInformationId());
        if (!optionalGTDInformation.isPresent()) {
            return new ApiResponse("Bunday GTD mavjud emas", false);
        }

        DeclarationData declarationData = new DeclarationData();
        declarationData.setG7_a(declarationDataDTO.getG7_a());
        declarationData.setG7_b(declarationDataDTO.getG7_b());
        declarationData.setG7_c(declarationDataDTO.getG7_c());
        declarationData.setStatus(declarationDataDTO.getStatus());
        declarationData.setFlag_r(declarationDataDTO.getFlag_r());
        declarationData.setG1_a(declarationDataDTO.getG1_a());
        declarationData.setG1_b(declarationDataDTO.getG1_b());
        declarationData.setG8_name(declarationDataDTO.getG8_name());
        declarationData.setG8_code2(declarationDataDTO.getG8_code2());
        declarationData.setG22_a(declarationDataDTO.getG22_a());
        declarationData.setG23(declarationDataDTO.getG23());
        declarationData.setGtdInformation(optionalGTDInformation.get());
        declarationDataRepository.save(declarationData);
        return new ApiResponse("Deklaratsiya saqlandi", true);
    }
}
