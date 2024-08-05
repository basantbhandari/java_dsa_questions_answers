package com.basant.github.miu;

public class ArrayChecker {

    /**
     * Checks if an array is a 121 array.
     * An array is defined to be a 121 array if all its elements are either 1 or 2,
     * it begins with one or more 1s followed by one or more 2s and then ends with
     * the same number of 1s that it begins with.
     *
     * @param a the array to check
     * @return 1 if the array is a 121 array, otherwise 0
     */
    public static int is121Array(int[] a) {
        int len = a.length;
        if (len == 0) return 0;

        int startOnes = 0;
        int endOnes = 0;
        int index = 0;

        // Count the starting 1s
        while (index < len && a[index] == 1) {
            startOnes++;
            index++;
        }

        // Ensure there is at least one 2 following the 1s
        if (index >= len || a[index] != 2) {
            return 0;
        }

        // Traverse the 2s
        while (index < len && a[index] == 2) {
            index++;
        }

        // Count the ending 1s
        while (index < len && a[index] == 1) {
            endOnes++;
            index++;
        }

        // Check if we have traversed the entire array and the number of starting and ending 1s are the same
        if (index == len && startOnes == endOnes && startOnes > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Example usage and test cases
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 1, 1})); // Should return 1
        System.out.println(is121Array(new int[]{1, 2, 1}));         // Should return 1
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 1}));   // Should return 1
        System.out.println(is121Array(new int[]{1, 2, 2, 1}));      // Should return 1
        System.out.println(is121Array(new int[]{2, 1, 2, 1}));      // Should return 0
        System.out.println(is121Array(new int[]{1, 2, 2, 2, 1}));   // Should return 0
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2}));   // Should return 0
        System.out.println(is121Array(new int[]{1, 2, 1, 2, 1}));   // Should return 0
    }
}
