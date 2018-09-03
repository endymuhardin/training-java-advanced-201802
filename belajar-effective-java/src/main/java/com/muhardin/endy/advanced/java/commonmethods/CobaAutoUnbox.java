package com.muhardin.endy.advanced.java.commonmethods;

public class CobaAutoUnbox {

    public static void main(String[] args) {
        int hasilPrimitif = compare(42, 42);
        System.out.println("42 vs 42 : "+hasilPrimitif);
        
        int hasilObject = compare(new Integer(42), new Integer(42));
        System.out.println("new Integer(42) vs new Integer(42) : "+hasilObject);
    }

    public static int compare(Integer i, Integer j) {
        if (i < j) {
            return -1;
        } else {
            if (i == j) {
                return 0;
            } else {
                return 1;
            }
        }

    }
}