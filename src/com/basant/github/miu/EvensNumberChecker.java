package com.basant.github.miu;

public class EvensNumberChecker {

    /**
     * An Evens number is an integer whose digits are all even.
     *
     * Examples:
     * 2426 is an Evens number because all its digits (2, 4, 2, 6) are even.
     * 3224 is not an Evens number because it contains the digit 3, which is odd.
     *
     * This function checks if the given number is an Evens number.
     *
     * @param n The input integer.
     * @return 1 if the number is an Evens number, otherwise 0.
     */
    public static int isEvens(int n) {
        // Make sure n is positive for easier digit extraction
        n = Math.abs(n);

        // Check each digit of the number
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                return 0; // Found an odd digit
            }
            n /= 10; // Move to the next digit
        }

        return 1; // All digits are even
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isEvens(2426)); // Expected output: 1
        System.out.println(isEvens(3224)); // Expected output: 0
        System.out.println(isEvens(4680)); // Expected output: 1
        System.out.println(isEvens(1234)); // Expected output: 0
        System.out.println(isEvens(0)); // Expected output: 1
        System.out.println(isEvens(-2426)); // Expected output: 1
    }
}
