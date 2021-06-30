package com.csculb.interfaceDemo;

public class InterfaceDemo {

    public static void main(String[] args) {
        BaseRepository repo = new StudentRepository();
        Student studentOne = new Student("Lin Thant Zin", 20);
        Student studentTwo = new Student("Su Shoon Lae", 16);

        repo.save(studentOne);
        repo.save(studentTwo);
    }
}
