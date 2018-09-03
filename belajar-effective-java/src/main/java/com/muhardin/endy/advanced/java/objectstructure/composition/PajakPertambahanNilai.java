package com.muhardin.endy.advanced.java.objectstructure.composition;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PajakPertambahanNilai implements Pajak {
    private BigDecimal persentase;

    @Override
    public BigDecimal hitungPajak(Pembelian pembelian) {
        return pembelian.totalNilai().multiply(persentase);
    }
    
}
