package com.example.api.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Client {
    
    @Value("client.name")
    private String name;
    @Value("client.lastName")
    private String lastName;

    

    
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
