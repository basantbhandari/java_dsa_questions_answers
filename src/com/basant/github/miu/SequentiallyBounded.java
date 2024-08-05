package com.basant.github.miu;

public class SequentiallyBounded {

    /**
     * Checks if the given array is sequentially-bounded.
     *
     * An array is sequentially-bounded if:
     * 1. It is in ascending order.
     * 2. Each value n occurs less than n times.
     *
     * @param a the integer array to be checked
     * @return 1 if the array is sequentially-bounded, otherwise 0
     */
    public static int isSequentiallyBounded(int[] a) {
        if (a.length == 0) {
            return 1; // An empty array is considered sequentially-bounded.
        }

        // Check if array is in ascending order and validate occurrences
        int currentCount = 0;
        int currentValue = a[0];

        for (int i = 0; i < a.length; i++) {
            // Check for negative numbers
            if (a[i] < 0) {
                return 0;
            }

            // Check for ascending order
            if (i > 0 && a[i] <= a[i - 1]) {
                return 0;
            }

            // Count occurrences of the current value
            if (a[i] == currentValue) {
                currentCount++;
            } else {
                // Validate the count for the previous value
                if (currentCount >= currentValue) {
                    return 0;
                }
                // Reset for the new value
                currentValue = a[i];
                currentCount = 1;
            }
        }

        // Validate the count for the last value
        if (currentCount >= currentValue) {
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isSequentiallyBounded(new int[]{0, 1}));          // Should return 0
        System.out.println(isSequentiallyBounded(new int[]{-1, 2}));         // Should return 0
        System.out.println(isSequentiallyBounded(new int[]{}));              // Should return 1
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 5}));   // Should return 1
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 2, 5})); // Should return 0
    }
}
