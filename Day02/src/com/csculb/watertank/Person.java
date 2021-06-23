package com.csculb.watertank;

public class Person {

    private String name = ""; // new String("");

    // Encapsulation
    private final WaterBottle bottle;

    public Person(WaterBottle bottle) {
        this.bottle = bottle;
    }

    public void drink(double amount) {
        if (!name.isBlank()) {
            System.out.println(name + " is drinking.");
        }
        bottle.drink(amount);
    }

    public void setName(String name) {
        this.name = name;
    }
}
