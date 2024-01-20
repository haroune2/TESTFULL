package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class controller {
    @GetMapping("/resource")
    public ResponseEntity<Object> getResource() {
        // Votre logique pour obtenir les données
        // Exemple avec une réponse JSON
        Map<String, Object> responseData = new HashMap<>();
        responseData.put("message", "Hello from the backend!");
        return ResponseEntity.ok().body(responseData);
    }
}
