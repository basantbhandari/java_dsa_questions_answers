package com.basant.github.miu;

public class Centered15 {

    /**
     * Checks if the array is centered-15.
     * An array is centered-15 if some consecutive sequence of elements of the array sums to 15
     * and this sequence is preceded and followed by the same number of elements.
     *
     * @param a the array to check.
     * @return 1 if the array is centered-15, otherwise 0.
     */
    public static int isCentered15(int[] a) {
        int n = a.length;  // Length of the array

        // Iterate over each possible starting point of the subsequence
        for (int start = 0; start < n; start++) {
            int sum = 0;  // Initialize sum of the subsequence

            // Calculate the sum of the subsequence ending at each possible point
            for (int end = start; end < n; end++) {
                sum += a[end];  // Add the current element to the sum

                // Check if the sum equals 15
                if (sum == 15) {
                    int leftSide = start;         // Number of elements before the subsequence
                    int rightSide = n - end - 1;  // Number of elements after the subsequence

                    // Check if the number of elements before and after the subsequence are equal
                    if (leftSide == rightSide) {
                        return 1;  // Found a centered-15 subsequence
                    }
                }
            }
        }

        return 0;  // No centered-15 subsequence found
    }

    public static void main(String[] args) {
        // Test cases with explanations
        int[] test1 = {3, 2, 10, 4, 1, 6, 9};
        System.out.println("Test {3, 2, 10, 4, 1, 6, 9}: " + isCentered15(test1)); // Expected: 1

        int[] test2 = {2, 10, 4, 1, 6, 9};
        System.out.println("Test {2, 10, 4, 1, 6, 9}: " + isCentered15(test2));    // Expected: 0

        int[] test3 = {3, 2, 10, 4, 1, 6};
        System.out.println("Test {3, 2, 10, 4, 1, 6}: " + isCentered15(test3));    // Expected: 0

        int[] test4 = {1, 1, 8, 3, 1, 1};
        System.out.println("Test {1, 1, 8, 3, 1, 1}: " + isCentered15(test4));     // Expected: 1

        int[] test5 = {9, 15, 6};
        System.out.println("Test {9, 15, 6}: " + isCentered15(test5));             // Expected: 1

        int[] test6 = {1, 1, 2, 2, 1, 1};
        System.out.println("Test {1, 1, 2, 2, 1, 1}: " + isCentered15(test6));     // Expected: 0

        int[] test7 = {1, 1, 15, -1, -1};
        System.out.println("Test {1, 1, 15, -1, -1}: " + isCentered15(test7));     // Expected: 1
    }
}

