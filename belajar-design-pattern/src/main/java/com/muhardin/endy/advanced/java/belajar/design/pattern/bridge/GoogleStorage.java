package com.muhardin.endy.advanced.java.belajar.design.pattern.bridge;

public class GoogleStorage implements Storage {

    private String data;
    
    @Override
    public void upload(String data) {
        System.out.println("Mengupload "+data+" ke google cloud");
        this.data = data;
    }

    @Override
    public String download() {
        System.out.println("Mendownload "+data+" dari google cloud");
        return data;
    }

    @Override
    public void delete() {
        data = null;
    }
    
}
