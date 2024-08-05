package com.basant.github.miu;

public class DigitSumChecker {

    /**
     * Checks if the sum of all digits of the first argument is less than the second argument.
     * Returns -1 if either argument is negative.
     *
     * @param n The integer whose digits will be summed.
     * @param m The integer to compare the digit sum against.
     * @return 1 if the digit sum of n is less than m, 0 otherwise, -1 if either argument is negative.
     */
    public static int isDigitSum(int n, int m) {
        if (n < 0 || m < 0) {
            return -1;
        }

        int digitSum = 0;
        int temp = n;

        // Calculate the sum of the digits of n
        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }

        // Compare the digit sum with m
        if (digitSum < m) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isDigitSum(32121, 10)); // Expected output: 1
        System.out.println(isDigitSum(32121, 9)); // Expected output: 0
        System.out.println(isDigitSum(13, 6)); // Expected output: 1
        System.out.println(isDigitSum(3, 3)); // Expected output: 0
        System.out.println(isDigitSum(-543, 3)); // Expected output: -1
    }
}
