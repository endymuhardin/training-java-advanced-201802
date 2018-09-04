package com.muhardin.endy.advanced.java.commonmethods.exception;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data @EqualsAndHashCode(of = {"nomor"})
public class VirtualAccount {
    private String id;
    private String nomer;
    private String nama;
    private BigDecimal nilai;
    private LocalDate jatuhTempo;
}
