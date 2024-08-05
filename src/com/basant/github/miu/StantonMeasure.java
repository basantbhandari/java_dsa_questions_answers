package com.basant.github.miu;

/**
 * The StantonMeasure class provides a method to calculate the Stanton measure of an array.
 * The Stanton measure of an array is defined as the number of times the number of 1s
 * in the array appears as an element in the array.
 */
public class StantonMeasure {

    /**
     * Calculates the Stanton measure of an array.
     *
     * The Stanton measure is computed as follows:
     * 1. Count the number of occurrences of the number 1 in the array. Let this count be `n`.
     * 2. Count how many times `n` appears in the array.
     *
     * @param a An integer array.
     * @return The Stanton measure of the array.
     */
    static int stantonMeasure(int[] a) {
        int countOfOnes = 0;
        int stantonMeasure = 0;

        // Count the number of 1s in the array
        for (int num : a) {
            if (num == 1) {
                countOfOnes++;
            }
        }

        // Count how many times `countOfOnes` appears in the array
        for (int num : a) {
            if (num == countOfOnes) {
                stantonMeasure++;
            }
        }

        return stantonMeasure;
    }

    public static void main(String[] args) {
        // Test case: {1}
        // There is 1 occurrence of the number 1 in the array, so `n` is 1.
        // The number 1 appears 1 time in the array.
        // Hence, the Stanton measure is 1.
        System.out.println(stantonMeasure(new int[]{1})); // 1

        // Test case: {0}
        // There are 0 occurrences of the number 1 in the array, so `n` is 0.
        // The number 0 appears 1 time in the array.
        // Hence, the Stanton measure is 1.
        System.out.println(stantonMeasure(new int[]{0})); // 1

        // Test case: {3, 1, 1, 4}
        // There are 2 occurrences of the number 1 in the array, so `n` is 2.
        // The number 2 does not appear in the array.
        // Hence, the Stanton measure is 0.
        System.out.println(stantonMeasure(new int[]{3, 1, 1, 4})); // 0

        // Test case: {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}
        // There are 3 occurrences of the number 1 in the array, so `n` is 3.
        // The number 3 appears 6 times in the array.
        // Hence, the Stanton measure is 6.
        System.out.println(stantonMeasure(new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4})); // 6

        // Test case: {}
        // There are 0 occurrences of the number 1 in the array, so `n` is 0.
        // The number 0 does not appear in the array.
        // Hence, the Stanton measure is 0.
        System.out.println(stantonMeasure(new int[]{})); // 0
    }
}
