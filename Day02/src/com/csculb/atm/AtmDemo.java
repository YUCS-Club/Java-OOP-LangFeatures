package com.csculb.atm;

public class AtmDemo {

    public static void main(String[] args) {
        // User
        Atm monkeyAtm = new Atm("Mokey ATM", 250000, "Su Thinzar Aung");
        User userOne = new User("Su Thinzar Aung", monkeyAtm);
        String username = userOne.getName();
        userOne.withdraw(150000);
    }
}
