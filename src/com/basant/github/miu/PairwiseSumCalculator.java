package com.basant.github.miu;

/**
 * Class PairwiseSumCalculator contains methods for array manipulations.
 */
public class PairwiseSumCalculator {

    /**
     * Computes the pairwise sums of the elements in the input array.
     *
     * An array with an even number of elements is given. This method returns an
     * array containing the sums of successive pairs of elements from the input array.
     * If the input array has an odd number of elements or is empty, the method returns null.
     *
     * For example:
     * - If the input array is {2, 1, 18, -5}, the output will be {3, 13} because
     *   2+1=3 and 18+-5=13.
     * - If the input array is {2, 1, 18, -5, -5, -15, 0, 0, 1, -1}, the output
     *   will be {3, 13, -20, 0, 0} because 2+1=3, 18+-5=13, -5+-15=-20, 0+0=0,
     *   and 1+-1=0.
     * - If the input array has an odd number of elements or is empty, the method
     *   returns null.
     *
     * @param a The input array with an even number of elements.
     * @return An array with the pairwise sums of the input array elements, or null
     *         if the input array has an odd number of elements or is empty.
     */
    public static int[] pairwiseSum(int[] a) {
        // Check if the array is null or has an odd number of elements
        if (a == null || a.length == 0 || a.length % 2 != 0) {
            return null;
        }

        int len = a.length;
        int[] result = new int[len / 2];

        // Compute pairwise sums
        for (int i = 0; i < len; i += 2) {
            result[i / 2] = a[i] + a[i + 1];
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int[] test1 = {2, 1, 18, -5};
        int[] test2 = {2, 1, 18, -5, -5, -15, 0, 0, 1, -1};
        int[] test3 = {2, 1, 18};
        int[] test4 = {};

        // Execute tests
        printArray("Test 1:", pairwiseSum(test1));  // Expected: {3, 13}
        printArray("Test 2:", pairwiseSum(test2));  // Expected: {3, 13, -20, 0, 0}
        printArray("Test 3:", pairwiseSum(test3));  // Expected: null
        printArray("Test 4:", pairwiseSum(test4));  // Expected: null
    }

    /**
     * Utility method to print the contents of an array.
     *
     * @param label A label to print before the array.
     * @param array The array to print.
     */
    private static void printArray(String label, int[] array) {
        System.out.print(label + " ");
        if (array == null) {
            System.out.println("null");
        } else {
            System.out.print("{");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
    }
}
