package com.basant.github.miu;


import java.util.HashMap;

/**
 * Determines if an array is zero-balanced.
 *
 * An array is considered zero-balanced if it satisfies the following conditions:
 * 1. The sum of all elements in the array is zero.
 * 2. For every positive element n in the array, there is an equal number of occurrences of -n.
 *
 * @param a The input array of integers.
 * @return 1 if the array is zero-balanced, otherwise 0.
 */
public class ZeroBalanced {

    /**
     * Checks if the given array is zero-balanced.
     *
     * @param a The array to check.
     * @return 1 if the array is zero-balanced, otherwise 0.
     */
    public static int isZeroBalanced(int[] a) {
        if (a.length == 0) {
            return 0; // An empty array is not zero-balanced.
        }

        int totalSum = 0;
        HashMap<Integer, Integer> counts = new HashMap<>();

        // Calculate the sum of the array and count occurrences
        for (int num : a) {
            totalSum += num;
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // If the sum is not zero, return 0
        if (totalSum != 0) {
            return 0;
        }

        // Check for every positive number if its negative counterpart exists
        for (int num : counts.keySet()) {
            if (num > 0) {
                if (counts.getOrDefault(num, 0) != counts.getOrDefault(-num, 0)) {
                    return 0;
                }
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isZeroBalanced(new int[]{1, 2, -2, -1}));  // Expected output: 1
        System.out.println(isZeroBalanced(new int[]{-3, 1, 2, -2, -1, 3}));  // Expected output: 1
        System.out.println(isZeroBalanced(new int[]{3, 4, -2, -3, -2}));  // Expected output: 0
        System.out.println(isZeroBalanced(new int[]{0, 0, 0, 0, 0, 0}));  // Expected output: 1
        System.out.println(isZeroBalanced(new int[]{3, -3, -3}));  // Expected output: 0
        System.out.println(isZeroBalanced(new int[]{3}));  // Expected output: 0
        System.out.println(isZeroBalanced(new int[]{}));  // Expected output: 0
    }
}
