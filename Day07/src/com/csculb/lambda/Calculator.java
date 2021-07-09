package com.csculb.lambda;

public class Calculator {

    private final double n1;
    private final double n2;

    public Calculator(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double calculate(Calculatable calculatable) {
        return calculatable.calculate(n1, n2);
    }
}
