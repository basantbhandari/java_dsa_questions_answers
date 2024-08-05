package com.basant.github.miu;

import java.util.HashSet;

/**
 * Utility class for array operations.
 */
public class ArrayUtilsNewNewNew {

    /**
     * Checks if the array contains exactly n different values.
     *
     * @param a the array of integers
     * @param n the number of different values to check for
     * @return 1 if the array contains exactly n different values, otherwise 0
     */
    public static int hasNValues(int[] a, int n) {
        // Use a HashSet to store unique values
        HashSet<Integer> uniqueValues = new HashSet<>();

        // Iterate through the array and add elements to the set
        for (int value : a) {
            uniqueValues.add(value);
            // If the number of unique values exceeds n, return 0
            if (uniqueValues.size() > n) {
                return 0;
            }
        }

        // Check if the number of unique values is exactly n
        return uniqueValues.size() == n ? 1 : 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("hasNValues({1, 2, 2, 1}, 2): " + hasNValues(new int[]{1, 2, 2, 1}, 2)); // Expected: 1
        System.out.println("hasNValues({1, 1, 1, 8, 1, 1, 1, 3, 3}, 3): " + hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 3)); // Expected: 1
        System.out.println("hasNValues({1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 10): " + hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 10)); // Expected: 1
        System.out.println("hasNValues({1, 2, 2, 1}, 3): " + hasNValues(new int[]{1, 2, 2, 1}, 3)); // Expected: 0
        System.out.println("hasNValues({1, 1, 1, 8, 1, 1, 1, 3, 3}, 2): " + hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 2)); // Expected: 0
        System.out.println("hasNValues({1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 20): " + hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 20)); // Expected: 0
    }
}
