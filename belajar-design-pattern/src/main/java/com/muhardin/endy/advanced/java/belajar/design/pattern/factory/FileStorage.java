package com.muhardin.endy.advanced.java.belajar.design.pattern.factory;

public class FileStorage {
    
    private String namafile;
    
    public FileStorage(String namafile) {
        this.namafile = namafile;
    }
    
    public void simpan(String teks){
        System.out.println("Menyimpan teks "+teks+ " di file "+namafile);
    }
}
