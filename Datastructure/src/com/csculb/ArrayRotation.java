package com.csculb;

public class ArrayRotation {

    int[] rotateLeft(int[] array, int d, int n) {
        int[] result = new int[n];

        for (int i = 0; i < d; i++) {
            int index = n - d + i;
            result[index] = array[i];
        }

        if (n - d >= 0)
            System.arraycopy(array, d, result, 0, n - d);

        return result;
    }
}
