package com.csculb.inheritance;

// Rectangle is a shape
// is-a relationship
public class Rectangle extends Shape {

    public Rectangle(double width, double height) {
        super(width, height);

//        System.out.println("Hello from Rectangle constructor");
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(12, 6);
        System.out.println(rect.calculateArea());;
    }

    public void something() {
        System.out.println("Hello something");
    }
}
