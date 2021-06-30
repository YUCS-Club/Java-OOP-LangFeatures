package com.csculb.composition;

public class CompositionDemo {

    public static void main(String[] args) {

        GameItem koKyaw = new Wukong("New Generation Wukong", "Eating banana");
        koKyaw.controller.moveLeft();
        koKyaw.controller.moveLeft();
        koKyaw.controller.moveTop();
        koKyaw.controller.moveRight();
        koKyaw.controller.moveRight();
        koKyaw.controller.moveBottom();

        GameItem joker = new Joker("Joker", "His laugh though!");
        joker.controller.moveBottom();
        joker.controller.moveBottom();
        joker.controller.moveBottom();
        joker.controller.moveTop();
        joker.controller.moveRight();
        joker.controller.moveRight();
    }
}
