package com.basant.github.miu;

public class DigitCounter {

    /**
     * Counts the number of times a given digit appears in a positive number.
     *
     * @param n the positive integer in which to count the occurrences of digit
     * @param digit the digit to count within n
     * @return the number of occurrences of the digit in n, or -1 if either argument is negative
     */
    public static int countDigit(int n, int digit) {
        // Check if either argument is negative
        if (n < 0 || digit < 0 || digit > 9) {
            return -1;
        }

        int count = 0;
        int currentDigit;

        // Iterate over each digit of the number n
        while (n > 0) {
            currentDigit = n % 10;  // Get the last digit of n
            if (currentDigit == digit) {
                count++;  // Increment count if the digit matches
            }
            n /= 10;  // Remove the last digit from n
        }

        return count;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(countDigit(32121, 1));  // Expected: 2
        System.out.println(countDigit(33331, 3));  // Expected: 4
        System.out.println(countDigit(33331, 6));  // Expected: 0
        System.out.println(countDigit(3, 3));      // Expected: 1
        System.out.println(countDigit(-543, 3));   // Expected: -1
        System.out.println(countDigit(543, -3));   // Expected: -1
    }
}
