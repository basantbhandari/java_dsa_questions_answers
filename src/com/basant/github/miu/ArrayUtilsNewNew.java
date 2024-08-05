package com.basant.github.miu;

/**
 * Class ArrayUtils contains utility methods for array operations.
 */
public class ArrayUtilsNewNew {

    /**
     * Returns 1 if all elements of the array have the same value, otherwise returns 0.
     *
     * @param a The array of integers.
     * @return 1 if all elements are the same, otherwise 0.
     */
    public static int allValuesTheSame(int[] a) {
        // If the array is empty, return 0
        if (a.length == 0) {
            return 0;
        }

        // Get the first element
        int firstValue = a[0];

        // Check if all elements are the same as the first element
        for (int i = 1; i < a.length; i++) {
            if (a[i] != firstValue) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("allValuesTheSame({1, 1, 1, 1}): " + allValuesTheSame(new int[]{1, 1, 1, 1})); // Expected: 1
        System.out.println("allValuesTheSame({83, 83, 83}): " + allValuesTheSame(new int[]{83, 83, 83})); // Expected: 1
        System.out.println("allValuesTheSame({0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}): " + allValuesTheSame(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0})); // Expected: 1
        System.out.println("allValuesTheSame({1, -2343456, 1, -2343456}): " + allValuesTheSame(new int[]{1, -2343456, 1, -2343456})); // Expected: 0
        System.out.println("allValuesTheSame({0, 0, 0, 0, -1}): " + allValuesTheSame(new int[]{0, 0, 0, 0, -1})); // Expected: 0
        System.out.println("allValuesTheSame(new int[]{432123456}): " + allValuesTheSame(new int[]{432123456})); // Expected: 1
        System.out.println("allValuesTheSame(new int[]{-432123456}): " + allValuesTheSame(new int[]{-432123456})); // Expected: 1
        System.out.println("allValuesTheSame(new int[]{}): " + allValuesTheSame(new int[]{})); // Expected: 0
    }
}
