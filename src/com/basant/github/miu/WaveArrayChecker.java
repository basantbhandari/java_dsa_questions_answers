package com.basant.github.miu;

public class WaveArrayChecker {

    /**
     * Determines if an array is a wave array.
     *
     * A wave array is defined as an array which does not contain two even numbers
     * or two odd numbers in adjacent locations. For example:
     * - {7, 2, 9, 10, 5} is a wave array because even and odd numbers alternate.
     * - {4, 11, 12, 1, 6} is a wave array because even and odd numbers alternate.
     * - {1, 0, 5} is a wave array because even and odd numbers alternate.
     * - {2} is a wave array because there are no adjacent elements to compare.
     *
     * Arrays that are not wave arrays:
     * - {2, 6, 3, 4} is not a wave array because the even numbers 2 and 6 are adjacent.
     * - {1, 3, 5, 7} is not a wave array because all numbers are odd.
     *
     * @param a - the input integer array
     * @return 1 if the array is a wave array, 0 otherwise
     */
    public static int isWave(int[] a) {
        if (a == null || a.length == 0) {
            return 0;
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (isEven(a[i]) == isEven(a[i + 1])) {
                return 0;
            }
        }

        return 1;
    }

    /**
     * Helper function to determine if a number is even.
     *
     * @param num - the integer number
     * @return true if num is even, false otherwise
     */
    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isWave(new int[]{7, 2, 9, 10, 5})); // Expected: 1
        System.out.println(isWave(new int[]{4, 11, 12, 1, 6})); // Expected: 1
        System.out.println(isWave(new int[]{1, 0, 5})); // Expected: 1
        System.out.println(isWave(new int[]{2})); // Expected: 1
        System.out.println(isWave(new int[]{2, 6, 3, 4})); // Expected: 0
        System.out.println(isWave(new int[]{1, 3, 5, 7})); // Expected: 0
    }
}
