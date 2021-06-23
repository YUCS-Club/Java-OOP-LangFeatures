package com.csculb.atm;

public class User {

    private final String name;
    private final Atm atm;

    public User(String name, Atm atm) {
        this.name = name;
        this.atm = atm;
    }

    void deposit(double amount) {
        System.out.println(name + " is depositing " + amount + "MMK");
        atm.deposit(amount);
    }

    void withdraw(double amount) {
        System.out.println(name + " is withdrawing " + amount + "MMK");
        atm.withdraw(amount);
    }
}
