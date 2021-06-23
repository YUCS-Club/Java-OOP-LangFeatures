package com.csclub.variables;

public class ScopeDemo {

    String someValue = "Some Value";

    public void methodOne() {
        someValue = "";
        int counter = 1;

        int [] numbers = {1, 2, 3, 4, 5};

        for(int num : numbers) {
            System.out.println(num);
        }
    }

    public void methodTwo() {
        someValue = "";
    }
}
