package com.basant.github.miu;

public class PrimeHappyChecker {

    /**
     * Checks if a number is prime happy.
     *
     * A number n is called prime happy if there is at least one prime less than n
     * and the sum of all primes less than n is evenly divisible by n.
     *
     * @param n the number to be checked
     * @return 1 if the number is prime happy, otherwise 0
     */
    public static int isPrimeHappy(int n) {
        if (n <= 2) {
            return 0;
        }

        int sumOfPrimes = 0;
        boolean foundPrime = false;

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sumOfPrimes += i;
                foundPrime = true;
            }
        }

        if (foundPrime && sumOfPrimes % n == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Helper function to check if a number is prime.
     *
     * @param num the number to be checked
     * @return true if the number is prime, otherwise false
     */
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPrimeHappy(5));  // Expected output: 1
        System.out.println(isPrimeHappy(25)); // Expected output: 1
        System.out.println(isPrimeHappy(32)); // Expected output: 1
        System.out.println(isPrimeHappy(8));  // Expected output: 0
        System.out.println(isPrimeHappy(2));  // Expected output: 0
    }
}
