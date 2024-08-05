package com.basant.github.miu;

import java.util.HashSet;

public class BalancedArrayChecker {

    /**
     * A balanced array is defined to be an array where for every value n in the array, -n also is in the array.
     *
     * Examples:
     * { -2, 3, 2, -3 } is a balanced array.
     * { -2, 2, 2, 2 } is a balanced array.
     * { -5, 2, -2 } is not a balanced array because 5 is not in the array.
     *
     * This function checks if the given array is a balanced array.
     *
     * @param a The input array of integers.
     * @return 1 if the array is a balanced array, otherwise 0.
     */
    public static int isBalanced(int[] a) {
        // Create a set to store the elements of the array
        HashSet<Integer> set = new HashSet<>();

        // Add all elements to the set
        for (int num : a) {
            set.add(num);
        }

        // Check if for every element n in the array, -n is also present
        for (int num : a) {
            if (!set.contains(-num)) {
                return 0; // -n not found in the array
            }
        }

        return 1; // All elements have their negations in the array
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isBalanced(new int[]{-2, 3, 2, -3})); // Expected output: 1
        System.out.println(isBalanced(new int[]{-2, 2, 2, 2})); // Expected output: 1
        System.out.println(isBalanced(new int[]{-5, 2, -2})); // Expected output: 0
        System.out.println(isBalanced(new int[]{1, -1, 2, -2, 3, -3})); // Expected output: 1
        System.out.println(isBalanced(new int[]{1, 2, 3})); // Expected output: 0
    }
}
