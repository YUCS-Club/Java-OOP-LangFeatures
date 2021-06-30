package com.csculb.composition;

public class GameController {

    String itemName;

    public GameController(String itemName) {
        this.itemName = itemName;
    }

    void moveLeft() {
        System.out.println(itemName + " is moving left.");
    }

    void moveRight() {
        System.out.println(itemName + " is moving right.");
    }

    void moveTop() {
        System.out.println(itemName + " is moving up to the heaven.");
    }

    void moveBottom() {
        System.out.println(itemName + " is moving bottom.");
    }
}
