package com.muhardin.endy.advanced.java.belajar.design.pattern.decorator;

import lombok.Data;

@Data
public class SecureDocument {
    
    private Document document;

    public SecureDocument(Document document) {
        this.document = document;
    }
    
    public void encrypt(){
        String plain = document.getContent();
        String encrypted = "123["+plain+"]123";
        document.setContent(encrypted);
        document.save();
    }
    
    public void decrypt(){
        String encrypted = document.getContent();
        String plain = encrypted.substring(4, encrypted.length() - 4);
        document.setContent(plain);
        document.save();
    }
}
