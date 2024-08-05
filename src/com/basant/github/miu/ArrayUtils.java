package com.basant.github.miu;

import java.util.HashSet;

/**
 * Class ArrayUtils contains utility methods for array operations.
 */
public class ArrayUtils {

    /**
     * Checks if the given integer n is a perfect square.
     *
     * A number is considered a perfect square if there exists an integer k
     * such that n = k * k.
     *
     * @param n The integer to be checked.
     * @return 1 if n is a perfect square, otherwise 0.
     */
    public static int isSquare(int n) {
        // Check if n is negative, which cannot be a perfect square
        if (n < 0) {
            return 0;
        }

        // Special case for 0
        if (n == 0) {
            return 1;
        }

        int i = 0;
        while (i * i <= n) {
            if (i * i == n) {
                return 1; // n is a perfect square
            }
            i++;
        }

        return 0; // n is not a perfect square
    }

    /**
     * Checks if the given integer array is complete.
     *
     * An array is considered complete if it contains:
     * - An even number.
     * - A perfect square.
     * - Two different elements that sum to 8.
     *
     * @param a The integer array to be checked.
     * @return 1 if the array is complete, otherwise 0.
     */
    public static int isComplete(int[] a) {
        boolean hasEven = false;
        boolean hasPerfectSquare = false;
        boolean foundPair = false;

        // Use a set to track elements we've seen
        HashSet<Integer> seen = new HashSet<>();

        // First pass to check for even number and perfect square
        for (int num : a) {
            if (num % 2 == 0) {
                hasEven = true;
            }
            if (isSquare(num) == 1) {
                hasPerfectSquare = true;
            }
            // Check if a pair summing to 8 exists
            if (seen.contains(8 - num)) {
                foundPair = true;
            }
            seen.add(num);
        }

        // Return 1 if all conditions are met, otherwise 0
        if (hasEven && hasPerfectSquare && foundPair) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("isComplete({36, -28}): " + isComplete(new int[]{36, -28})); // Expected: 1
        System.out.println("isComplete({36, 28}): " + isComplete(new int[]{36, 28}));   // Expected: 0
        System.out.println("isComplete({4}): " + isComplete(new int[]{4}));             // Expected: 0
        System.out.println("isComplete({3, 2, 1, 1, 5, 6}): " + isComplete(new int[]{3, 2, 1, 1, 5, 6})); // Expected: 0
        System.out.println("isComplete({3, 7, 23, 13, 107, -99, 97, 81}): " + isComplete(new int[]{3, 7, 23, 13, 107, -99, 97, 81})); // Expected: 0
    }
}
