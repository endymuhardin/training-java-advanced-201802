package com.muhardin.endy.advanced.java.belajar.design.pattern.builder;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data @Builder
public class Customer {
    
    @NonNull
    private String nama;
    
    @NonNull
    private String email;
    private String noHp;
    private LocalDate tanggalLahir;
    private JenisKelamin jenisKelamin;
    private String alamat;
    private String kodepos;
    private String kelurahan;
    private String kecamatan;
    private String kabupatenKota;
    private String provinsi;

    /*
    public Customer(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public Customer(String nama, String email, String noHp) {
        this.nama = nama;
        this.email = email;
        this.noHp = noHp;
    }
    */
    
    
    public static enum JenisKelamin { PRIA, WANITA }
}
