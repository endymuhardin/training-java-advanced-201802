package com.muhardin.endy.advanced.java.objectstructure;

import java.math.BigDecimal;

public class DemoInheritance {
    public static void main(String[] args) {
        Produk p = new Produk();
        p.setId("P-001");
        p.setKode("P-001");
        p.setNama("Produk 001");
        p.setHarga(new BigDecimal("100000"));
        
        PembelianDetail pd = new PembelianDetail();
        pd.setProduk(p);
        pd.setJumlah(3);
        
        PembelianPromo pb = new PembelianPromo();
        pb.getDaftarBelanja().add(pd);
        
        System.out.println("Total belanja : "+pb.total());
        System.out.println("Diskon : " +pb.diskon());
        System.out.println("Bayar : "+pb.total().subtract(pb.diskon()));
        
    }
}
