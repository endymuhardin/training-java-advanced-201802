package com.muhardin.endy.advanced.java.objectstructure.composition;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

@Data
public class ProdukImpor extends Produk implements Pajak {
    private Map<String, BigDecimal> tarifPajakImpor = new HashMap<>();
    private String negaraAsal;

    @Override
    public BigDecimal hitungPajak(Pembelian pembelian) {
        return getHarga().multiply(tarifPajakImpor.get(negaraAsal));
    }
    
}
