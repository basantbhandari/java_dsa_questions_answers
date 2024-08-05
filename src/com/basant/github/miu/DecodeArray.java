package com.basant.github.miu;

public class DecodeArray {

    /**
     * Decodes an integer array to a number based on the rules specified.
     * The first element of the array is any number and if it is negative then the encoded number is negative.
     * Each digit of the number is the absolute value of the difference of two adjacent elements of the array.
     * The most significant digit of the number is the absolute value of the difference of the first two elements of the array.
     *
     * For example, the array {2, -3, -2, 6, 9, 18} encodes the number 51839 because:
     * 5 is abs(2 - (-3))
     * 1 is abs(-3 - (-2))
     * 8 is abs(-2 - 6)
     * 3 is abs(6-9)
     * 9 is abs(9-18)
     * The number is positive because the first element of the array is >= 0.
     *
     * @param a the encoded integer array
     * @return the decoded number
     */
    public static int decodeArray(int[] a) {
        if (a.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length - 1; i++) {
            result.append(Math.abs(a[i] - a[i + 1]));
        }

        int decodedNumber = Integer.parseInt(result.toString());
        return a[0] >= 0 ? decodedNumber : -decodedNumber;
    }

    public static void main(String[] args) {
        // Test cases
        int[] array1 = {2, -3, -2, 6, 9, 18};
        int[] array2 = {0, -3, 0, -4, 0};
        int[] array3 = {-1, 5, 8, 17, 15};
        int[] array4 = {1, 5, 8, 17, 15};
        int[] array5 = {111, 115, 118, 127, 125};
        int[] array6 = {1, 1};

        System.out.println(decodeArray(array1)); // should return 51839
        System.out.println(decodeArray(array2)); // should return 3344
        System.out.println(decodeArray(array3)); // should return -6392
        System.out.println(decodeArray(array4)); // should return 4392
        System.out.println(decodeArray(array5)); // should return 4392
        System.out.println(decodeArray(array6)); // should return 0
    }
}
