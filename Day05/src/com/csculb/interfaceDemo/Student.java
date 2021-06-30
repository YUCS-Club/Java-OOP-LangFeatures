package com.csculb.interfaceDemo;

public class Student implements Savable {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
