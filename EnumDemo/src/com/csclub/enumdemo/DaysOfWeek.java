package com.csclub.enumdemo;

public enum DaysOfWeek {

    // Constants
    SUN,
    MON("Monday"),
    TUE("Tuesday", "Tyr's day"),
    WED("Wednesday", "Day of the Woden"),
    THU("Thursday", "Thor's day", "The original meaning of Thursday comes from the Old English Þunresdæg, or Thor's day. Thor was the Germanic and Norse god of thunder. In Germany the same route leads to Donnerstag. Donner can be directly translated as thunder."),
    FRI,
    SAT;

    // States or variables
    String fullName;
    String meaning;
    String detailInfo;

    // Constructors

    DaysOfWeek() {
    }

    DaysOfWeek(String fullName) {
        this.fullName = fullName;
    }

    DaysOfWeek(String fullName, String meaning) {
        this.fullName = fullName;
        this.meaning = meaning;
    }

    DaysOfWeek(String fullName, String meaning, String detailInfo) {
        this.fullName = fullName;
        this.meaning = meaning;
        this.detailInfo = detailInfo;
    }

    // Behaviour or method
    void displayFullDetail() {

        if (fullName != null) {
            System.out.println(this.fullName + " aka " + this.name());
        } else {
            System.out.println(this.name());
        }

        if (meaning != null) {
            System.out.println("Behind the name: " + this.meaning);
        }

        if (detailInfo != null) {
            System.out.println("Detail: " + this.detailInfo);
        }

        System.out.println("--------------------------------\n");
    }
}
