package com.basant.github.miu;

import java.util.Arrays;

public class ArraysOperationsDemo {

    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {5, 3, 8, 2, 9};

        // Sorting
        System.out.println("Original array: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));  // Output: [2, 3, 5, 8, 9]

        // Binary Search
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("Index of 8: " + index);  // Output: Index of 8: 3

        // Equality check
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {1, 2, 3};
        System.out.println("Arrays are equal: " + Arrays.equals(numbers1, numbers2));  // Output: true

        // Fill an array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Filled array: " + Arrays.toString(filledArray));  // Output: [7, 7, 7, 7, 7]

        // Copying arrays
        int[] copiedArray = Arrays.copyOf(numbers, 3);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));  // Output: [2, 3, 5]

        // Hash code
        int hashCode = Arrays.hashCode(numbers);
        System.out.println("Hash code: " + hashCode);

        // Compare arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4};
        System.out.println("Comparison result: " + Arrays.compare(array1, array2));  // Output: -1

        // Mismatch
        int mismatchIndex = Arrays.mismatch(array1, array2);
        System.out.println("Mismatch index: " + mismatchIndex);  // Output: 3

        // Parallel sorting
        int[] parallelNumbers = {9, 7, 5, 3, 1};
        Arrays.parallelSort(parallelNumbers);
        System.out.println("Parallel sorted array: " + Arrays.toString(parallelNumbers));  // Output: [1, 3, 5, 7, 9]

        // Demonstrating range operations for sort, binary search, and fill
        int[] rangeArray = {10, 5, 8, 3, 7, 4, 9};
        Arrays.sort(rangeArray, 1, 5);
        System.out.println("Range sorted array: " + Arrays.toString(rangeArray));  // Output: [10, 3, 5, 7, 8, 4, 9]

        int rangeIndex = Arrays.binarySearch(rangeArray, 1, 5, 7);
        System.out.println("Range index of 7: " + rangeIndex);  // Output: Index in the sorted range

        Arrays.fill(rangeArray, 2, 6, 99);
        System.out.println("Range filled array: " + Arrays.toString(rangeArray));  // Output: [10, 3, 99, 99, 99, 99, 9]

        // Testing equality on different ranges
        int[] rangeArray1 = {1, 2, 3, 4, 5};
        int[] rangeArray2 = {1, 2, 3, 6, 7};
        boolean isEqualRange = Arrays.equals(rangeArray1, 1, 4, rangeArray2, 1, 4);
        System.out.println("Range arrays are equal: " + isEqualRange);  // Output: true
    }
}
