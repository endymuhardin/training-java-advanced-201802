package com.muhardin.endy.advanced.java.belajar.sonar;

import com.muhardin.endy.advanced.java.belajar.design.pattern.builder.Produk;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CobaNullWarning {

    public void coba() {
        List<Produk> daftarProduk = null;

        if (adaIsinya(daftarProduk)) {
            Produk p = new Produk();
            p.setHarga(new BigDecimal(100));

            daftarProduk.add(null); // ini boleh
            daftarProduk.add(p);

            Produk px = daftarProduk.get(0);
            System.out.println(px.getHarga());
        }
        
        LocalDate lusa = new TanggalLokal(LocalDate.now()).lusa();
    }
    
    private static class TanggalLokal {
        private LocalDate tanggal;
        
        public TanggalLokal(LocalDate tanggal) {
            this.tanggal = tanggal;
        }
        
        public LocalDate lusa(){
            return tanggal.plusDays(2);
        }
    }
    
    private LocalDate duaHariKemudian(LocalDate tanggal){
        return tanggal.plusDays(2);
    }

    private boolean adaIsinya(List<Produk> daftarProduk) {
        return daftarProduk != null && !daftarProduk.isEmpty();
    }
}
