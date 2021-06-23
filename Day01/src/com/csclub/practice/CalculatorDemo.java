package com.csclub.practice;

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(12, 23);
        double sum = calculator.sum();
        double multiply = calculator.multiply();
        double subtract = calculator.subtract();
        double division = calculator.divide();
        double remainder = calculator.remainder();

        Calculator myCalculator = new Calculator(20, 22);

//        System.out.println("Sum: " + sum);
//        System.out.println("Multiply: " + multiply);
//        System.out.println("Subtract: " + subtract);
//        System.out.println("Division: " + division);
//        System.out.println("Remainder: " + remainder);
//
//        System.out.println("Number one: " + calculator.getNumberOne());
//        System.out.println("Number two: " + calculator.getNumberTwo());

        NetworkManager manager = new NetworkManager();
        manager.fetchUserNames();
    }
}
