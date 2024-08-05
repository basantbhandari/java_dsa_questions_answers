package com.basant.github.miu;

/**
 * Utility class for checking array properties.
 */
public class IsLayered {

    /**
     * Checks if the given array is layered.
     *
     * An array is called layered if its elements are in ascending order and each element appears two or more times.
     *
     * @param a the array to check
     * @return 1 if the array is layered, otherwise 0
     */
    public static int isLayered(int[] a) {
        int len = a.length;

        // Return 0 for an empty array or an array with only one element
        if (len < 2) return 0;

        // Initialize the counter for the current element count
        int currentElement = a[0];
        int count = 1;

        for (int i = 1; i < len; i++) {
            if (a[i] == currentElement) {
                count++;
            } else {
                if (count < 2) return 0; // If the previous element didn't appear at least twice
                if (a[i] < currentElement) return 0; // Check for ascending order
                currentElement = a[i];
                count = 1;
            }
        }

        // Final check for the last element sequence
        if (count < 2) return 0;

        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("isLayered(new int[]{1, 1, 2, 2, 2, 3, 3}): " + isLayered(new int[]{1, 1, 2, 2, 2, 3, 3})); // Expected: 1
        System.out.println("isLayered(new int[]{3, 3, 3, 3, 3, 3, 3}): " + isLayered(new int[]{3, 3, 3, 3, 3, 3, 3})); // Expected: 1
        System.out.println("isLayered(new int[]{1, 2, 2, 2, 3, 3}): " + isLayered(new int[]{1, 2, 2, 2, 3, 3})); // Expected: 0
        System.out.println("isLayered(new int[]{2, 2, 2, 3, 3, 1, 1}): " + isLayered(new int[]{2, 2, 2, 3, 3, 1, 1})); // Expected: 0
        System.out.println("isLayered(new int[]{2}): " + isLayered(new int[]{2})); // Expected: 0
        System.out.println("isLayered(new int[]{}): " + isLayered(new int[]{})); // Expected: 0
    }
}
