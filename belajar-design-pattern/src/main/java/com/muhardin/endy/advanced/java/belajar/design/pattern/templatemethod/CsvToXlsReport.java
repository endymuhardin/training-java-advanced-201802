package com.muhardin.endy.advanced.java.belajar.design.pattern.templatemethod;

public class CsvToXlsReport extends ReportGenerator {

    @Override
    public void ambilData() {
        System.out.println("Membaca data dari file CSV");
    }

    @Override
    public void generateOutput() {
        System.out.println("Generate report Xls");
    }
    
}
