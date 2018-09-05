package com.muhardin.endy.advanced.java.belajar.design.pattern.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Document doc = new Document();
        SecureDocument sdoc = new SecureDocument(doc);
        
        doc.setContent("ini content asli");
        doc.save();
        
        sdoc.encrypt();
        sdoc.decrypt();
    }
}
