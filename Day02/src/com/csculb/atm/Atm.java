package com.csculb.atm;

public class Atm {
    // name
    final String name;

    // current money
    double currentMoney;

    final String username;

    // capacity
    double maxAmount = 1_000_000.0;
    // max_transition_amount
    double maxTransitionAmount = 100_000.0;

    public Atm(String name, double depositAmount, String username) {
        this.name = name;
        this.username = username;

        if (depositAmount > maxAmount) {
            this.currentMoney = maxAmount;
        } else {
            this.currentMoney = depositAmount;
        }

        System.out.println("Welcome from " + name);
        System.out.println(username + "'s account have " + depositAmount + "MMK.");
    }

    // deposit()
    void deposit(double amount) {
        double amountAfterDeposit = currentMoney + amount;

        if (amountAfterDeposit > maxAmount) {
            System.out.println("Sorry. The ATM can't handle that much amount.");
        } else {
            System.out.println("Deposit: " + amount);
            System.out.println("Before deposit: " + currentMoney);
            currentMoney += amount;
            System.out.println("After deposit: " + currentMoney);
        }
    }

    // withdraw()
    void withdraw(double amount) {
        if (maxTransitionAmount < amount) {
            System.out.println("Cannot withdraw " + amount + ". Instead, you can withdraw up to " + maxTransitionAmount + " only.");
            currentMoney -= maxTransitionAmount;
            System.out.println("You have withdraw " + maxTransitionAmount);
            System.out.println("You have left  " + currentMoney + "MMK.");
        } else {
            if (currentMoney < amount) {
                System.out.println("You only have " + currentMoney + "MMK.");
                System.out.println("You don't have enough balance to withdraw " + amount + "MMK.");
            } else {
                currentMoney -= amount;
                System.out.println("You have withdraw: " + amount + "MMK.");
                System.out.println("You balance is now: " + currentMoney + "MMK.");
            }
        }
    }

}
