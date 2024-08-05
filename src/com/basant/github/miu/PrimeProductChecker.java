package com.basant.github.miu;

public class PrimeProductChecker {

    /**
     * Function to check if a number is a prime product.
     * A prime product is a positive integer that is the product of exactly two primes greater than 1.
     *
     * @param n - the integer to check
     * @return 1 if n is a prime product, otherwise 0
     */
    public static int isPrimeProduct(int n) {
        if (n <= 1) {
            return 0;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0 && isPrime(i) && isPrime(n / i)) {
                return 1;
            }
        }

        return 0;
    }

    /**
     * Dummy isPrime function to check if a number is prime.
     * Replace this with the actual isPrime function if available.
     *
     * @param m - the integer to check
     * @return 1 if m is prime, otherwise 0
     */
    public static boolean isPrime(int m) {
        if (m <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        int[] testCases = {22, 33, 15, 49, 1, 4, 6, 10, 14};

        // Running the test cases
        for (int testCase : testCases) {
            System.out.println("Number: " + testCase + " -> isPrimeProduct: " + isPrimeProduct(testCase));
        }
    }
}
