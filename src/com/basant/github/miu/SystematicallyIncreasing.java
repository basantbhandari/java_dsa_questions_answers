package com.basant.github.miu;

public class SystematicallyIncreasing {

    /**
     * Checks if the given array is systematically increasing.
     *
     * @param a the array to check
     * @return 1 if the array is systematically increasing, otherwise 0
     */
    public static int isSystematicallyIncreasing(int[] a) {
        int length = a.length;
        int k = 1; // k represents the expected length of the next subsequence
        int index = 0;

        while (index < length) {
            // Check if there's enough remaining elements for the next subsequence
            if (index + k > length) {
                return 0;
            }
            // Check if the next subsequence matches the expected pattern
            for (int j = 1; j <= k; j++) {
                if (a[index++] != j) {
                    return 0;
                }
            }
            k++;
        }

        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        int[] test1 = {1};
        int[] test2 = {1, 1, 2};
        int[] test3 = {1, 1, 2, 1, 2, 3};
        int[] test4 = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4};
        int[] test5 = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5};
        int[] test6 = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6};
        int[] test7 = {1, 2, 3}; // Should return 0

        System.out.println(isSystematicallyIncreasing(test1)); // Expected output: 1
        System.out.println(isSystematicallyIncreasing(test2)); // Expected output: 1
        System.out.println(isSystematicallyIncreasing(test3)); // Expected output: 1
        System.out.println(isSystematicallyIncreasing(test4)); // Expected output: 1
        System.out.println(isSystematicallyIncreasing(test5)); // Expected output: 1
        System.out.println(isSystematicallyIncreasing(test6)); // Expected output: 1
        System.out.println(isSystematicallyIncreasing(test7)); // Expected output: 0
    }
}
