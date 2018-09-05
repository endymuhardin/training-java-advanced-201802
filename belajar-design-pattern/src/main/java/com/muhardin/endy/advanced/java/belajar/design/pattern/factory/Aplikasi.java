package com.muhardin.endy.advanced.java.belajar.design.pattern.factory;

public class Aplikasi {
    public static void main(String[] args) {
        String data = "nama : endy";
        
        // nantinya tipe penyimpanan bisa dipilih di combo/radio
        Storage penyimpanan = StorageFactory.createStorage("cloud");
        penyimpanan.simpan(data);
        
        // simpan data
        /*
        FileStorage store = new FileStorage("coba.txt");
        store.simpan(data);
        
        CloudStorage store = new CloudStorage("dropbox");
        store.simpan(data);
        
        DatabaseStorage store = new DatabaseStorage("mydb");
        store.simpan(data);
        */
    }
}
