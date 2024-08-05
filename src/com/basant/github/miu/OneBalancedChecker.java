package com.basant.github.miu;

/**
 * This class contains a method to determine if an array is one-balanced.
 *
 * An array is defined as one-balanced if it starts with zero or more `1`s,
 * followed by zero or more non-`1`s, and ends with zero or more `1`s.
 *
 * The method `isOneBalanced` checks if the array follows this pattern and
 * returns 1 if it is one-balanced, otherwise it returns 0.
 *
 * Example cases:
 * - If the array is {1, 1, 1, 2, 3, -18, 45, 1}, the method returns 1 because
 *   it starts with `1`s, followed by non-`1`s, and ends with `1`.
 * - If the array is {1, 1, 2, 3, 1, -18, 26, 1}, the method returns 0 because
 *   there are two sequences of non-`1`s.
 * - If the array is {3, 3, 3, 3, 3, 3}, the method returns 0 because there
 *   are no `1`s at the beginning or end, which does not match the required pattern.
 */
public class OneBalancedChecker {

    /**
     * Checks if the given array is one-balanced.
     *
     * @param a the array to check
     * @return 1 if the array is one-balanced, otherwise 0
     */
    public static int isOneBalanced(int[] a) {
        if (a.length == 0) {
            return 1; // An empty array is one-balanced
        }

        int i = 0;
        int countOnesStart = 0;
        int countNonOnes = 0;
        int countOnesEnd = 0;

        // Count leading 1s
        while (i < a.length && a[i] == 1) {
            countOnesStart++;
            i++;
        }

        // Count non-1s
        boolean hasNonOnes = false;
        while (i < a.length && a[i] != 1) {
            hasNonOnes = true;
            countNonOnes++;
            i++;
        }

        // Count trailing 1s
        while (i < a.length && a[i] == 1) {
            countOnesEnd++;
            i++;
        }

        // If we have traversed the whole array, check the condition
        if (i == a.length) {
            return (countOnesStart + countOnesEnd == countNonOnes) ? 1 : 0;
        }

        // If we did not traverse the whole array, it means there's an invalid part
        return 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1})); // Expected output: 1
        System.out.println(isOneBalanced(new int[]{1, 1, 2, 3, 1, -18, 26, 1})); // Expected output: 0
        System.out.println(isOneBalanced(new int[]{})); // Expected output: 1
        System.out.println(isOneBalanced(new int[]{3, 4, 1, 1})); // Expected output: 1
        System.out.println(isOneBalanced(new int[]{1, 1, 3, 4})); // Expected output: 1
        System.out.println(isOneBalanced(new int[]{3, 3, 3, 3, 3, 3})); // Expected output: 0
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 1, 1, 1})); // Expected output: 0
    }
}
