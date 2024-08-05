package com.basant.github.miu;

/**
 * Utility class for checking array properties.
 */
public class IsAllPossibilities {

    /**
     * Checks if the given array contains all numbers from 0 to a.length-1 inclusive.
     *
     * @param a the array to check
     * @return 1 if the array contains all numbers from 0 to a.length-1, otherwise 0
     */
    public static int isAllPossibilities(int[] a) {
        int len = a.length;

        // Return 0 for an empty array
        if (len == 0) return 0;

        boolean[] seen = new boolean[len];

        for (int value : a) {
            // If the value is out of the expected range, return 0
            if (value < 0 || value >= len) return 0;
            // Mark the value as seen
            seen[value] = true;
        }

        // Check if all values from 0 to len-1 have been seen
        for (boolean b : seen) {
            if (!b) return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("isAllPossibilities(new int[]{1, 2, 0, 3}): " + isAllPossibilities(new int[]{1, 2, 0, 3})); // Expected: 1
        System.out.println("isAllPossibilities(new int[]{3, 2, 1, 0}): " + isAllPossibilities(new int[]{3, 2, 1, 0})); // Expected: 1
        System.out.println("isAllPossibilities(new int[]{1, 2, 4, 3}): " + isAllPossibilities(new int[]{1, 2, 4, 3})); // Expected: 0
        System.out.println("isAllPossibilities(new int[]{0, 2, 3}): " + isAllPossibilities(new int[]{0, 2, 3})); // Expected: 0
        System.out.println("isAllPossibilities(new int[]{0}): " + isAllPossibilities(new int[]{0})); // Expected: 1
        System.out.println("isAllPossibilities(new int[]{}): " + isAllPossibilities(new int[]{})); // Expected: 0
    }
}
