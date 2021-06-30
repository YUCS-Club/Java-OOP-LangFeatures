package com.csculb.inheritance;

public class Square extends Shape {

    private double width;

    public Square(double width) {
        super(4, "");

        this.width = width;
    }

    @Override // Annotation
    double area() {
        return width * width;
    }

    @Override
    double volume() {
        return width * width * width;
    }

    public void printNicely() {
        System.out.println("This is a square.");
        System.out.println("Square has " + numberOfSides + " sides.");
        System.out.println("Volume: " + volume());
        System.out.println("Area: " + area());
    }
}
