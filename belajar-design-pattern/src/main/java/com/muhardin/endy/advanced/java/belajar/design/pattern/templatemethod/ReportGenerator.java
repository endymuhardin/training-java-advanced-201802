package com.muhardin.endy.advanced.java.belajar.design.pattern.templatemethod;

public abstract class ReportGenerator {
    
    // ditentukan subclass
    public abstract void ambilData();
    
    public void ambilTemplateReport() {
        System.out.println("Menggunakan template merah");
    }
    public void compileReport() {
        System.out.println("Menggabungkan data dengan template");
    }
    
    // nanti ditentukan oleh subclass
    public abstract void generateOutput();
    
    public final void generateReport() {
        ambilData();
        ambilTemplateReport();
        compileReport();
        generateOutput();
    }
}
