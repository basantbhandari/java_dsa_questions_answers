package com.basant.github.miu;

import java.util.HashSet;

public class CompleteArrayChecker {
    /**
     * Function to check if an array is complete.
     * An array is defined to be complete if it meets the following conditions:
     * a) The array contains even numbers.
     * b) Let min be the smallest even number in the array.
     * c) Let max be the largest even number in the array.
     * d) min does not equal max.
     * e) All numbers between min and max are in the array.
     *
     * @param a - input array of integers
     * @return 1 if the array is complete, otherwise 0
     */
    public static int isComplete(int[] a) {
        // Step 1: Check if the array contains even numbers and find min and max even numbers
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean hasEven = false;
        HashSet<Integer> elements = new HashSet<>();

        for (int num : a) {
            elements.add(num);
            if (num % 2 == 0) {
                hasEven = true;
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }
        }

        // Condition (a): The array must contain even numbers
        if (!hasEven) {
            return 0;
        }

        // Condition (d): min does not equal max
        if (min == max) {
            return 0;
        }

        // Condition (e): All numbers between min and max are in the array
        for (int i = min + 1; i < max; i++) {
            if (!elements.contains(i)) {
                return 0;
            }
        }

        // If all conditions are met, the array is complete
        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        int[][] testCases = {
                {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7},  // Expected: 1
                {5, 7, 9, 13},                     // Expected: 0
                {2, 2},                            // Expected: 0
                {2, 6, 3, 4},                      // Expected: 0
                {2, 4, 6, 8, 10},                  // Expected: 0
                {1, 2, 3, 4, 5, 6, 7, 8},          // Expected: 1
                {10, 8, 6, 4, 2, 0}                // Expected: 0
        };

        // Running the test cases
        for (int[] testCase : testCases) {
            System.out.println("Array: " + java.util.Arrays.toString(testCase) + " -> isComplete: " + isComplete(testCase));
        }
    }
}
