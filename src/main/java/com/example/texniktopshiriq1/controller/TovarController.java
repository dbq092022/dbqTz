package com.example.texniktopshiriq1.controller;

import com.example.texniktopshiriq1.payload.ApiResponse;
import com.example.texniktopshiriq1.payload.TovarDTO;
import com.example.texniktopshiriq1.service.TovarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tovar")

public class TovarController {
    @Autowired
    TovarService tovarService;

    @GetMapping
    public HttpEntity<?> getTovar() {
        ApiResponse apiResponse = tovarService.getTovar();
        return ResponseEntity.status(apiResponse.isSuccess()? 200 : 409).body(apiResponse);
    }

    @PostMapping
    public HttpEntity<?> addTovar(@RequestBody TovarDTO tovarDTO) {
        ApiResponse apiResponse = tovarService.addTovar(tovarDTO);
        return ResponseEntity.status(apiResponse.isSuccess()? 201 : 409).body(apiResponse);
    }


}
