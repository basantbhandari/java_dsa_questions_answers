package com.basant.github.miu;

public class BaseChecker {

    /**
     * Checks if the given number (represented by an array of digits) is a legal number in the given base.
     *
     * @param a the array of digits representing the number.
     * @param base the base of the number system.
     * @return 1 if the number is legal in the given base, otherwise 0.
     *
     * This method iterates through each digit in the array and checks if it is less than the given base.
     * If any digit is not valid for the given base, the method returns 0.
     */
    public static int isLegalNumber(int[] a, int base) {
        for (int digit : a) {
            if (digit >= base || digit < 0) {
                return 0; // Invalid digit found for the given base
            }
        }
        return 1; // All digits are valid for the given base
    }

    public static void main(String[] args) {
        // Test cases with explanations
        System.out.println("isLegalNumber(new int[] {3, 2, 1}, 4): " + isLegalNumber(new int[] {3, 2, 1}, 4)); // Expected: 1, because 3, 2, 1 are all less than 4
        System.out.println("isLegalNumber(new int[] {3, 7, 1}, 6): " + isLegalNumber(new int[] {3, 7, 1}, 6)); // Expected: 0, because 7 is not less than 6
        System.out.println("isLegalNumber(new int[] {1, 0, 1, 1}, 2): " + isLegalNumber(new int[] {1, 0, 1, 1}, 2)); // Expected: 1, because 1, 0 are valid in base 2
        System.out.println("isLegalNumber(new int[] {2, 1, 2, 3}, 3): " + isLegalNumber(new int[] {2, 1, 2, 3}, 3)); // Expected: 0, because 3 is not less than 3
    }
}
