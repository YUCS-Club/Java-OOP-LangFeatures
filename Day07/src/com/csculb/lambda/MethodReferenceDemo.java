package com.csculb.lambda;

public class MethodReferenceDemo {

    public static void main(String[] args) {

//        Flyable flyable = message -> System.out.println(message);

//        Flyable anotherFlyable = MethodReferenceDemo::printMessage;
//        anotherFlyable.fly("Monkey is flying");

        MethodReferenceDemo demo = new MethodReferenceDemo();
        Flyable objRefFlyable = demo::objectReferencePrint;
        objRefFlyable.fly("Object reference demo");
    }

    static String printMessage(String str) {
        System.out.println(str);
        return  str;
    }

    String objectReferencePrint(String str) {
        System.out.println(str);
        return  str;
    }
}

@FunctionalInterface
interface Flyable {

    String fly(String message);
}