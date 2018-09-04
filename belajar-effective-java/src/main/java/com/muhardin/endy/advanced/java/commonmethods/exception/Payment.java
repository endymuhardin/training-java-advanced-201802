package com.muhardin.endy.advanced.java.commonmethods.exception;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data @EqualsAndHashCode(of ={"referenceNumber"})
public class Payment {
    private String id;
    private String referenceNumber;
    private LocalDateTime waktuTransaksi = LocalDateTime.now();
    private BigDecimal nilai;
    private VirtualAccount virtualAccount;
}
