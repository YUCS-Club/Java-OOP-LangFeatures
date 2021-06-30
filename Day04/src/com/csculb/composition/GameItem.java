package com.csculb.composition;

public class GameItem {

    String itemName;
    String power;

    // Composition
    GameController controller;

    public GameItem(String itemName, String power) {
        this.itemName = itemName;
        this.power = power;

        controller = new GameController(this.itemName);
    }

}
