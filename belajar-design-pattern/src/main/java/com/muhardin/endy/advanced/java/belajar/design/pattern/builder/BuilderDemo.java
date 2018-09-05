package com.muhardin.endy.advanced.java.belajar.design.pattern.builder;

import java.math.BigDecimal;

public class BuilderDemo {
    public static void main(String[] args) {
        //Customer c = new Customer("Endy", "endy@muhardin.com");
        
        // Customer x = new Customer(); // kalau pakai annotation @Builder, lombok akan menghilangkan default constructor (yang tanpa argumen)
        
        Customer c = Customer.builder()
                .nama("Endy")
                .email("endy@muhardin.com")
                .kodepos("123456")
                .build();
        
        System.out.println("Customer : " +c);
        
        Produk p = Produk.builder()
                .kode("P-001")
                .nama("Produk 001")
                .build();
        
        Produk p2 = Produk.builder()
                .kode("P-001") // field kode mandatory
                .nama("Produk 002")
                .build();
        
        Produk p3 = Produk.builder()
                .kode("P-003")
                .nama("Produk 001")
                .harga(new BigDecimal("500000"))
                .build();
        
        Produk p4 = Produk.builder()
                .kode("P-004")
                .nama("Produk 001")
                .harga(new BigDecimal("50000000")) // harus isi pajak
                .build();
        
    }
}
