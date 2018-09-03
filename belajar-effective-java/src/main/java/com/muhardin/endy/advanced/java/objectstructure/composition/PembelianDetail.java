package com.muhardin.endy.advanced.java.objectstructure.composition;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class PembelianDetail {
    private String id;
    private Pembelian pembelian;
    private Produk produk;
    private Integer jumlah;
    
    public BigDecimal subtotal(){
        return produk.getHarga().multiply(new BigDecimal(jumlah));
    }
}
