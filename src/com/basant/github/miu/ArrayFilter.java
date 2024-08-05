package com.basant.github.miu;

public class ArrayFilter {

    /**
     * Filters an array based on the binary representation of a non-negative integer.
     * The elements that are selected are those whose indices correspond to the powers
     * of 2 that sum to the integer.
     *
     * For example:
     * n: 88 (binary: 1011000) => indices: 3, 4, 6
     * array: {8, 4, 9, 0, 3, 1, 2}
     * result: {0, 3, 2}
     *
     * @param a the array to filter
     * @param n the non-negative integer used for filtering
     * @return the filtered array or null if the input array is not big enough
     */
    public static int[] filterArray(int[] a, int n) {
        // Calculate the number of 1s in the binary representation of n
        int count = 0;
        int temp = n;
        while (temp > 0) {
            if (temp % 2 == 1) count++;
            temp /= 2;
        }

        // Check if the array is big enough
        if (count > a.length) return null;

        // Allocate the result array
        int[] result = new int[count];
        int index = 0;
        int pos = 0;
        temp = n;

        // Fill the result array with selected elements
        while (temp > 0) {
            if (temp % 2 == 1) {
                if (pos >= a.length) return null; // Check for array bounds
                result[index++] = a[pos];
            }
            pos++;
            temp /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage and test cases
        int[] array1 = {8, 4, 9, 0, 3, 1, 2};
        int n1 = 88;
        int[] result1 = filterArray(array1, n1);
        if (result1 != null) {
            for (int i : result1) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("null");
        }
        System.out.println(); // Output should be: 0 3 2

        int[] array2 = {18};
        int n2 = 3;
        int[] result2 = filterArray(array2, n2);
        if (result2 != null) {
            for (int i : result2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("null");
        }
        System.out.println(); // Output should be: null
    }
}
