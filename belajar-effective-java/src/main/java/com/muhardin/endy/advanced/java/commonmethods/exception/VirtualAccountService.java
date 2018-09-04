package com.muhardin.endy.advanced.java.commonmethods.exception;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class VirtualAccountService {
    
    List<String> databaseVa = Arrays.asList("123", "456", "111", "222");
    
    /**
     * menyimpan va baru ke database.
     * 
     * nomer va harus diisi dan harus dicek dulu ke database apakah nomernya sudah dipakai atau belum.
     * @param va object yang akan disimpan
     * @throws NomerVirtualAccountSudahDipakaiException kalau nomer va sudah ada di database
     */
    public void simpan(VirtualAccount va) {
        // cek nomer va
        boolean sudahDipakai = va.getNomer().equals("123");
        if(sudahDipakai) {
            throw new NomerVirtualAccountSudahDipakaiException("Nomer va "+va.getNomer()+" sudah dipakai");
        }
        
        // simpan va ke database
    }
    
    /**
     * mencari data VA di sistem
     * @param nomer va yang akan dicari
     * @return object va berisi nama, nilai, tanggal jatuh tempo
     * @throws VirtualAccountNotExistException kalau nomer va tidak ditemukan
     * @throws VirtualAccountKadaluarsaException kalau tanggal jatuh tempo sudah lewat
     */
    public VirtualAccount inquiry(String nomer) throws VirtualAccountNotExistException, VirtualAccountKadaluarsaException {
        if(!databaseVa.contains(nomer)){
            throw new VirtualAccountNotExistException("VA "+nomer+" tidak terdaftar");
        }
        
        VirtualAccount va = new VirtualAccount();
        va.setNomer(nomer);
        va.setNama("Tester Account "+nomer);
        
        if(va.getJatuhTempo().isBefore(LocalDate.now())) {
            throw new VirtualAccountKadaluarsaException("VA "+nomer+" sudah kadaluarsa sejak "+va.getJatuhTempo());
        }
        
        // kalau jatuh tempo kurang dari 60 hari lagi, berikan warning
        if(va.getJatuhTempo().isBefore(LocalDate.now().plusDays(60))){
            // kirim warning
        }
        
        return va;
    }
    
    public void pay(String nomer, BigDecimal nilai){
        // insert ke tabel payment
    }
}
