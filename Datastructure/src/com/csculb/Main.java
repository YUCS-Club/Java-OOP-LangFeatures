package com.csculb;

public class Main {

    public static void main(String[] args) {
        ArrayRotation rotation = new ArrayRotation();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] rotatedArr = rotation.rotateLeft(array, 2, 8);

        for (int i : rotatedArr) {
            System.out.println(i);
        }
    }
}
