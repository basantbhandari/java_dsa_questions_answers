package com.basant.github.miu;

public class BaseConverter {

    /**
     * Checks if the given number (represented by an array of digits) is a legal number in the given base.
     *
     * @param a the array of digits representing the number.
     * @param base the base of the number system.
     * @return 1 if the number is legal in the given base, otherwise 0.
     */
    public static int isLegalNumber(int[] a, int base) {
        for (int digit : a) {
            if (digit >= base || digit < 0) {
                return 0; // Invalid digit found for the given base
            }
        }
        return 1; // All digits are valid for the given base
    }

    /**
     * Converts the given number (represented by an array of digits) in the specified base to a base 10 number.
     * Returns -1 if the number is not legal in the given base.
     *
     * @param a the array of digits representing the number.
     * @param base the base of the number system.
     * @return the base 10 representation of the number if the number is legal, otherwise -1.
     */
    public static int convertToBase10(int[] a, int base) {
        // Check if the number is legal in the given base
        if (isLegalNumber(a, base) == 0) {
            return -1; // Invalid number in the given base
        }

        int base10Value = 0;
        int power = 1; // Initialize power of the base (base^0)

        // Iterate from the last digit to the first
        for (int i = a.length - 1; i >= 0; i--) {
            base10Value += a[i] * power;
            power *= base; // Update the power of the base
        }

        return base10Value;
    }

    public static void main(String[] args) {
        // Test cases with explanations
        System.out.println("convertToBase10(new int[] {1, 0, 1, 1}, 2): " + convertToBase10(new int[] {1, 0, 1, 1}, 2)); // Expected: 11, binary 1011 is 11 in decimal
        System.out.println("convertToBase10(new int[] {1, 1, 2}, 3): " + convertToBase10(new int[] {1, 1, 2}, 3)); // Expected: 14, base 3 number 112 is 14 in decimal
        System.out.println("convertToBase10(new int[] {3, 2, 5}, 8): " + convertToBase10(new int[] {3, 2, 5}, 8)); // Expected: 213, base 8 number 325 is 213 in decimal
        System.out.println("convertToBase10(new int[] {3, 7, 1}, 6): " + convertToBase10(new int[] {3, 7, 1}, 6)); // Expected: -1, 371 is not a legal base 6 number
    }
}
