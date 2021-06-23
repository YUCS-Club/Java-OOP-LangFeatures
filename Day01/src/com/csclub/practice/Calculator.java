package com.csclub.practice;

public class Calculator {

    // Immutable variable
    private final double numberOne;
    private final double numberTwo;

    public Calculator(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public double sum() {
        return  numberOne + numberTwo;
    }

    public double subtract() {
        return  numberOne - numberTwo;
    }

    public double multiply() {
        return  numberOne * numberTwo;
    }

    public double divide() {
        return  numberOne / numberTwo;
    }

    public double remainder() {
        return  numberOne % numberTwo;
    }

    public double getNumberOne() {
        return numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }
}
