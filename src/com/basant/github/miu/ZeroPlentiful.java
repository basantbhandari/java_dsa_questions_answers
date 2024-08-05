package com.basant.github.miu;

public class ZeroPlentiful {

    /**
     * Checks if the given array is zero-plentiful.
     * An array is zero-plentiful if it contains at least one 0 and every sequence of 0s is of length at least 4.
     *
     * A number n > 0 is called zero-plentiful if it contains at least one 0 and every sequence of 0s is of length at least 4.
     * Write a method named isZeroPlentiful which returns the number of zero sequences if its array argument is zero-plentiful,
     * otherwise it returns 0.
     *
     * If you are programming in Java or C#, the function signature is int isZeroPlentiful(int[ ] a)
     * If you are programming in C or C++, the function signature is
     * int isZeroPlentiful(int a[ ], int len) where len is the number of elements in the array a.
     *
     * Examples:
     * a is              then function returns  reason
     * {0, 0, 0, 0, 0}         1                because there is one sequence of 0s and its length >= 4.
     * {1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12} 1 2 because there are two sequences of 0s and both have lengths >= 4.
     * {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0} 1 3 because three are three sequences of zeros and all have length >=4
     * {1, 2, 3, 4} 1 0 because there must be at least one 0.
     * {1, 0, 0, 0, 2, 0, 0, 0, 0} 0 because there is a sequence of zeros whose length is less < 4.
     * {0} 0 because there is a sequence of zeroes whose length is < 4.
     * {} 0 because there must be at least one 0.
     *
     * @param a the input array
     * @return the number of zero sequences if the array is zero-plentiful, otherwise returns 0
     */
    public static int isZeroPlentiful(int[] a) {
        int zeroSequences = 0;
        int currentSequenceLength = 0;
        boolean inZeroSequence = false;

        for (int value : a) {
            if (value == 0) {
                if (!inZeroSequence) {
                    inZeroSequence = true; // Start a new sequence of zeros
                    currentSequenceLength = 1; // Initialize sequence length
                } else {
                    currentSequenceLength++; // Increment sequence length
                }
            } else {
                if (inZeroSequence) {
                    // Check if the current zero sequence length is valid
                    if (currentSequenceLength >= 4) {
                        zeroSequences++; // Valid zero sequence, increment count
                    } else {
                        return 0; // Invalid zero sequence length
                    }
                    inZeroSequence = false; // End the current zero sequence
                }
            }
        }

        // Check if there was an ongoing zero sequence at the end of the array
        if (inZeroSequence) {
            if (currentSequenceLength >= 4) {
                zeroSequences++; // Valid zero sequence, increment count
            } else {
                return 0; // Invalid zero sequence length
            }
        }

        // Return the number of valid zero sequences, or 0 if there were none
        return zeroSequences > 0 ? zeroSequences : 0;
    }

    /**
     * Main method to test the isZeroPlentiful function with various test cases.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Test cases
        int[] array1 = {0, 0, 0, 0, 0};
        int[] array2 = {1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12};
        int[] array3 = {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0};
        int[] array4 = {1, 2, 3, 4};
        int[] array5 = {1, 0, 0, 0, 2, 0, 0, 0, 0};
        int[] array6 = {0};
        int[] array7 = {};

        System.out.println(isZeroPlentiful(array1)); // should return 1
        System.out.println(isZeroPlentiful(array2)); // should return 2
        System.out.println(isZeroPlentiful(array3)); // should return 3
        System.out.println(isZeroPlentiful(array4)); // should return 0
        System.out.println(isZeroPlentiful(array5)); // should return 0
        System.out.println(isZeroPlentiful(array6)); // should return 0
        System.out.println(isZeroPlentiful(array7)); // should return 0
    }
}
