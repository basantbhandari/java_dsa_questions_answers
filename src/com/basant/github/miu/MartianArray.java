package com.basant.github.miu;

public class MartianArray {

    /**
     * Checks if the given array is a Martian array.
     * A Martian array is defined as having:
     * 1. More 1s than 2s.
     * 2. No two adjacent elements that are the same.
     *
     * @param a The array to check.
     * @return 1 if the array is a Martian array, 0 otherwise.
     */
    public static int isMartian(int[] a) {
        int count1 = 0;
        int count2 = 0;

        // Edge case: empty array
        if (a.length == 0) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
            // Count number of 1s and 2s
            if (a[i] == 1) {
                count1++;
            } else if (a[i] == 2) {
                count2++;
            }

            // Check for adjacent elements that are equal
            if (i > 0 && a[i] == a[i - 1]) {
                return 0;
            }
        }

        // Check if the number of 1s is greater than the number of 2s
        if (count1 <= count2) {
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 3};
        int[] arr2 = {1, 2, 1, 2, 1, 2, 1, 2, 1};
        int[] arr3 = {1, 3, 2};
        int[] arr4 = {1, 3, 2, 2, 1, 5, 1, 5};
        int[] arr5 = {1, 2, -18, -18, 1, 2};
        int[] arr6 = {};
        int[] arr7 = {1};
        int[] arr8 = {2};

        System.out.println(isMartian(arr1)); // Expected output: 1
        System.out.println(isMartian(arr2)); // Expected output: 1
        System.out.println(isMartian(arr3)); // Expected output: 0
        System.out.println(isMartian(arr4)); // Expected output: 0
        System.out.println(isMartian(arr5)); // Expected output: 0
        System.out.println(isMartian(arr6)); // Expected output: 0
        System.out.println(isMartian(arr7)); // Expected output: 1
        System.out.println(isMartian(arr8)); // Expected output: 0
    }
}
