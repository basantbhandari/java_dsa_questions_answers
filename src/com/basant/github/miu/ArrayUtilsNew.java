package com.basant.github.miu;

/**
 * Class ArrayUtils contains utility methods for array operations.
 */
public class ArrayUtilsNew {

    /**
     * Sums n elements of the array starting at the beginning of the array.
     * If n is greater than the number of elements in the array, the function
     * loops back to the beginning of the array and continues summing until it
     * has summed n elements.
     *
     * @param a The array of integers.
     * @param n The number of elements to sum.
     * @return The sum of n elements of the array.
     */
    public static int loopSum(int[] a, int n) {
        int sum = 0;
        int len = a.length;

        for (int i = 0; i < n; i++) {
            sum += a[i % len];
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("loopSum({1, 2, 3}, 2): " + loopSum(new int[]{1, 2, 3}, 2)); // Expected: 3
        System.out.println("loopSum({-1, 2, -1}, 7): " + loopSum(new int[]{-1, 2, -1}, 7)); // Expected: -1
        System.out.println("loopSum({1, 4, 5, 6}, 4): " + loopSum(new int[]{1, 4, 5, 6}, 4)); // Expected: 16
        System.out.println("loopSum({3}, 10): " + loopSum(new int[]{3}, 10)); // Expected: 30
    }
}
