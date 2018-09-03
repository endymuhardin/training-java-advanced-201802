package com.muhardin.endy.advanced.java.objectstructure.composition;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class DiskonProduk extends Diskon {
    private Produk produk;
    private BigDecimal persentaseDiskon;
    private LocalDateTime waktuMulai;
    private LocalDateTime waktuSelesai;

    public DiskonProduk(Pembelian p) {
        super(p);
    }

    @Override
    public BigDecimal hitungDiskon() {
        BigDecimal hasil = BigDecimal.ZERO;
        
        for(PembelianDetail pd : getPembelian().getDaftarBelanja()){
            if(produk.equals(pd.getProduk())) {
                hasil = hasil.add(produk.getHarga().multiply(persentaseDiskon));
            }
        }
        
        return hasil;
    }
}
