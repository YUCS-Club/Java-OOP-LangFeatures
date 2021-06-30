package com.csculb.inheritance;

// Rectangle is a shape
public class Rectangle extends Shape {

    private double width;
    private double length;
    private double height;

    public Rectangle(double width, double height, double length) {
        super(4, "");

        this.width = width;
        this.length = length;
        this.height = height;
    }

//    @Override // Annotation
//    double area() {
//        return width * height;
//    }

    @Override
    double volume() {
        return width * length * height;
    }

    public void printNicely() {
        System.out.println("This is a rectangle.");
        System.out.println("Rectangle has " + numberOfSides + " sides.");
        System.out.println("Volume: " + volume());
        System.out.println("Area: " + area());
    }
}
