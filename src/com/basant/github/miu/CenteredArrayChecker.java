package com.basant.github.miu;

public class CenteredArrayChecker {

    /**
     * Function to check if an array is centered.
     * An array is centered if:
     * - It has an odd number of elements.
     * - All elements (except the middle one) are strictly greater than the middle element.
     *
     * @param a - input array of integers
     * @return 1 if the array is centered, otherwise 0
     */
    public static int isCentered(int[] a) {
        int len = a.length;

        // Check if the array length is odd
        if (len % 2 == 0 || len == 0) {
            return 0;
        }

        int middleIndex = len / 2;
        int middleElement = a[middleIndex];

        // Check if all elements except the middle one are strictly greater than the middle element
        for (int i = 0; i < len; i++) {
            if (i != middleIndex && a[i] <= middleElement) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        int[][] testCases = {
                {5, 3, 3, 4, 5},       // Expected: 0
                {3, 2, 1, 4, 5},       // Expected: 1
                {3, 2, 1, 4, 1},       // Expected: 0
                {3, 2, 1, 1, 4, 6},    // Expected: 0
                {},                    // Expected: 0
                {1}                    // Expected: 1
        };

        // Running the test cases
        for (int[] testCase : testCases) {
            System.out.println("Array: " + java.util.Arrays.toString(testCase) + " -> isCentered: " + isCentered(testCase));
        }
    }
}
