package com.csclub.variables;

public class LaptopStore {

    public static void main(String[] args) {
        Laptop.metalName = "Aluminium";

        Laptop m1Laptop = new Laptop("Apple", 1200);

        Laptop thinkpad = new Laptop("Lenovo", 1400);

        m1Laptop.showSpec();
        thinkpad.showSpec();
    }
}
