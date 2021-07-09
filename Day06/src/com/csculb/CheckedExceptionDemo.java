package com.csculb;

import java.io.IOException;

public class CheckedExceptionDemo {

    public static void main(String[] args) {
        CheckedExceptionDemo demo = new CheckedExceptionDemo();

        // Exception handling
        try {
            demo.methodOne();
            System.out.println("Hello");
        } catch (IOException e) {
            e.printStackTrace();
//            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {

        } catch (Exception e) {

        }

        System.out.println("Hello world");
    }

    void methodOne() throws IOException {
        methodTwo();
    }

    void methodTwo() throws IOException {
        methodThree();
//        try {
//            methodThree();
//        } catch (IOException e) {
//            System.out.println(e.getLocalizedMessage());
//        }
    }

    void methodThree() throws IOException {
        throw new IOException();
    }
}
