package com.csculb.abstraction;

public abstract class Vehicle {

    private String modelNo;

    abstract void drive();

    void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    String getModelNo() {
        return modelNo;
    }
}
