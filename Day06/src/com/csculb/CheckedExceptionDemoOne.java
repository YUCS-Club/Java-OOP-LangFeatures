package com.csculb;

public class CheckedExceptionDemoOne {

    public static void main(String[] args) {
        CheckedExceptionDemoOne demo = new CheckedExceptionDemoOne();
        demo.doWorkOne();
    }

    void doWorkOne() {
        doWorkTwo();
    }

    void doWorkTwo() {
        doWorkThree();
    }

    void doWorkThree() {
        try {
            doWorkFour();
        } catch (Exception e) {
            System.out.println("An error occurred");
        }
    }

    void doWorkFour() throws Exception {
        try {
            throw new ClassNotFoundException();
        } catch (Exception e) {
            System.out.println("Exception in doWorkFour()");
        }
    }

}
