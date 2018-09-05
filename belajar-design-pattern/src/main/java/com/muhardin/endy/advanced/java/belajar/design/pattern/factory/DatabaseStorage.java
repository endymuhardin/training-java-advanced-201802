package com.muhardin.endy.advanced.java.belajar.design.pattern.factory;

public class DatabaseStorage {
    private String namaDb;

    public DatabaseStorage(String namaDb) {
        this.namaDb = namaDb;
    }
    
    public void simpan(String data){
        System.out.println("Menyimpan data "+data+" di database "+namaDb);
    }
}
