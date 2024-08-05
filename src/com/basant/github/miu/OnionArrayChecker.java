package com.basant.github.miu;

public class OnionArrayChecker {
    /**
     * Check if the given array is an onion array.
     *
     * An array is called an onion array if it satisfies the following condition for all values of j and k:
     * if j >= 0 and k >= 0 and j + k = length of the array - 1 and j != k, then a[j] + a[k] <= 10.
     *
     * @param a the input array to be checked
     * @return 1 if the array is an onion array, otherwise 0
     */
    public static int isOnionArray(int[] a) {
        int length = a.length;
        for (int j = 0; j < (length + 1) / 2; j++) {
            int k = length - 1 - j;
            if (j != k && (a[j] + a[k] > 10)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isOnionArray(new int[]{1, 2, 19, 4, 5})); // Expected output: 1
        System.out.println(isOnionArray(new int[]{1, 2, 3, 4, 15})); // Expected output: 0
        System.out.println(isOnionArray(new int[]{1, 3, 9, 8}));     // Expected output: 0
        System.out.println(isOnionArray(new int[]{2}));              // Expected output: 1
        System.out.println(isOnionArray(new int[]{}));               // Expected output: 1
        System.out.println(isOnionArray(new int[]{-2, 5, 0, 5, 12}));// Expected output: 1
    }
}

