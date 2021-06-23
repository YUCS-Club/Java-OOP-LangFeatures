package com.csclub.variables;

import java.math.BigDecimal;

public class Laptop {

    static String metalName;

    private String companyName;
    private double price;

    public Laptop(String companyName, double price) {
        this.companyName = companyName;
        this.price = price;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getPrice() {
        return price;
    }

    void showSpec() {
        System.out.println("Company: " + companyName);
        System.out.println("Price: " + price);
    }

}
