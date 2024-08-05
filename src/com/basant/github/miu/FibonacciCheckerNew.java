package com.basant.github.miu;

/**
 * This class contains a method to determine if a number is a Fibonacci number.
 *
 * A number is considered a Fibonacci number if it appears in the Fibonacci sequence,
 * where the sequence starts with 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on.
 *
 * The method `isFibonacci` checks if the given number is in the Fibonacci sequence and
 * returns 1 if it is, otherwise it returns 0.
 *
 * Example cases:
 * - If the number is 13, the method returns 1 because 13 is in the Fibonacci sequence.
 * - If the number is 27, the method returns 0 because 27 is not in the Fibonacci sequence.
 */
public class FibonacciCheckerNew {

    /**
     * Checks if the given number is a Fibonacci number.
     *
     * @param n the number to check
     * @return 1 if the number is a Fibonacci number, otherwise 0
     */
    public static int isFibonacci(int n) {
        if (n < 1) {
            return 0; // Fibonacci numbers are positive integers
        }

        int a = 1;
        int b = 1;

        if (n == 1) {
            return 1; // 1 is a Fibonacci number
        }

        while (b < n) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return (b == n) ? 1 : 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isFibonacci(13)); // Expected output: 1
        System.out.println(isFibonacci(27)); // Expected output: 0
        System.out.println(isFibonacci(1));  // Expected output: 1
        System.out.println(isFibonacci(21)); // Expected output: 1
        System.out.println(isFibonacci(34)); // Expected output: 1
        System.out.println(isFibonacci(50)); // Expected output: 0
    }
}
