package com.csclub.variables;

public class MutableImmutableDemo {

    // Mutable variable
    String valueOne = "Empty";

    // Immutable variable
    // Read-only variable
    final String valueTwo = "This is an immutable variable.";
    final String valueThree;

    public MutableImmutableDemo(String valueThree) {
        this.valueThree = valueThree;
    }

    void changValueForTheFirstTime() {
        valueOne = "Haha";
//        valueTwo = "Some value";
//        valueThree = "";
    }

    void changValueForSecondTime() {
        valueOne = "Hello";
    }

    public static void main(String[] args) {
        MutableImmutableDemo demo = new MutableImmutableDemo("Set value three from constructor");
        System.out.println(demo.valueOne);

        demo.changValueForTheFirstTime();
        System.out.println(demo.valueOne);

        demo.changValueForSecondTime();
        System.out.println(demo.valueOne);

        System.out.println(demo.valueTwo);
        System.out.println(demo.valueThree);
    }
}
