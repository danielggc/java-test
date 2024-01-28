package com.example.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.api.models.Item;
import com.example.api.models.Product;

@Configuration
@PropertySource( value = "classpath:data.properties" , encoding =  "UTF-8" ) 


public  class AppFile {

    @Bean
    List<Item> itemsInvoice(){
        Product p1 = new Product("avr328" , 7000 );
        Product p2 = new Product("lectoscd" , 5200 );
        return Arrays.asList( new  Item(p1,1 ) , new   Item( p2 ,1 )  );
    }
}