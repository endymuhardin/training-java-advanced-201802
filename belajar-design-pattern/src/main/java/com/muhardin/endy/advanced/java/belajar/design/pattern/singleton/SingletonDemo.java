package com.muhardin.endy.advanced.java.belajar.design.pattern.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        
        // tidak diinginkan, harusnya cuma ada satu instance
        /*
        KoneksiDatabase kd1 = new KoneksiDatabase();
        KoneksiDatabase kd2 = new KoneksiDatabase();
        KoneksiDatabase kd3 = new KoneksiDatabase();
        KoneksiDatabase kd4 = new KoneksiDatabase();
        KoneksiDatabase kd5 = new KoneksiDatabase();
        */
        
        KoneksiDatabase kd1 = KoneksiDatabase.getKoneksiDatabase("jdbc:mysql://localhost/demo", "root", "test");
        KoneksiDatabase kd2 = KoneksiDatabase.getKoneksiDatabase("jdbc:mysql://localhost/demo", "root", "test");
        KoneksiDatabase kd3 = KoneksiDatabase.getKoneksiDatabase("jdbc:mysql://localhost/demo", "root", "test123");
        KoneksiDatabase kd4 = KoneksiDatabase.getKoneksiDatabase("jdbc:mysql://localhost/demo", "root", "test456");
        KoneksiDatabase kd5 = KoneksiDatabase.getKoneksiDatabase("jdbc:mysql://localhost/demo", "root", "test777");
        
        System.out.println("kd1 == kd2 : "+ (kd1 == kd2));
        System.out.println("kd2 == kd3 : "+ (kd2 == kd3));
        System.out.println("kd3 == kd4 : "+ (kd3 == kd4));
        System.out.println("kd4 == kd5 : "+ (kd4 == kd5));
    }
}
