package com.muhardin.endy.advanced.java;

public class DemoLombok {
    public static void main(String[] args) {
        Customer c1 = new Customer("123", "123", "Customer 123", null);
        c1.setId("123");
        c1.setNomor("123");
        c1.setNama("Customer 123");
        
        System.out.println("Customer : "+c1);
        System.out.println("Hashcode c1 : "+c1.hashCode());
        
        Customer c2 = new Customer();
        c2.setId("123");
        c2.setNomor("123");
        
        System.out.println("Hashcode c2 : "+c2.hashCode());
        System.out.println("c1 vs c2 : "+c1.equals(c2));
        System.out.println("c2 vs c1 : "+c2.equals(c1));
    }
}
