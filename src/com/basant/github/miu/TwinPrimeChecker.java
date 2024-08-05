package com.basant.github.miu;

public class TwinPrimeChecker {

    /**
     * Checks if a number is a twin prime.
     *
     * A number is a twin prime if:
     * - It is a prime number.
     * - It differs by 2 from another prime number.
     *
     * @param n The number to check
     * @return 1 if the number is a twin prime, otherwise 0
     */
    public static int isTwinPrime(int n) {
        if (n <= 1) {
            return 0; // Numbers less than or equal to 1 are not prime
        }

        if (!isPrime(n)) {
            return 0; // If n is not a prime number, it cannot be a twin prime
        }

        // Check if n is a twin prime
        return (isPrime(n - 2) || isPrime(n + 2)) ? 1 : 0;
    }

    /**
     * Checks if a number is prime.
     *
     * @param num The number to check
     * @return true if the number is prime, otherwise false
     */
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true; // 2 is the only even prime number
        }
        if (num % 2 == 0) {
            return false; // Other even numbers are not prime
        }

        // Check for factors from 3 to sqrt(num)
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("isTwinPrime(5): " + isTwinPrime(5));  // Expected: 1 (5 is a twin prime, 7 is also prime)
        System.out.println("isTwinPrime(7): " + isTwinPrime(7));  // Expected: 1 (7 is a twin prime, 5 is also prime)
        System.out.println("isTwinPrime(53): " + isTwinPrime(53)); // Expected: 0 (53 is prime but neither 51 nor 55 is prime)
        System.out.println("isTwinPrime(9): " + isTwinPrime(9));  // Expected: 0 (9 is not a prime)
    }
}
