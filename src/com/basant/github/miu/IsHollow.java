package com.basant.github.miu;

/**
 * Utility class for checking array properties.
 */
public class IsHollow {

    /**
     * Checks if the given array is hollow.
     *
     * An array is said to be hollow if it contains 3 or more zeros in the middle that are preceded
     * and followed by the same number of non-zero elements. Furthermore, all the zeroes in the
     * array must be in the middle of the array.
     *
     * @param a the array to check
     * @return 1 if the array is hollow, otherwise 0
     */
    public static int isHollow(int[] a) {
        int len = a.length;

        if (len < 3) return 0; // An array needs to have at least 3 elements to be hollow

        int leadingNonZeros = 0;
        int trailingNonZeros = 0;
        int zeroCount = 0;

        // Count leading non-zero elements
        int i = 0;
        while (i < len && a[i] != 0) {
            leadingNonZeros++;
            i++;
        }

        // Count zeros in the middle
        while (i < len && a[i] == 0) {
            zeroCount++;
            i++;
        }

        // Count trailing non-zero elements
        while (i < len && a[i] != 0) {
            trailingNonZeros++;
            i++;
        }

        // Ensure all elements are processed and the middle section contains at least 3 zeros
        if (i == len && zeroCount >= 3 && leadingNonZeros == trailingNonZeros) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("isHollow(new int[]{1,2,0,0,0,3,4}): " + isHollow(new int[]{1,2,0,0,0,3,4})); // Expected: 1
        System.out.println("isHollow(new int[]{1,1,1,1,0,0,0,0,0,2,1,2,18}): " + isHollow(new int[]{1,1,1,1,0,0,0,0,0,2,1,2,18})); // Expected: 1
        System.out.println("isHollow(new int[]{1, 2, 0, 0, 3, 4}): " + isHollow(new int[]{1, 2, 0, 0, 3, 4})); // Expected: 0
        System.out.println("isHollow(new int[]{1,2,0,0,0,3,4,5}): " + isHollow(new int[]{1,2,0,0,0,3,4,5})); // Expected: 0
        System.out.println("isHollow(new int[]{3,8,3,0,0,0,3,3}): " + isHollow(new int[]{3,8,3,0,0,0,3,3})); // Expected: 0
        System.out.println("isHollow(new int[]{1,2,0,0,0,3,4,0}): " + isHollow(new int[]{1,2,0,0,0,3,4,0})); // Expected: 0
        System.out.println("isHollow(new int[]{0,1,2,0,0,0,3,4}): " + isHollow(new int[]{0,1,2,0,0,0,3,4})); // Expected: 0
        System.out.println("isHollow(new int[]{0,0,0}): " + isHollow(new int[]{0,0,0})); // Expected: 1
    }
}
