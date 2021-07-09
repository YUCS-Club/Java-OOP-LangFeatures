package com.csculb;

public class GenericDemo {

    public static void main(String[] args) {

//        Container<String> stringContainer = new Container();
//        stringContainer.setData("Hello");
//        String data = stringContainer.getData();
//        System.out.println(data);
//
//        Container<Integer> integerContainer = new Container();
//        integerContainer.setData(12);
//        System.out.println(integerContainer.getData());

        Pair p1 = new Pair(1, "Hello");
        Pair p2 = new Pair(false, 1);

        System.out.println(p1.getKey());
        System.out.println(p1.getValue());

        System.out.println(p2.getKey());
        System.out.println(p2.getValue());

        Container pairConatiner = new Container<Pair>();

        pairConatiner.setData(new Pair(0, "Konichiwa"));

        Pair pair = (Pair) pairConatiner.getData();

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
