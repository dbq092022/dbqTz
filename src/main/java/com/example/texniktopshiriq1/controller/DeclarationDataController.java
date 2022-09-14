package com.example.texniktopshiriq1.controller;

import com.example.texniktopshiriq1.payload.ApiResponse;
import com.example.texniktopshiriq1.payload.DeclarationDataDTO;
import com.example.texniktopshiriq1.service.DeclarationDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/declarationData")
public class DeclarationDataController {
    @Autowired
    DeclarationDataService declarationDataService;

    @GetMapping
    public HttpEntity<?> getDeclarationData() {
        ApiResponse apiResponse = declarationDataService.getDeclarationData();
        return ResponseEntity.status(apiResponse.isSuccess()? 200 : 409).body(apiResponse);
    }

    @PostMapping
    public HttpEntity<?> addDeclarationData(@RequestBody DeclarationDataDTO declarationDataDTO) {
        ApiResponse apiResponse = declarationDataService.addDeclarationData(declarationDataDTO);
        return ResponseEntity.status(apiResponse.isSuccess()? 201 : 409).body(apiResponse);
    }

}
