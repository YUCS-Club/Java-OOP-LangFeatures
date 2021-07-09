package com.csculb;

public class StackoverflowException {

    public static void main(String[] args) {
        StackoverflowException demo = new StackoverflowException();
        demo.methodOne();
    }

    void methodOne() {
        methodTwo();
    }

    void methodTwo() {
        methodOne();
    }
}
