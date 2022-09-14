package com.example.texniktopshiriq1.controller;

import com.example.texniktopshiriq1.payload.ApiResponse;
import com.example.texniktopshiriq1.payload.GTKInformationDTO;
import com.example.texniktopshiriq1.service.GTKInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gtkInformation")
public class GTKInformationController {
    @Autowired
    GTKInformationService gtkInformationService;

    @GetMapping
    public HttpEntity<?> getGTKInformation() {
        ApiResponse apiResponse = gtkInformationService.getGTKInformation();
        return ResponseEntity.status(apiResponse.isSuccess()? 200 : 409).body(apiResponse);
    }

    @PostMapping
    public HttpEntity<?> addGTKInformation(@RequestBody GTKInformationDTO gtkInformationDTO) {
        ApiResponse apiResponse = gtkInformationService.addGTKInformation(gtkInformationDTO);
        return ResponseEntity.status(apiResponse.isSuccess()? 201 : 409).body(apiResponse);
    }

}
