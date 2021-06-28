package com.csculb.inheritance;

public class Shape {

    double width;
    double height;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;

//        System.out.println("Hello from Shape constructor");
    }

    double calculateArea() {
        return width * height;
    }
}
