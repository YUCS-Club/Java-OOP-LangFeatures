package com.csclub.constructor;

/*
 * Student ဆိုတဲ့ class တစ်ခုဆောက်ပေးပါ။
 * Student ထဲမှာ ဘာတွေပါမလဲဆိုရင် name, age, grade, address
 * Constructor ၃ ခု ဆောက်ပေးပါ။ Default constructor တစ်ခုပါရမယ်။
 * Student ကို object ဆောက်ပါ။
 * Name နဲ့ grade ကို ထုတ်ပြပါ။
 * */

public class Student {

    String name;
    int age;
    String grade;
    String address;

    // Default constructor
    public Student() {
        System.out.println("Student()");
    }

    public Student(String name, int age, String grade, String address) {
        System.out.println("Student(String name, int age, String grade, String address)");
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.address = address;
    }

    public Student(String name, String grade) {
        System.out.println("Student(String name, String grade)");
        this.name = name;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student zawzaw = new Student("Zaw Zaw", "B");

        Student susu = new Student("Su Su", 12, "A", "Yangon");

        Student thura = new Student();
    }
}
