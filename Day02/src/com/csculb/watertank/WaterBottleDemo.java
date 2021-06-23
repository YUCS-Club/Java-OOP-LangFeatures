package com.csculb.watertank;

public class WaterBottleDemo {

    public static void main(String[] args) {
        WaterBottle bottle = new WaterBottle();
        Person person = new Person(bottle);

//        person.name = "Ko Kyaw";
        person.setName("Ko Kyaw");
        person.drink(20.5);
    }
}
