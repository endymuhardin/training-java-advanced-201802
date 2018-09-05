package com.muhardin.endy.advanced.java.belajar.design.pattern.bridge;

import lombok.Data;

@Data
public class SecureDocument extends Document {
    private String key;
    
    public void encrypt(){
        String data = getStorage().download();
        System.out.println("Mengenkripsi "+data);
        getStorage().upload("123" + data + "123");
    }
    
    public String decrypt(){
        String encrypted = getStorage().download();
        System.out.println("Dekripsi data "+encrypted);
        return encrypted.substring(3, encrypted.length() - 3);
    }
}
