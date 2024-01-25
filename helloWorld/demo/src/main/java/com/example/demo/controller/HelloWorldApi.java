package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ParampsMIxDto;

import jakarta.servlet.http.HttpServletRequest;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("Api")
public class HelloWorldApi {

    @GetMapping("/saludoApi")
    public Map< String, Object > saludoApi( ) {
        Map< String, Object > result = new HashMap<>();

        result.put( "title", "hello world  sprint boot" );
        result.put("name" ,"dgc7");
        

        return result;
    }

    @GetMapping("get/parms")
    public ParampsMIxDto requesParamps( HttpServletRequest request ) {
        Integer code = 10 ;
        try{
            code = Integer.parseInt( request.getParameter("code"));
        }catch( NumberFormatException e ){
            System.err.println("error en transfom string to int ");
        }
        ParampsMIxDto dd = new ParampsMIxDto( code , "hello world data params ");


        return dd ;

    }
    


    
}