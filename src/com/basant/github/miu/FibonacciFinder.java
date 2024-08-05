package com.basant.github.miu;

/**
 * This class contains a method to find the largest Fibonacci number less than or equal to a given integer.
 *
 * The Fibonacci sequence is defined as:
 * - F(1) = 1
 * - F(2) = 1
 * - F(n) = F(n-1) + F(n-2) for n > 2
 *
 * The method `closestFibonacci` returns the largest Fibonacci number that is less than or equal to the given number.
 * If the given number is less than 1, the method returns 0.
 *
 * Example cases:
 * - If n is 13, the method returns 8 because 8 is the largest Fibonacci number less than 13.
 * - If n is 33, the method returns 21 because 21 is the largest Fibonacci number less than or equal to 33.
 * - If n is 34, the method returns 34 because 34 is a Fibonacci number and is equal to 34.
 * - If n is less than 1, the method returns 0.
 *
 * This implementation avoids recursion by using an iterative approach.
 */
public class FibonacciFinder {

    /**
     * Finds the largest Fibonacci number less than or equal to the given integer.
     *
     * @param n the integer to find the closest Fibonacci number for
     * @return the largest Fibonacci number <= n, or 0 if n < 1
     */
    public static int closestFibonacci(int n) {
        // Return 0 if n is less than 1
        if (n < 1) {
            return 0;
        }

        // Initialize the first two Fibonacci numbers
        int a = 1;  // F(1)
        int b = 1;  // F(2)

        // If n is 1 or less, return the smallest Fibonacci number (1)
        if (n == 1) {
            return 1;
        }

        // Iterate to find the largest Fibonacci number <= n
        while (b <= n) {
            int next = a + b;  // Calculate the next Fibonacci number
            a = b;             // Move to the next Fibonacci number
            b = next;          // Update b to the next Fibonacci number
        }

        // The loop exits when b > n, so a is the largest Fibonacci number <= n
        return a;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(closestFibonacci(13)); // Expected output: 8
        System.out.println(closestFibonacci(33)); // Expected output: 21
        System.out.println(closestFibonacci(34)); // Expected output: 34
        System.out.println(closestFibonacci(0));  // Expected output: 0
        System.out.println(closestFibonacci(1));  // Expected output: 1
    }
}
