package com.csculb.abstraction;

public class AbstractionDemo {

    public static void main(String[] args) {
        Vehicle car = new Honda("HD-1232");
        car.drive();

        Car castedCar = (Car) car;
        castedCar.pressCarHorn();
        castedCar.drift();

//        ((Car) car).pressCarHorn();

        Aeroplane bowin77 = new Bowin77();
        bowin77.setModelNo("77");
        System.out.println(bowin77.getModelNo());

        // Anonymous inner class
        Aeroplane airForceOne = new Aeroplane() {
            @Override
            void showLandingSignal() {
                System.out.println("Air force one is showing landing signal.");
            }

            @Override
            void drive() {
                System.out.println("Weeeeee");
            }
        };

        airForceOne.showLandingSignal();
    }
}
