package com.csculb.abstraction;

// Implementation class
public class Honda extends Car {

    final String modelNo;

    public Honda(String modelNo) {
        this.modelNo = modelNo;

        setModelNo(this.modelNo);
    }

    @Override
    void pressCarHorn() {
        System.out.println("TTT");
    }

    @Override
    void drive() {
        System.out.println("Honda " + getModelNo() + " is driving.");
    }

    @Override
    void drift() {

    }

    void fly() {
        System.out.println("I can fly");
    }
}
