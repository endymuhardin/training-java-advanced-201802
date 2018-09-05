package com.muhardin.endy.advanced.java.belajar.design.pattern.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        // simpan dokumen d1 di google
        Document d1 = new Document();
        d1.setStorage(new GoogleStorage());
        d1.setContent("Dokumen D1");
        d1.save();
        
        
        // simpan secure dokumen d2 di amazon
        SecureDocument d2 = new SecureDocument();
        d2.setStorage(new AmazonStorage());
        d2.setContent("data-rahasia");
        d2.save();
        d2.encrypt();
        String hasilDekripsi = d2.decrypt();
        System.out.println("Dokumen yang sudah didecrypt : "+hasilDekripsi);
    }
}
