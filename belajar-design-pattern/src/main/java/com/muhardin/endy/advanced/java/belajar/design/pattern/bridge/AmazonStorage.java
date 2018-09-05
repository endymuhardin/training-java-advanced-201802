package com.muhardin.endy.advanced.java.belajar.design.pattern.bridge;

public class AmazonStorage implements Storage {

    private String data;
    
    @Override
    public void upload(String data) {
        System.out.println("Mengupload "+data+" ke Amazon cloud");
        this.data = data;
    }

    @Override
    public String download() {
        System.out.println("Mendownload "+data+" dari Amazon cloud");
        return data;
    }

    @Override
    public void delete() {
        data = null;
    }
    
}
