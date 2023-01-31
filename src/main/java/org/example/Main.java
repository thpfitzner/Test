package org.example;

import org.example.enums.Company;

public class Main {
    public static void main(String[] args) {
        String name = Company.EBAY.name();
        int ordinal = Company.EBAY.ordinal();
        Company ebay = Company.valueOf("EBAY");
        Company[] values = Company.values();
        Object ebayObject = Company.valueOf(Company.class, "EBAY");
        System.out.println("Hello world!");
    }
}