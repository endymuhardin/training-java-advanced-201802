package com.muhardin.endy.advanced.java.commonmethods;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CobaFormatting {
    public static void main(String[] args) {
        BigDecimal harga = new BigDecimal("12300000.34");
        Locale indonesia = new Locale("ID", "id");
        Locale inggris = new Locale("EN", "gb");
        Locale amerika = new Locale("EN", "us");
        
        System.out.println("Harga Indonesia : "+ NumberFormat.getCurrencyInstance(indonesia).format(harga));
        System.out.println("Harga Inggris : "+ NumberFormat.getCurrencyInstance(inggris).format(harga));
        System.out.println("Harga Amerika : "+ NumberFormat.getCurrencyInstance(amerika).format(harga));
    }
}
