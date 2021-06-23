package com.csculb;

public class ConstructorDemo {

    String value;
    int integerValue;
    boolean isInstantiated = false;

    // Constructor
    public ConstructorDemo() {
    }

    public ConstructorDemo(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        int i = 0;

        String str = new String("Hello world");

        // Instantiating an object
        ConstructorDemo demo = new ConstructorDemo("Eg");

        demo.integerValue = 1;
//        demo.value = "Eg";
        demo.isInstantiated = true;
        System.out.println("Hello from ConstructorDemo");
    }
}
