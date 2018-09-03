package com.muhardin.endy.advanced.java.objectstructure;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Produk {
    private String id;
    private String kode;
    private String nama;
    private BigDecimal harga;
    
}
