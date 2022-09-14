package com.example.texniktopshiriq1.controller;

import com.example.texniktopshiriq1.payload.ApiResponse;
import com.example.texniktopshiriq1.payload.GTDInformationDTO;
import com.example.texniktopshiriq1.service.GTDInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gtdInformation")
public class GTDInformationController {
    @Autowired
    GTDInformationService gtdInformationService;

    @GetMapping
    public HttpEntity<?> getGTDInformation() {
        ApiResponse apiResponse = gtdInformationService.getGTDInformation();
        return ResponseEntity.status(apiResponse.isSuccess()? 200 : 409).body(apiResponse);
    }

    @PostMapping
    public HttpEntity<?> addGTDInformation(@RequestBody GTDInformationDTO gtdInformationDTO) {
        ApiResponse apiResponse = gtdInformationService.addGTDInformation(gtdInformationDTO);
        return ResponseEntity.status(apiResponse.isSuccess()? 201 : 409).body(apiResponse);
    }

}
