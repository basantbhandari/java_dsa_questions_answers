package com.basant.github.miu;

public class FilterArray {

    /**
     * Checks if the given array is a Filter array.
     * A Filter array must meet the following conditions:
     * 1. If it contains 9, then it must also contain 11.
     * 2. If it contains 7, then it must not contain 13.
     *
     * @param a The input array of integers.
     * @return 1 if the array is a Filter array, otherwise 0.
     */
    public static int isFilter(int[] a) {
        boolean contains9 = false;
        boolean contains11 = false;
        boolean contains7 = false;
        boolean contains13 = false;

        // Iterate through the array and check the presence of key values
        for (int num : a) {
            if (num == 9) {
                contains9 = true;
            }
            if (num == 11) {
                contains11 = true;
            }
            if (num == 7) {
                contains7 = true;
            }
            if (num == 13) {
                contains13 = true;
            }
        }

        // Check conditions for Filter array
        if (contains9 && !contains11) {
            return 0; // Contains 9 but not 11
        }
        if (contains7 && contains13) {
            return 0; // Contains both 7 and 13
        }

        return 1; // It is a Filter array
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isFilter(new int[]{1, 2, 3, 9, 6, 11})); // Expected output: 1
        System.out.println(isFilter(new int[]{3, 4, 6, 7, 14, 16})); // Expected output: 1
        System.out.println(isFilter(new int[]{1, 2, 3, 4, 10, 11, 13})); // Expected output: 1
        System.out.println(isFilter(new int[]{3, 6, 5, 5, 13, 6, 13})); // Expected output: 1
        System.out.println(isFilter(new int[]{9, 6, 18})); // Expected output: 0
        System.out.println(isFilter(new int[]{4, 7, 13})); // Expected output: 0
    }
}

