package com.basant.github.miu;

public class PrimeFactor {

    /**
     * Returns the largest prime factor of the given number.
     *
     * A prime number is a number greater than 1 that is only divisible by 1 and itself.
     * If the number is less than or equal to 1, the function returns 0.
     *
     * @param n the number to find the largest prime factor of
     * @return the largest prime factor of n, or 0 if n <= 1
     */
    public static int largestPrimeFactor(int n) {
        if (n <= 1) {
            return 0;
        }

        int largestFactor = 0;

        // Check for the smallest prime factor (2) first
        while (n % 2 == 0) {
            largestFactor = 2;
            n /= 2;
        }

        // Check for odd factors from 3 upwards
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largestFactor = i;
                n /= i;
            }
        }

        // If n is still greater than 2, then it must be a prime number
        if (n > 2) {
            largestFactor = n;
        }

        return largestFactor;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(largestPrimeFactor(10));   // 5
        System.out.println(largestPrimeFactor(6936)); // 17
        System.out.println(largestPrimeFactor(1));    // 0
    }
}
