package com.muhardin.endy.advanced.java.objectstructure.composition;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Data;

@Data
public class DiskonUltah extends Diskon {
    private LocalDate tanggalLahir;
    private BigDecimal persentaseDiskon;

    public DiskonUltah(Pembelian p) {
        super(p);
    }
    
    @Override
    public BigDecimal hitungDiskon() {
        if(getPembelian().getWaktuTransaksi().getMonthValue() == tanggalLahir.getMonthValue()) {
            return persentaseDiskon.multiply(getPembelian().totalNilai());
        }
        
        return BigDecimal.ZERO;
    }
}
