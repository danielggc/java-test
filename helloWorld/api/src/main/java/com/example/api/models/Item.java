package com.example.api.models;

public class Item {
    private Product product;
    private Integer quiantiti;
    
    public Item(Product product, Integer quiantiti) {
        this.product = product;
        this.quiantiti = quiantiti;
    }

    
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Integer getQuiantiti() {
        return quiantiti;
    }
    public void setQuiantiti(Integer quiantiti) {
        this.quiantiti = quiantiti;
    }


    public Integer getTotalProduct( ){
        return product.getValue() * this.quiantiti;
    }
    
}
