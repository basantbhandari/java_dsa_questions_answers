package com.basant.github.miu;

public class SequencedArrayChecker {

    /**
     * Determines if the given array is an m-n sequenced array.
     *
     * An array is defined to be an m-n sequenced array if:
     * 1. It contains one or more occurrences of all the integers between m and n (inclusive).
     * 2. The array is in ascending order.
     * 3. The array contains only integers between m and n (inclusive).
     *
     * Examples:
     * - {2, 2, 3, 4, 4, 4, 5} is a 2-5 sequenced array.
     * - {2, 2, 3, 5, 5, 5} is not a 2-5 sequenced array because it is missing a 4.
     * - {0, 2, 2, 3, 3} is not a 2-3 sequenced array because the 0 is out of range.
     * - {1, 1, 3, 2, 2, 4} is not a 1-4 sequenced array because it is not in ascending order.
     *
     * @param a the array to check
     * @param m the start of the range
     * @param n the end of the range
     * @return 1 if the array is an m-n sequenced array, otherwise 0
     */
    public static int isSequencedArray(int[] a, int m, int n) {
        // Check if the array is empty
        if (a.length == 0) {
            return 0;
        }

        // Check if the array contains only elements within the range [m, n]
        for (int i = 0; i < a.length; i++) {
            if (a[i] < m || a[i] > n) {
                return 0;
            }
        }

        // Check if the array is in ascending order
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return 0;
            }
        }

        // Check if all elements from m to n are present in the array
        for (int i = m; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return 0;
            }
        }

        // If all conditions are satisfied, return 1
        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isSequencedArray(new int[] {1, 2, 3, 4, 5}, 1, 5)); // 1
        System.out.println(isSequencedArray(new int[] {1, 3, 4, 2, 5}, 1, 5)); // 0
        System.out.println(isSequencedArray(new int[] {-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2)); // 1
        System.out.println(isSequencedArray(new int[] {0, 1, 2, 3, 4, 5}, 1, 5)); // 0
        System.out.println(isSequencedArray(new int[] {1, 2, 3, 4}, 1, 5)); // 0
        System.out.println(isSequencedArray(new int[] {1, 2, 5}, 1, 5)); // 0
        System.out.println(isSequencedArray(new int[] {5, 4, 3, 2, 1}, 1, 5)); // 0
    }
}
