package com.muhardin.endy.advanced.java.commonmethods.exception;

import java.math.BigDecimal;

public class VirtualAccountServiceTests {
    public void testPayment(){
        VirtualAccountService service = new VirtualAccountService();
        service.pay("123", new BigDecimal(100000));
        
        // query ke database, cek apakah va 123 status sudah lunas
    }
}
