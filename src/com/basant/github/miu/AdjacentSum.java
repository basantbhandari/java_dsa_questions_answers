package com.basant.github.miu;

public class AdjacentSum {

    /**
     * Computes the sum of adjacent elements in the array and returns the largest such sum.
     * Assumes that the array has at least 2 elements.
     *
     * @param a the array to process
     * @return the largest sum of adjacent elements
     */
    public static int largestAdjacentSum(int[] a) {
        // Initialize the largest sum to the sum of the first pair of adjacent elements
        int largestSum = a[0] + a[1];

        // Iterate through the array, computing the sum of each pair of adjacent elements
        for (int i = 1; i < a.length - 1; i++) {
            int currentSum = a[i] + a[i + 1];
            if (currentSum > largestSum) {
                largestSum = currentSum;
            }
        }

        return largestSum;
    }

    public static void main(String[] args) {
        // Example usage and test cases
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println(largestAdjacentSum(array1)); // Output should be: 9

        int[] array2 = {18, -12, 9, 6, 3};
        System.out.println(largestAdjacentSum(array2)); // Output should be: 15

        int[] array3 = {10, 20, 30, 40, 50};
        System.out.println(largestAdjacentSum(array3)); // Output should be: 90
    }
}
