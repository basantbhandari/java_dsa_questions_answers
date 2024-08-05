package com.basant.github.miu;


/**
 * The SumFactor class provides a method to calculate the sum factor of an array.
 * The sum factor of an array is defined as the number of times the sum of the array
 * appears as an element in the array.
 */
public class SumFactor {

    /**
     * Calculates the sum factor of an array.
     *
     * The sum factor is computed as follows:
     * 1. Compute the sum of all elements in the array.
     * 2. Count how many times this sum appears as an element in the array.
     *
     * @param a An integer array.
     * @return The sum factor of the array.
     */
    static int sumFactor(int[] a) {
        int sum = 0;
        int sumFactor = 0;

        // Compute the sum of all elements in the array
        for (int num : a) {
            sum += num;
        }

        // Count how many times the sum appears in the array
        for (int num : a) {
            if (num == sum) {
                sumFactor++;
            }
        }

        return sumFactor;
    }

    public static void main(String[] args) {
        // Test case: {3, 0, 2, -5, 0}
        // The sum of the array is 0 and 0 occurs 2 times in the array.
        // Hence, the sum factor is 2.
        System.out.println(sumFactor(new int[]{3, 0, 2, -5, 0})); // 2

        // Test case: {9, -3, -3, -1, -1}
        // The sum of the array is 1 and 1 does not occur in the array.
        // Hence, the sum factor is 0.
        System.out.println(sumFactor(new int[]{9, -3, -3, -1, -1})); // 0

        // Test case: {1}
        // The sum of the array is 1 and 1 occurs 1 time in the array.
        // Hence, the sum factor is 1.
        System.out.println(sumFactor(new int[]{1})); // 1

        // Test case: {0, 0, 0}
        // The sum of the array is 0 and 0 occurs 3 times in the array.
        // Hence, the sum factor is 3.
        System.out.println(sumFactor(new int[]{0, 0, 0})); // 3
    }
}
