package com.example.api.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Invoice {
    
    @Autowired
    private Client client;
    @Value("invoice.description")
    private String description;
    @Autowired
    private List<Item> items ;


    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Item> getItem() {
        return items;
    }
    public void setItem(List<Item> item) {
        this.items = item;
    }
    
    public Integer  getCheck(){
        Integer totalCheck = 0;
        for ( Item data : items ){
            totalCheck += data.getTotalProduct();
        }
        return totalCheck;

    }

}
