package com.example.aop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.services.GreetingService;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class greatingController {
    
    @Autowired
    private GreetingService greetingService ;

    @GetMapping("/greeting")
    public ResponseEntity<?> getMethodName() {
        return ResponseEntity.ok( Collections.singletonMap(" greeting" , this.greetingService.sayHello( "dgc7","hello command clone " )));
    }
    
}
