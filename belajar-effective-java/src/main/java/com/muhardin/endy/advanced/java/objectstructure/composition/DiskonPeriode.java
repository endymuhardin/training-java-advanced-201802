package com.muhardin.endy.advanced.java.objectstructure.composition;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class DiskonPeriode extends Diskon {

    private BigDecimal persentaseDiskon;
    private LocalDateTime waktuMulai;
    private LocalDateTime waktuSelesai;

    public DiskonPeriode(Pembelian p) {
        super(p);
    }
    
    @Override
    public BigDecimal hitungDiskon() {
        if(getPembelian().getWaktuTransaksi().isAfter(waktuMulai) 
                && getPembelian().getWaktuTransaksi().isBefore(waktuSelesai)){
            return getPembelian().totalNilai().multiply(persentaseDiskon);
        }
        
        return BigDecimal.ZERO;
    }
    
}
