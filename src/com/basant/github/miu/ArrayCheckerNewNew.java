package com.basant.github.miu;

public class ArrayCheckerNewNew {

    /**
     * Checks if the given array is a 121 array.
     *
     * A 121 array starts with a sequence of 1s, followed by a sequence of 2s,
     * and ends with the same number of 1s as it started with.
     *
     * @param a The array to check.
     * @return 1 if the array is a 121 array, otherwise 0.
     */
    public static int is121Array(int[] a) {
        int len = a.length;
        if (len == 0) return 0; // Empty array cannot be a 121 array

        int i = 0;
        // Count the number of leading 1s
        while (i < len && a[i] == 1) {
            i++;
        }
        int count1sStart = i;

        // If no 1s at the start, or if array is all 1s
        if (count1sStart == 0 || count1sStart == len) {
            return 0;
        }

        // Count the number of 2s
        int count2s = 0;
        while (i < len && a[i] == 2) {
            count2s++;
            i++;
        }

        // If we didn't find any 2s or there are extra elements
        if (count2s == 0 || i >= len) {
            return 0;
        }

        // Count the number of trailing 1s
        int count1sEnd = 0;
        while (i < len && a[i] == 1) {
            count1sEnd++;
            i++;
        }

        // Check if all elements have been processed and the number of leading and trailing 1s match
        return (i == len && count1sStart == count1sEnd) ? 1 : 0;
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 1};
        int[] arr2 = {1, 1, 2, 2, 2, 1, 1};
        int[] arr3 = {1, 1, 2, 2, 2, 1, 1, 1};
        int[] arr4 = {1, 1, 1, 2, 2, 2, 1, 1};
        int[] arr5 = {1, 1, 1, 1, 1, 1};
        int[] arr6 = {2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 1};
        int[] arr7 = {1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2};
        int[] arr8 = {2, 2, 2};

        System.out.println(is121Array(arr1)); // Expected output: 1
        System.out.println(is121Array(arr2)); // Expected output: 1
        System.out.println(is121Array(arr3)); // Expected output: 0
        System.out.println(is121Array(arr4)); // Expected output: 0
        System.out.println(is121Array(arr5)); // Expected output: 0
        System.out.println(is121Array(arr6)); // Expected output: 0
        System.out.println(is121Array(arr7)); // Expected output: 0
        System.out.println(is121Array(arr8)); // Expected output: 0
    }
}
