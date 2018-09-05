package com.muhardin.endy.advanced.java.belajar.design.pattern.templatemethod;

public class DbToPdfReport extends ReportGenerator {

    @Override
    public void ambilData() {
        System.out.println("Ambil data dari database");
    }

    @Override
    public void generateOutput() {
        System.out.println("Generate PDF");
    }
    
}
