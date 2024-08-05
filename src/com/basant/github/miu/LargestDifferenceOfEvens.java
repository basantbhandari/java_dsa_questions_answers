package com.basant.github.miu;

public class LargestDifferenceOfEvens {

    /**
     * Returns the largest difference between even-valued elements in the array.
     * If there are fewer than 2 even numbers, returns -1.
     *
     * @param a the array of integers
     * @return the largest difference between even numbers or -1 if fewer than 2 even numbers
     */
    public static int largestDifferenceOfEvens(int[] a) {
        // Initialize variables to track the minimum and maximum even numbers
        Integer minEven = null;
        Integer maxEven = null;

        // Iterate through the array to find the minimum and maximum even numbers
        for (int num : a) {
            if (num % 2 == 0) { // Check if the number is even
                if (minEven == null || num < minEven) {
                    minEven = num;
                }
                if (maxEven == null || num > maxEven) {
                    maxEven = num;
                }
            }
        }

        // Check if we have at least two even numbers
        if (minEven != null && maxEven != null && !minEven.equals(maxEven)) {
            return maxEven - minEven;
        }

        // Return -1 if there are fewer than 2 even numbers
        return -1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(largestDifferenceOfEvens(new int[]{-2, 3, 4, 9})); // Expected output: 6
        System.out.println(largestDifferenceOfEvens(new int[]{1, 3, 5, 7}));  // Expected output: -1
        System.out.println(largestDifferenceOfEvens(new int[]{2, 4, 6, 8}));  // Expected output: 6
        System.out.println(largestDifferenceOfEvens(new int[]{5, 10}));       // Expected output: -1
        System.out.println(largestDifferenceOfEvens(new int[]{-1, -4, 0, 3})); // Expected output: 4
        System.out.println(largestDifferenceOfEvens(new int[]{}));            // Expected output: -1
    }
}
