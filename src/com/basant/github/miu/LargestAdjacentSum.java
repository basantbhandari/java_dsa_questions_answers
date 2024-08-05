package com.basant.github.miu;

public class LargestAdjacentSum {

    /**
     * Computes the largest sum of adjacent elements in an array.
     *
     * @param a The input array
     * @return The largest sum of adjacent elements
     */
    public static int largestAdjacentSum(int[] a) {
        if (a.length < 2) {
            throw new IllegalArgumentException("Array must contain at least 2 elements.");
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length - 1; i++) {
            int sum = a[i] + a[i + 1];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // Test cases
        int[] testArray1 = {1, 2, 3, 4};
        int[] testArray2 = {18, -12, 9, -10};
        int[] testArray3 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] testArray4 = {1, 1, 1, 1, 1, 2, 1, 1, 1};

        System.out.println("largestAdjacentSum(testArray1): " + largestAdjacentSum(testArray1));  // Expected: 7
        System.out.println("largestAdjacentSum(testArray2): " + largestAdjacentSum(testArray2));  // Expected: 6
        System.out.println("largestAdjacentSum(testArray3): " + largestAdjacentSum(testArray3));  // Expected: 2
        System.out.println("largestAdjacentSum(testArray4): " + largestAdjacentSum(testArray4));  // Expected: 3
    }
}
