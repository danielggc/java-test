
package com.example.aop.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl  implements GreetingService   {

    @Override
    public  String sayHello(  String person , String pharse ){
        String greeting = pharse + "  " + person ;
        System.out.println( greeting); 
        return  greeting;   
    }
    
}