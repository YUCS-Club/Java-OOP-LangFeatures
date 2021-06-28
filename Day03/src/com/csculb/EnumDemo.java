package com.csculb;

public class EnumDemo {

//    static int MON = 0;
//    static int TUE = 1;
//    static int WED = 2;
//    static int THU = 3;
//    static int FRI = 4;
//    static int SAT = 5;
//    static int SUN = 6;

    enum DaysOfWeek {
        MON, TUE, WED, THU, FRI, SAT, SUN
    }

    enum UserLevel {
        PLATINUM_USER, GOLD_USER, SILVER_USER, BRONZE_USER
    }

    void today(DaysOfWeek dow) {
        switch (dow) {
            case MON:
                System.out.println("Today is Monday!");
                break;
            case TUE:
                System.out.println("Today is Tuesday!");
                break;
            case WED:
                System.out.println("Today is Wednesday!");
                break;
            case THU:
                System.out.println("Today is Thursday!");
                break;
            case FRI:
                System.out.println("Today is Friday!");
                break;
            case SAT:
                System.out.println("Today is Saturday!");
                break;
            default:
                System.out.println("Today is Super Sunday!");
        }
    }

    public static void main(String[] args) {
        EnumDemo demo = new EnumDemo();
        demo.today(DaysOfWeek.FRI);
        System.out.println("It's TGIF.");
        System.out.println("Today's not my day though!");
    }
}
