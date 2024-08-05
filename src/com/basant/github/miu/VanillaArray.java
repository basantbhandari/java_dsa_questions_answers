package com.basant.github.miu;

public class VanillaArray {

    /**
     * Checks if the array is a vanilla array.
     * A vanilla array is one where all elements are made up of the same digit.
     *
     * @param a the array of integers to be checked
     * @return 1 if the array is vanilla, otherwise 0
     */
    public static int isVanilla(int[] a) {
        // Edge case: If array is empty, it's considered vanilla
        if (a.length == 0) {
            return 1;
        }

        // Extract the digit from the first element
        int firstElement = a[0];
        int digit = getSingleDigit(firstElement);

        // If the first element does not consist of a single digit, it's not vanilla
        if (digit == -1) {
            return 0;
        }

        // Check all elements in the array
        for (int num : a) {
            if (getSingleDigit(num) != digit) {
                return 0; // Not a vanilla array
            }
        }

        return 1; // All elements are made up of the same digit
    }

    /**
     * Checks if the given number is made up of the same digit.
     *
     * @param num the number to be checked
     * @return the digit if all digits are the same, otherwise -1
     */
    private static int getSingleDigit(int num) {
        if (num < 0) {
            return -1; // Negative numbers are not considered
        }

        int digit = num % 10;

        while (num > 0) {
            if (num % 10 != digit) {
                return -1; // Digits are not the same
            }
            num /= 10;
        }

        return digit; // All digits are the same
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isVanilla(new int[]{1, 1, 11, 1111, 1111111}));  // Should return 1
        System.out.println(isVanilla(new int[]{11, 101, 1111, 11111}));    // Should return 0
        System.out.println(isVanilla(new int[]{1, 2, 3}));                // Should return 0
        System.out.println(isVanilla(new int[]{0, 0, 0}));                // Should return 1
        System.out.println(isVanilla(new int[]{222, 22, 2}));             // Should return 1
        System.out.println(isVanilla(new int[]{2, 22, 222}));             // Should return 1
        System.out.println(isVanilla(new int[]{2, 22, 21}));              // Should return 0
    }
}
