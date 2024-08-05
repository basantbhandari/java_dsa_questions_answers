package com.basant.github.miu;

public class FactorialPrime {

    /**
     * A positive, non-zero number n is a factorial prime if it is equal to
     * factorial(n) + 1 for some n and it is prime. Recall that factorial(n)
     * is equal to 1 * 2 * ... * n-1 * n.
     *
     * For example, factorial(5) = 120.
     *
     * A prime number is a natural number which has exactly two distinct
     * natural number divisors: 1 and itself.
     *
     * Write a method named isFactorialPrime which returns 1 if its argument
     * is a factorial prime number, otherwise it returns 0.
     *
     * Examples:
     *
     * isFactorialPrime(2) returns 1 because 2 is prime and is equal to
     * factorial(1) + 1
     *
     * isFactorialPrime(3) returns 1 because 3 is prime and is equal to
     * factorial(2) + 1
     *
     * isFactorialPrime(7) returns 1 because 7 is prime and is equal to
     * factorial(3) + 1
     *
     * isFactorialPrime(8) returns 0 because 8 is not prime
     *
     * isFactorialPrime(11) returns 0 because 11 does not equal
     * factorial(n) + 1 for any n (factorial(3)=6, factorial(4)=24)
     *
     * isFactorialPrime(721) returns 0 because 721 is not prime (its factors
     * are 7 and 103)
     *
     * @param n the number to check
     * @return 1 if n is a factorial prime, otherwise 0
     */
    public static int isFactorialPrime(int n) {
        // Check if n is a prime number
        if (n <= 1 || !isPrime(n)) {
            return 0;
        }


        // Check for factorial(n) + 1
        int factorial = 1;
        for (int i = 1; ; i++) {
            factorial *= i;
            if (factorial + 1 == n) {
                return 1;
            } else if (factorial + 1 > n) {
                return 0;
            }
        }
    }

    /**
     * Helper method to check if a number is prime
     *
     * @param number the number to check
     * @return true if number is prime, otherwise false
     */
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isFactorialPrime(2));    // Expected output: 1
        System.out.println(isFactorialPrime(3));    // Expected output: 1
        System.out.println(isFactorialPrime(7));    // Expected output: 1
        System.out.println(isFactorialPrime(8));    // Expected output: 0
        System.out.println(isFactorialPrime(11));   // Expected output: 0
        System.out.println(isFactorialPrime(721));  // Expected output: 0
    }
}
