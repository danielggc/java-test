package com.example.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.models.Invoice;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * invoiceController
 */
@RestController
@RequestMapping("/invoices")
public class invoiceController {

    @Autowired
    private Invoice invoice;
    
    @GetMapping("/show")
    public Invoice show(){
        
        return invoice;

    }
    
}