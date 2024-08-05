package com.basant.github.miu;

public class DivisibilityChecker {

    /**
     * Checks if all elements in the array are divisible by the given divisor.
     *
     * @param a the array of integers to check.
     * @param divisor the divisor to check divisibility.
     * @return 1 if all elements are divisible by the divisor, otherwise 0.
     *
     * The method iterates through each element of the array and checks if it is divisible by the divisor.
     * If any element is not divisible by the divisor, the method returns 0. If all elements are divisible, it returns 1.
     * An empty array is considered to have all elements divisible by any divisor, hence the method returns 1 for an empty array.
     */
    public static int isDivisible(int[] a, int divisor) {
        for (int element : a) {
            if (element % divisor != 0) {
                return 0; // If any element is not divisible by the divisor, return 0
            }
        }
        return 1; // If all elements are divisible, return 1
    }

    public static void main(String[] args) {
        // Test cases with explanations
        System.out.println("isDivisible({3, 3, 6, 36}, 3): " + isDivisible(new int[]{3, 3, 6, 36}, 3)); // Expected: 1
        System.out.println("isDivisible({4}, 2): " + isDivisible(new int[]{4}, 2)); // Expected: 1
        System.out.println("isDivisible({3, 4, 3, 6, 36}, 3): " + isDivisible(new int[]{3, 4, 3, 6, 36}, 3)); // Expected: 0
        System.out.println("isDivisible({6, 12, 24, 36}, 12): " + isDivisible(new int[]{6, 12, 24, 36}, 12)); // Expected: 0
        System.out.println("isDivisible({}, 3): " + isDivisible(new int[]{}, 3)); // Expected: 1
    }
}

