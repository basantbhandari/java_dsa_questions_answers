package com.basant.github.miu;

/**
 * This class contains a method to check if an array is a 235 array.
 */
public class ArrayCheckerNew {

    /**
     * Checks if the given array is a 235 array.
     *
     * An array is a 235 array if the sum of the count of elements divisible by 2, 3, and 5,
     * plus the count of elements not divisible by any of these numbers equals the total number
     * of elements in the array.
     *
     * @param a the array to check
     * @return 1 if the array is a 235 array, otherwise 0
     */
    public static int is235Array(int[] a) {
        int countDiv2 = 0;
        int countDiv3 = 0;
        int countDiv5 = 0;
        int countNotDiv2_3_5 = 0;

        for (int num : a) {
            boolean divisible = false;
            if (num % 2 == 0) {
                countDiv2++;
                divisible = true;
            }
            if (num % 3 == 0) {
                countDiv3++;
                divisible = true;
            }
            if (num % 5 == 0) {
                countDiv5++;
                divisible = true;
            }
            if (!divisible) {
                countNotDiv2_3_5++;
            }
        }

        int totalElements = a.length;
        int sum = countDiv2 + countDiv3 + countDiv5 + countNotDiv2_3_5;

        return (sum == totalElements) ? 1 : 0;
    }

    public static void main(String[] args) {
        // Test cases for is235Array
        System.out.println(is235Array(new int[]{2, 3, 5, 7, 11})); // Expected output: 1
        System.out.println(is235Array(new int[]{2, 3, 6, 7, 11})); // Expected output: 0
        System.out.println(is235Array(new int[]{2, 4, 8, 16, 32})); // Expected output: 1
        System.out.println(is235Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1})); // Expected output: 1
        System.out.println(is235Array(new int[]{7, 11, 77, 49})); // Expected output: 1
        System.out.println(is235Array(new int[]{2})); // Expected output: 1
        System.out.println(is235Array(new int[]{})); // Expected output: 1
        System.out.println(is235Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7})); // Expected output: 1
    }
}
