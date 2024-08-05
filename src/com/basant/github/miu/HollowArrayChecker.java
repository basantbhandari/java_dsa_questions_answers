package com.basant.github.miu;

public class HollowArrayChecker {

    /**
     * Function to determine if an array is hollow.
     * An array is hollow if it contains 3 or more zeroes in the middle
     * with an equal number of non-zero elements before and after the zeroes.
     *
     * @param a - the input array
     * @return 1 if the array is hollow, otherwise 0
     */
    public static int isHollow(int[] a) {
        if (a == null || a.length < 7) {
            // An array with less than 7 elements cannot be hollow
            return 0;
        }

        int n = a.length;
        int i = 0;
        int j = n - 1;

        // Move i forward to find the first zero in the middle section
        while (i < n && a[i] != 0) {
            i++;
        }

        // Move j backward to find the first zero in the middle section
        while (j >= 0 && a[j] != 0) {
            j--;
        }

        // Check if we found a valid zero section and it has at least 3 zeroes
        if (i >= j || j - i < 2) {
            return 0;
        }

        int zeroCount = 0;
        for (int k = i; k <= j; k++) {
            if (a[k] == 0) {
                zeroCount++;
            } else {
                return 0;
            }
        }

        // Check if zero count is at least 3
        if (zeroCount < 3) {
            return 0;
        }

        // Check for equal non-zero elements before and after zero section
        int leftNonZeroCount = i;
        int rightNonZeroCount = n - 1 - j;

        return leftNonZeroCount == rightNonZeroCount ? 1 : 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isHollow(new int[]{1, 2, 4, 0, 0, 0, 3, 4, 5})); // Expected: 1
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 5})); // Expected: 0
        System.out.println(isHollow(new int[]{1, 2, 4, 9, 0, 0, 0, 3, 4, 5})); // Expected: 0
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 3, 4})); // Expected: 0
        System.out.println(isHollow(new int[]{1, 0, 0, 0, 1})); // Expected: 1

    }
}
