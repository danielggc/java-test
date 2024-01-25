package com.example.demo.models;

public class ParampsMIxDto {
    private int code ;
    private String mesaage;

    public int getCode() {
        return code;
    }
    public String getMesaage() {
        return mesaage;
    }


    public ParampsMIxDto( int _code , String _mesaage  ){
        this.code = _code;
        this.mesaage = _mesaage;
    }
    
}
