package com.basant.github.miu;

public class IsBunker {

    /**
     * Checks if the array is a Bunker array.
     * A Bunker array contains the value 1 if and only if it contains a prime number.
     *
     * @param a the array to check
     * @return 1 if the array is a Bunker array, otherwise 0
     */
    public static int isBunker(int[] a) {
        boolean containsOne = false;
        boolean containsPrime = false;

        for (int num : a) {
            if (num == 1) {
                containsOne = true;
            }
            if (isPrime(num)) {
                containsPrime = true;
            }
        }

        return (containsOne && containsPrime) ? 1 : 0;
    }

    /**
     * Dummy isPrime function for demonstration.
     * You can replace this with the actual isPrime function.
     *
     * @param m the number to check
     * @return 1 if m is a prime number, otherwise 0
     */
    private static boolean isPrime(int m) {
        if (m <= 1) return false;
        if (m <= 3) return true;
        if (m % 2 == 0 || m % 3 == 0) return false;
        for (int i = 5; i * i <= m; i += 6) {
            if (m % i == 0 || m % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        int[] test1 = {7, 6, 10, 1};       // Expected: 1
        int[] test2 = {7, 6, 10};          // Expected: 0
        int[] test3 = {6, 10, 1};          // Expected: 0
        int[] test4 = {3, 7, 1, 8, 1};    // Expected: 1

        System.out.println(isBunker(test1));
        System.out.println(isBunker(test2));
        System.out.println(isBunker(test3));
        System.out.println(isBunker(test4));
    }
}
