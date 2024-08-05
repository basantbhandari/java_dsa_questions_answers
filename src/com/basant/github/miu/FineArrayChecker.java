package com.basant.github.miu;

public class FineArrayChecker {

    /**
     * A twin prime is a prime number that differs from another prime number by 2.
     * A Fine array is defined to be an array in which every prime in the array has its twin in the array.
     *
     * Examples:
     * {4, 7, 9, 6, 5} is a Fine array because 7 and 5 are both present.
     * {4, 9, 6, 33} is a Fine array since there are no primes.
     * {3, 8, 15} is not a Fine array since 3 is present but its twin 5 is not in the array.
     *
     * This function checks if the given array is a Fine array.
     *
     * @param a The input array of integers.
     * @return 1 if the array is a Fine array, otherwise 0.
     */
    public static int isFineArray(int[] a) {
        // Check for each prime if its twin is present in the array
        for (int num : a) {
            if (isPrime(num)) {
                if (!contains(a, num - 2) && !contains(a, num + 2)) {
                    return 0; // Twin prime not found
                }
            }
        }
        return 1; // All primes have their twin primes in the array
    }

    /**
     * Checks if the given number is prime.
     *
     * @param n The number to check.
     * @return 1 if n is prime, otherwise 0.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the given array contains the specified value.
     *
     * @param a The array to check.
     * @param value The value to look for.
     * @return true if the array contains the value, otherwise false.
     */
    public static boolean contains(int[] a, int value) {
        for (int num : a) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isFineArray(new int[]{4, 7, 9, 6, 5})); // Expected output: 1
        System.out.println(isFineArray(new int[]{4, 9, 6, 33})); // Expected output: 1
        System.out.println(isFineArray(new int[]{3, 8, 15})); // Expected output: 0
        System.out.println(isFineArray(new int[]{5, 7, 11, 13, 17, 19})); // Expected output: 1
        System.out.println(isFineArray(new int[]{2, 3, 5, 8})); // Expected output: 0
    }
}
