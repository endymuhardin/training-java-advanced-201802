package com.muhardin.endy.advanced.java.belajar.design.pattern.bridge;

import lombok.Data;

@Data
public class Document {
    
    private String content;
    private Storage storage;
    
    public String getContent(){
        return storage.download();
    }
    
    public void save(){
        storage.upload(content);
    }
    
    public void delete(){
        storage.delete();
    }
}
