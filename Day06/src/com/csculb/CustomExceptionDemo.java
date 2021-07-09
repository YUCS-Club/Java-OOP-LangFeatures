package com.csculb;

public class CustomExceptionDemo {

    public static void main(String[] args) {
        CustomExceptionDemo demo = new CustomExceptionDemo();
        demo.methodOne();
        System.out.println("Hello");
    }

    void methodOne() {
        try {
            methodTwo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void methodTwo() throws Exception {
        methodThree();
    }

    void methodThree() throws CustomException {
        throw new CustomException("Hahaha. I create an exception!");
    }
}
