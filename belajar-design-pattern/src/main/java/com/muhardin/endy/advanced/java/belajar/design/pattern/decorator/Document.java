package com.muhardin.endy.advanced.java.belajar.design.pattern.decorator;

import lombok.Data;

@Data
public class Document {
    private String content;
    
    public void save(){
        System.out.println("Menyimpan "+content);
    }
}
