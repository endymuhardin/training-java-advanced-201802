package com.muhardin.endy.advanced.java;

import java.math.BigDecimal;

public class CobaDecimal {
    public static void main(String[] args) {
        System.out.println("1.03 - 0.42 = "+(1.03 - 0.42));
        
        BigDecimal a = new BigDecimal("1.03");
        BigDecimal b = new BigDecimal("0.42");
        System.out.println("BigDecimal 1.03 - 0.42 = "+a.subtract(b));
    }
}
