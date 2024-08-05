package com.basant.github.miu;


/**
 * This class provides a method to check if an array is inertial.
 * An array is defined to be inertial if:
 * 1. It contains at least one odd value.
 * 2. The maximum value in the array is even.
 * 3. Every odd value is greater than every even value that is not the maximum value.
 */
public class InertialArrayChecker {

    /**
     * Checks if the given array is inertial.
     *
     * @param a the array to be checked
     * @return 1 if the array is inertial, otherwise 0
     */
    public static int isInertial(int[] a) {
        boolean hasOdd = false;
        int max = Integer.MIN_VALUE;

        // Find the maximum value and check if there's at least one odd value
        for (int value : a) {
            if (value % 2 != 0) {
                hasOdd = true;
            }
            if (value > max) {
                max = value;
            }
        }

        // Check condition (a): there must be at least one odd value
        if (!hasOdd) {
            return 0;
        }

        // Check condition (b): the maximum value must be even
        if (max % 2 != 0) {
            return 0;
        }

        // Check condition (c): every odd value is greater than every even value that is not the maximum
        for (int oddValue : a) {
            if (oddValue % 2 != 0) {
                for (int evenValue : a) {
                    if (evenValue != max && evenValue % 2 == 0 && oddValue <= evenValue) {
                        return 0;
                    }
                }
            }
        }

        return 1;
    }

    /**
     * Main method to test the isInertial function.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int[] a1 = {11, 4, 20, 9, 2, 8};
        int[] a2 = {12, 11, 4, 9, 2, 3, 10};
        int[] a3 = {1};
        int[] a4 = {2, 4, 1};
        int[] a5 = {1, 1, 1, 1, 1, 2};
        int[] a6 = {12, 4, 6, 8, 11};
        int[] a7 = {2, 12, 12, 4, 6, 8, 11};
        int[] a8 = {-2, -4, -6, -8, -11};
        int[] a9 = {2, 3, 5, 7};
        int[] a10 = {2, 4, 6, 8, 10};

        System.out.println(isInertial(a1)); // Output: 1
        System.out.println(isInertial(a2)); // Output: 0
        System.out.println(isInertial(a3)); // Output: 0
        System.out.println(isInertial(a4)); // Output: 0
        System.out.println(isInertial(a5)); // Output: 1
        System.out.println(isInertial(a6)); // Output: 1
        System.out.println(isInertial(a7)); // Output: 1
        System.out.println(isInertial(a8)); // Output: 0
        System.out.println(isInertial(a9)); // Output: 0
        System.out.println(isInertial(a10)); // Output: 0
    }
}
