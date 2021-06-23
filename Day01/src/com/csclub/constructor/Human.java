package com.csclub.constructor;

public class Human {

    String name;
    int age;

    // Constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Human mgmg = new Human("Mg Mg Zaw Myint", 20);
        System.out.println(mgmg.name);
        System.out.println(mgmg.age);
    }
}
