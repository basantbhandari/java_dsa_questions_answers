package com.basant.github.miu;

public class NPrimeableArray {

    /**
     * Checks if a number is prime.
     *
     * @param num The number to check.
     * @return true if the number is prime, otherwise false.
     */
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }

    /**
     * Checks if an array is n-primeable.
     * An array is n-primeable if for every element in the array, the sum of that element and n is a prime number.
     *
     * @param a The array to check.
     * @param n The integer to add to each element before checking for primality.
     * @return 1 if the array is n-primeable, otherwise 0.
     */
    public static int isNPrimeable(int[] a, int n) {
        // Check if all elements + n are prime
        for (int i = 0; i < a.length; i++) {
            if (!isPrime(a[i] + n)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {5, 15, 27};
        int[] arr2 = {5, 15, 27};
        int[] arr3 = {5, 15, 26};
        int[] arr4 = {1, 1, 1, 1, 1, 1, 1};
        int[] arr5 = {};

        System.out.println(isNPrimeable(arr1, 2)); // Expected output: 1
        System.out.println(isNPrimeable(arr2, 3)); // Expected output: 0
        System.out.println(isNPrimeable(arr3, 2)); // Expected output: 0
        System.out.println(isNPrimeable(arr4, 4)); // Expected output: 1
        System.out.println(isNPrimeable(arr5, 2)); // Expected output: 1
    }
}
