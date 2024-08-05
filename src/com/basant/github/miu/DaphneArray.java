package com.basant.github.miu;

public class DaphneArray {

    /**
     * Checks if the given array is a Daphne array.
     * A Daphne array contains either all odd numbers or all even numbers.
     *
     * @param a The input array of integers.
     * @return 1 if the array is a Daphne array, otherwise 0.
     */
    public static int isDaphne(int[] a) {
        if (a.length == 0) {
            return 1; // An empty array is considered a Daphne array
        }

        boolean allEven = true;
        boolean allOdd = true;

        // Check if all numbers are even or all numbers are odd
        for (int num : a) {
            if (num % 2 == 0) {
                allOdd = false; // Found an even number
            } else {
                allEven = false; // Found an odd number
            }
        }

        // If all numbers are either even or odd, return 1, otherwise 0
        if (allEven || allOdd) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isDaphne(new int[]{2, 4, 2})); // Expected output: 1 (all even)
        System.out.println(isDaphne(new int[]{1, 3, 17, -5})); // Expected output: 1 (all odd)
        System.out.println(isDaphne(new int[]{3, 2, 5})); // Expected output: 0 (mixed)
        System.out.println(isDaphne(new int[]{})); // Expected output: 1 (empty array)
    }
}
