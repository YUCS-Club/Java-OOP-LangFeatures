package com.csculb.inheritance;

// Shape <- Rectangle <- Square
public class Square extends Rectangle {

    public Square(double width, double height) {
        super(width, height);

    }

    public static void main(String[] args) {
        Square square = new Square(5, 5);
        double area = square.calculateArea();
        System.out.println(area);
        square.something();
    }
}
