package com.csculb.watertank;

public class WaterBottle {

    // Let the unit is ML.
    private double currentAmount = 500;

    public void drink(double drinkingAmount) {
        System.out.println("Before drinking, current amount is " + currentAmount);
        if (currentAmount < drinkingAmount) {
            System.out.println("Not enough water.");
            System.out.println("You can only drink: " + currentAmount);
            double insufficientAmount = drinkingAmount - currentAmount;
            System.out.println("You need to buy: " + insufficientAmount + "ML of water");
        } else {
            System.out.println("Drinking " + drinkingAmount + " amount of water");
            currentAmount -= drinkingAmount;
            System.out.println("Current amount: " + currentAmount);
        }
    }
}
