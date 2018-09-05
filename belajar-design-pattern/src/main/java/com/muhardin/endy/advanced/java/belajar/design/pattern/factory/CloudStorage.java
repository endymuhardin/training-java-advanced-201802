package com.muhardin.endy.advanced.java.belajar.design.pattern.factory;

public class CloudStorage {
    private String provider;

    public CloudStorage(String provider) {
        this.provider = provider;
    }
    
    public void simpan(String data){
        System.out.println("Menyimpan data "+data+" di cloud provider "+provider);
    }
}
