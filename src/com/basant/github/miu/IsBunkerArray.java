package com.basant.github.miu;

public class IsBunkerArray {

    /**
     * Checks if the array is a Bunker array.
     * A Bunker array contains at least one odd number immediately followed by a prime number.
     *
     * @param a the array to check
     * @return 1 if the array is a Bunker array, otherwise 0
     */
    public static int isBunkerArray(int[] a) {
        // Check for null or empty array
        if (a == null || a.length < 2) {
            return 0;
        }

        // Iterate through the array
        for (int i = 0; i < a.length - 1; i++) {
            // Check if current element is odd and next element is prime
            if (a[i] % 2 != 0 && isPrime(a[i + 1])) {
                return 1;
            }
        }

        return 0;
    }

    // Assume this is a given method that returns 1 if n is prime, otherwise 0
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isBunkerArray(new int[]{4, 9, 6, 7, 3})); // Expected: 1
        System.out.println(isBunkerArray(new int[]{4, 9, 6, 15, 21})); // Expected: 0
    }
}
