package com.muhardin.endy.advanced.java.objectstructure.composition;

import java.math.BigDecimal;
import lombok.Data;

@Data
public abstract class Diskon {
    private String kode;
    private String nama;
    
    private Pembelian pembelian;
    
    public Diskon(Pembelian p) {
        this.pembelian = p;
    }
    
    public abstract BigDecimal hitungDiskon();
}
