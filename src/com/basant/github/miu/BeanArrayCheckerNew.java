package com.basant.github.miu;

public class BeanArrayCheckerNew {

    /**
     * Determines if an array is a Bean array.
     *
     * A Bean array is defined as an array that meets the following conditions:
     * - If it contains a 9, then it must also contain a 13.
     * - If it contains a 7, then it must not contain a 16.
     *
     * Arrays that are Bean arrays:
     * - {1, 2, 3, 9, 6, 13} (contains 9 and 13, 7 is not present)
     * - {3, 4, 6, 7, 13, 15} (contains 7 but not 16, contains 13)
     * - {1, 2, 3, 4, 10, 11, 12} (does not contain 9 or 7)
     * - {3, 6, 9, 5, 7, 13, 6, 17} (contains 9 and 13, 7 but no 16)
     *
     * Arrays that are not Bean arrays:
     * - {9, 6, 18} (contains 9 but no 13)
     * - {4, 7, 16} (contains both 7 and 16)
     *
     * @param a - the input integer array
     * @return 1 if the array is a Bean array, 0 otherwise
     */
    public static int isBean(int[] a) {
        boolean contains9 = false;
        boolean contains13 = false;
        boolean contains7 = false;
        boolean contains16 = false;

        // Check for the presence of 9, 13, 7, and 16
        for (int num : a) {
            if (num == 9) contains9 = true;
            if (num == 13) contains13 = true;
            if (num == 7) contains7 = true;
            if (num == 16) contains16 = true;
        }

        // Validate conditions for being a Bean array
        if (contains9 && !contains13) {
            return 0;
        }
        if (contains7 && contains16) {
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isBean(new int[]{1, 2, 3, 9, 6, 13})); // Expected: 1
        System.out.println(isBean(new int[]{3, 4, 6, 7, 13, 15})); // Expected: 1
        System.out.println(isBean(new int[]{1, 2, 3, 4, 10, 11, 12})); // Expected: 1
        System.out.println(isBean(new int[]{3, 6, 9, 5, 7, 13, 6, 17})); // Expected: 1
        System.out.println(isBean(new int[]{9, 6, 18})); // Expected: 0
        System.out.println(isBean(new int[]{4, 7, 16})); // Expected: 0
    }
}
