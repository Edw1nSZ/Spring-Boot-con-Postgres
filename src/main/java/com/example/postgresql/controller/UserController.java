package com.example.postgresql.controller;

import com.example.postgresql.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController {

    private final UserRepository productRepository;

    public UserController(UserRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    @GetMapping
    public ResponseEntity getAllProducts() {
        return ResponseEntity.ok(this.productRepository.findAll());
    }
}
