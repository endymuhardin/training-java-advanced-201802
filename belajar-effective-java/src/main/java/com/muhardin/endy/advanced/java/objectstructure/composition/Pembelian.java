package com.muhardin.endy.advanced.java.objectstructure.composition;

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
    
    Set<PembelianDetail> daftarBelanja = new HashSet<>(); // composition
    Set<Diskon> daftarDiskon = new HashSet<>();           // aggregation
    Set<Pajak> daftarPajak = new HashSet<>();
    
    public BigDecimal totalNilai() {
        BigDecimal hasil = BigDecimal.ZERO;
        
        for(PembelianDetail pd : daftarBelanja){
            hasil = hasil.add(pd.subtotal());
        }
        
        return hasil;
    }
    
    public BigDecimal totalDiskon() {
        BigDecimal hasil = BigDecimal.ZERO;
        
        for(Diskon d : daftarDiskon){
            hasil = hasil.add(d.hitungDiskon());
        }
        
        return hasil;
    }
    
    public BigDecimal totalPajak(){
        BigDecimal hasil = BigDecimal.ZERO;
        
        for(Pajak d : daftarPajak){
            hasil = hasil.add(d.hitungPajak(this));
        }
        
        return hasil;
    }
}
