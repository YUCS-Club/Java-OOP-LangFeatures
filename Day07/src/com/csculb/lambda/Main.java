package com.csculb.lambda;

public class Main {

    public static void main(String[] args) {

        // f(x) = 2x
        // f(1) = 2 x 1 = 2
        // f(2) = 2 x 2 = 4
        Clickable clickable = (something) -> {
            String prefix = "[ON CLICK]";
            System.out.println(something);
        };

        clickable.click("Hello Lambda Expression");


        Clickable anotherClickable = new Clickable() {
            @Override
            public void click(String something) {
                String prefix = "[ANOTHER CLICK]";
                System.out.println(something);
            }
        };

        anotherClickable.click("Hello Again!");
    }
}
