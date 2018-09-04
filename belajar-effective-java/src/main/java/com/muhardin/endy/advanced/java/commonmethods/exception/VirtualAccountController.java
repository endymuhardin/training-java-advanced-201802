package com.muhardin.endy.advanced.java.commonmethods.exception;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VirtualAccountController {
    private VirtualAccountService virtualAccountService;
    
    public void createVa(String nomer, BigDecimal nilai, LocalDate jatuhTempo){
        // validasi : 
        // * apakah nomer diisi
        // * nilai diisi dan > 1000
        // * jatuhTempo > hari ini
        // * nomer sudah dipakai, validasi supaya tidak kena NomerVaSudahDipakaiException
        
        VirtualAccount va = new VirtualAccount();
        virtualAccountService.simpan(va); // tidak try-catch NomerVaSudahDipakaiException, seharusnya validasi dulu
        
        try {
            virtualAccountService.simpan(va); 
        } catch (NomerVirtualAccountSudahDipakaiException err) { // runtime exception juga bisa dicatch. Tapi sebaiknya divalidasi saja
            // tampilkan pesan error nomer sudah dipakai
        }
    }
    
    // akan menghandle request ke url /inquiry?va=1234567890
    public Map<String, Object> inquiryApi(String va)  {
        Map<String, Object> hasil = new HashMap<>();
        
        try {
            VirtualAccount virtualAccount = virtualAccountService.inquiry(va);
            hasil.put("sukses", true);
            hasil.put("data", va);
        } catch (VirtualAccountNotExistException ex) {
            hasil.put("sukses", false);
            hasil.put("error", "88");
            hasil.put("message", ex.getMessage());
        } catch (VirtualAccountKadaluarsaException ex) { 
            hasil.put("sukses", false);
            hasil.put("error", "99");
            hasil.put("message", ex.getMessage());
        }
            
        return hasil;
    }
}
