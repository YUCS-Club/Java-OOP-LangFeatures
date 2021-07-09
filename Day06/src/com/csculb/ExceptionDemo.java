package com.csculb;

public class ExceptionDemo {

    String[] fruits = {"Apple", "Banana", "Mango"};

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.methodOne();
        System.out.println("Hello");
    }

    void methodOne() {
        methodTwo();
    }

    void methodTwo() {
        methodThree();
    }

    void methodThree() throws IndexOutOfBoundsException {
        String fruit = fruits[3];
    }
}
