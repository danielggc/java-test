package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MesagesController {

    @GetMapping("/saludo")
    public String saludo( Model model) {
        model.addAttribute( "title", "hello world  sprint boot" );
        model.addAttribute("name" ,"dgc7");
        

        return "saludo";
    }
}