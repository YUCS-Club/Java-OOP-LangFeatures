package com.csculb.inheritance;

import com.csculb.inheritance.Rectangle;
import com.csculb.inheritance.Square;

public class Main {

    public static void main(String[] args) {

//        Main.inheritanceDemo();
    }

    static void inheritanceDemo() {
        Rectangle rectangleOne = new Rectangle(4.5, 8.1, 3);
        rectangleOne.printNicely();

        Square squareOne = new Square(3);
        squareOne.printNicely();
    }
}
