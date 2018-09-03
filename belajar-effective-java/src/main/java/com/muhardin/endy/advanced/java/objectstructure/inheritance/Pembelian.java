package com.muhardin.endy.advanced.java.objectstructure.inheritance;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;

@Data
public class Pembelian {
    private String id;
    private LocalDateTime waktuTransaksi = LocalDateTime.now();
    private String customer;
    
    Set<PembelianDetail> daftarBelanja = new HashSet<>();
    
    public BigDecimal total() {
        BigDecimal hasil = BigDecimal.ZERO;
        
        for(PembelianDetail pd : daftarBelanja){
            hasil = hasil.add(pd.subtotal());
        }
        
        return hasil;
    }
}
