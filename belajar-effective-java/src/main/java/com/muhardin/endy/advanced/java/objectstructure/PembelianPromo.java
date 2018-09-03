package com.muhardin.endy.advanced.java.objectstructure;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class PembelianPromo extends Pembelian {
    private String namaPromo;
    private String voucher;
    
    public BigDecimal diskon(){
        return total().multiply(new BigDecimal("0.1"));
    }
}
