package com.csclub.enumdemo;

public class EnumDemo {

    public static void main(String[] args) {
        DaysOfWeek today = DaysOfWeek.MON;
        today.displayFullDetail();

        DaysOfWeek thursday = DaysOfWeek.THU;
        thursday.displayFullDetail();
    }
}
