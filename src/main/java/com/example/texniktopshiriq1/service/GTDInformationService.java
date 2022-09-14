package com.example.texniktopshiriq1.service;

import com.example.texniktopshiriq1.entity.GTDInformation;
import com.example.texniktopshiriq1.payload.ApiResponse;
import com.example.texniktopshiriq1.payload.GTDInformationDTO;
import com.example.texniktopshiriq1.repository.GTDInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;

@Service
public class GTDInformationService {
    @Autowired
    GTDInformationRepository gtdInformationRepository;

    public ApiResponse getGTDInformation() {
        return new ApiResponse("OK", true, gtdInformationRepository.findAll());
    }

    public ApiResponse addGTDInformation(GTDInformationDTO gtdInformationDTO) {
        GTDInformation gtdInformation = new GTDInformation();
        gtdInformation.setInformationDate(gtdInformationDTO.getInformationDate());
        gtdInformationRepository.save(gtdInformation);
        return new ApiResponse("GTD saqlandi", true);
    }
}
