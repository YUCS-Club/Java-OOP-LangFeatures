package com.csculb.atm;

public class AtmDemo {

    public static void main(String[] args) {
        // User
        Atm monkeyAtm = new Atm("Mokey ATM", 250000);
        User userOne = new User("Su Thinzar Aung", monkeyAtm);
        userOne.withdraw(150000);
    }
}
