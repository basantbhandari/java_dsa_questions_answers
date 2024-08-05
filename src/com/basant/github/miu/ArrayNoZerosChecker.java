package com.basant.github.miu;

public class ArrayNoZerosChecker {

    /**
     * Checks if all elements of the given array are non-zero.
     *
     * @param a the array of integers to check.
     * @return 1 if all elements are non-zero, otherwise 0.
     */
    public static int arrayHasNoZeros(int[] a) {
        for (int element : a) {
            if (element == 0) {
                return 0; // Found a zero in the array
            }
        }
        return 1; // All elements are non-zero
    }

    public static void main(String[] args) {
        // Test cases with explanations
        System.out.println("arrayHasNoZeros(new int[] {1, 2, 3, 4}): " + arrayHasNoZeros(new int[] {1, 2, 3, 4})); // Expected: 1, all elements are non-zero
        System.out.println("arrayHasNoZeros(new int[] {1, 0, 3, 4}): " + arrayHasNoZeros(new int[] {1, 0, 3, 4})); // Expected: 0, contains a zero
        System.out.println("arrayHasNoZeros(new int[] {5, 6, 7}): " + arrayHasNoZeros(new int[] {5, 6, 7})); // Expected: 1, all elements are non-zero
        System.out.println("arrayHasNoZeros(new int[] {0, 0, 0}): " + arrayHasNoZeros(new int[] {0, 0, 0})); // Expected: 0, all elements are zero
        System.out.println("arrayHasNoZeros(new int[] {}): " + arrayHasNoZeros(new int[] {})); // Expected: 1, empty array is considered to have no zeros
    }
}

