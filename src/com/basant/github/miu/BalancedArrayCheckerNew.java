package com.basant.github.miu;

public class BalancedArrayCheckerNew {

    /**
     * Function to check if an array is balanced.
     * An array is balanced if:
     * - Even-numbered elements (a[0], a[2], etc.) are even.
     * - Odd-numbered elements (a[1], a[3], etc.) are odd.
     *
     * @param a - input array of integers
     * @return 1 if the array is balanced, otherwise 0
     */
    public static int isBalanced(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                // Even-indexed elements must be even
                if (a[i] % 2 != 0) {
                    return 0;
                }
            } else {
                // Odd-indexed elements must be odd
                if (a[i] % 2 == 0) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        int[][] testCases = {
                {2, 3, 6, 7},         // Expected: 1
                {6, 7, 2, 3, 12},    // Expected: 1
                {7, 15, 2, 3},       // Expected: 0
                {16, 6, 2, 3},       // Expected: 0
                {2, 1, 4, 3, 6}      // Expected: 1
        };

        // Running the test cases
        for (int[] testCase : testCases) {
            System.out.println("Array: " + java.util.Arrays.toString(testCase) + " -> isBalanced: " + isBalanced(testCase));
        }
    }
}
