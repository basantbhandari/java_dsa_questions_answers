package com.basant.github.miu;

public class ArrayFiller {

    /**
     * Function to create a new array of length n where the first k elements are
     * the same as the first k elements of arr, and the remaining elements consist
     * of repeating blocks of the first k elements.
     *
     * @param arr - the input array
     * @param k - number of elements to repeat in the new array
     * @param n - length of the new array
     * @return - a new array of length n with the specified pattern, or null if k or n is not positive
     */
    public static int[] fill(int[] arr, int k, int n) {
        // Validate the input
        if (k <= 0 || n <= 0 || arr == null || arr.length < k) {
            return null;
        }

        // Initialize the result array
        int[] arr2 = new int[n];

        // Fill the first k elements with the first k elements of arr
        for (int i = 0; i < k; i++) {
            arr2[i] = arr[i];
        }

        // Fill the remaining elements with repeating blocks of the first k elements
        for (int i = k; i < n; i++) {
            arr2[i] = arr[(i - k) % k];
        }

        return arr2;
    }

    public static void main(String[] args) {
        // Test cases
        printArray(fill(new int[]{1, 2, 3, 5, 9, 12, -2, -1}, 3, 10)); // Expected: {1, 2, 3, 1, 2, 3, 1, 2, 3, 1}
        printArray(fill(new int[]{4, 2, -3, 12}, 1, 5)); // Expected: {4, 4, 4, 4, 4}
        printArray(fill(new int[]{2, 6, 9, 0, -3}, 0, 4)); // Expected: null
    }

    // Utility method to print an array
    private static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println("null");
        } else {
            System.out.print("{");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
    }
}
