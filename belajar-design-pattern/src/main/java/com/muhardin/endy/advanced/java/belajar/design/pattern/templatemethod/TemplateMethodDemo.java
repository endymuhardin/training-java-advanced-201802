package com.muhardin.endy.advanced.java.belajar.design.pattern.templatemethod;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        ReportGenerator report1 = new DbToPdfReport();
        report1.generateReport();
        
        ReportGenerator report2 = new CsvToXlsReport();
        report2.generateReport();
    }
}
