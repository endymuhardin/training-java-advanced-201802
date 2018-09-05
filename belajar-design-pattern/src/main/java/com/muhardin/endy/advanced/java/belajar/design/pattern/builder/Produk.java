package com.muhardin.endy.advanced.java.belajar.design.pattern.builder;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Produk {
    private String kode;
    private String nama;
    private BigDecimal harga;
    private BigDecimal persentasePajakBarangMewah;
    
    public static Produk.Builder builder() {
        return new Builder();
    }
    
    public static class Builder {
        private Produk p;
        
        Builder(){
            p = new Produk();
        }
        
        public Produk.Builder kode(String k){
            p.setKode(k);
            return this;
        }
        
        public Produk.Builder nama(String n){
            p.setNama(n);
            return this;
        }
        
        public Produk.Builder harga(BigDecimal harga){
            p.setHarga(harga);
            return this;
        }
        
        public Produk.Builder persentasePajakBarangMewah(BigDecimal pajak){
            p.setPersentasePajakBarangMewah(pajak);
            return this;
        }
        
        public Produk build(){
            if(p.getKode() == null){
                throw new NullPointerException("Kode produk harus diisi");
            }
            
            if(p.getHarga() != null && p.getHarga().compareTo(new BigDecimal("10000000")) > 0) {
                if(p.getPersentasePajakBarangMewah() == null) {
                    throw new IllegalStateException("Untuk barang dengan harga > 10jt, persentase pajak harus diisi");
                }
            }
            
            return p;
        }
    }
}
