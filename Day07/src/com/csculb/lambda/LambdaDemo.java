package com.csculb.lambda;

public class LambdaDemo {

    public static void main(String[] args) {
        Calculator calc = new Calculator(12, 13);

        Double sum1 = calc.calculate((n1, n2) -> n1 + n2);
        System.out.println(sum1);

//        calc.calculate(new Calculatable() {
//            @Override
//            public double calculate(double n1, double n2) {
//                return 0;
//            }
//        });
    }
}
