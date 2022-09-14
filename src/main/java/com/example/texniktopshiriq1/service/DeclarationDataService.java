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
        declarationData.setG7_A(declarationDataDTO.getG7_A());
        declarationData.setG7_B(declarationDataDTO.getG7_B());
        declarationData.setG7_C(declarationDataDTO.getG7_C());
        declarationData.setSTATUS(declarationDataDTO.getSTATUS());
        declarationData.setFLAG_R(declarationDataDTO.getFLAG_R());
        declarationData.setG1_A(declarationDataDTO.getG1_A());
        declarationData.setG1_B(declarationDataDTO.getG1_B());
        declarationData.setG8_NAME(declarationDataDTO.getG8_NAME());
        declarationData.setG8_CODE2(declarationDataDTO.getG8_CODE2());
        declarationData.setG22_A(declarationDataDTO.getG22_A());
        declarationData.setG23(declarationDataDTO.getG23());
        declarationData.setGtdInformation(optionalGTDInformation.get());
        declarationDataRepository.save(declarationData);
        return new ApiResponse("Deklaratsiya saqlandi", true);
    }
}
