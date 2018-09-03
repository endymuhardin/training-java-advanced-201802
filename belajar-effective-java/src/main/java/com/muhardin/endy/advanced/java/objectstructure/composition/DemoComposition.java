package com.muhardin.endy.advanced.java.objectstructure.composition;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DemoComposition {
    public static void main(String[] args) {
        Produk p1 = new Produk();
        p1.setId("P-001");
        p1.setKode("P-001");
        p1.setNama("Produk 001");
        p1.setHarga(new BigDecimal("100000"));
        
        Produk p2 = new Produk();
        p2.setId("P-002");
        p2.setKode("P-002");
        p2.setNama("Produk 002");
        p2.setHarga(new BigDecimal("200000"));
        
        
        PembelianDetail pd1 = new PembelianDetail();
        pd1.setProduk(p1);
        pd1.setJumlah(3);
        
        PembelianDetail pd2 = new PembelianDetail();
        pd2.setProduk(p2);
        pd2.setJumlah(2);
        
        Pembelian pb = new Pembelian();
        pb.getDaftarBelanja().add(pd1);
        pb.getDaftarBelanja().add(pd2);
        
        DiskonProduk d1 = new DiskonProduk(pb);
        d1.setKode("DISC-001");
        d1.setNama("Diskon Produk P-001 15%");
        d1.setProduk(p1);
        d1.setPersentaseDiskon(new BigDecimal("0.175"));
        
        DiskonPeriode d2 = new DiskonPeriode(pb);
        d2.setKode("DISC-MERDEKA");
        d2.setNama("Diskon semua produk menyambut HUT RI : 7.5%");
        d2.setPersentaseDiskon(new BigDecimal("0.075"));
        d2.setWaktuMulai(LocalDateTime.now().withMonth(8).withDayOfMonth(1));
        d2.setWaktuSelesai(LocalDateTime.now().withMonth(8).withDayOfMonth(31));
        
        pb.getDaftarDiskon().add(d1);
        pb.getDaftarDiskon().add(d2);
        
        System.out.println("Total belanja : "+pb.totalNilai());
        System.out.println("Total diskon : "+pb.totalDiskon());
        System.out.println("Harus dibayar : "+pb.totalNilai().subtract(pb.totalDiskon()));
        
        // contoh produk impor
        ProdukImpor p3 = new ProdukImpor();
        p3.setId("P-003");
        p3.setKode("P-003");
        p3.setNama("Produk 003");
        p3.setHarga(new BigDecimal("200000000"));
        p3.setNegaraAsal("Togo");
        p3.getTarifPajakImpor().put("Togo", new BigDecimal("0.25"));
        
        PembelianDetail pd3 = new PembelianDetail();
        pd3.setProduk(p3);
        pd3.setJumlah(1);
        
        Pembelian pb3 = new Pembelian();
        pb3.getDaftarBelanja().add(pd3);
        pb3.getDaftarPajak().add(p3);
        pb3.getDaftarPajak().add(new PajakPertambahanNilai(new BigDecimal("0.1")));
        
        System.out.println("Total Pajak : "+pb3.totalPajak());
    }
}
