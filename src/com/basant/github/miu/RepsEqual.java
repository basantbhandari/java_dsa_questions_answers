package com.basant.github.miu;

public class RepsEqual {

    /**
     * Checks if the array contains only the digits of the number in the same order that they appear in the number.
     *
     * @param a the array of digits.
     * @param n the number to check against.
     * @return 1 if the array contains only the digits of the number in the same order, otherwise 0.
     */
    public static int repsEqual(int[] a, int n) {
        // Convert the number to a string to easily compare digit by digit
        String numberStr = String.valueOf(n);

        // Ignore leading zeroes in the array
        int startIndex = 0;
        while (startIndex < a.length && a[startIndex] == 0) {
            startIndex++;
        }

        // If the length of the remaining array does not match the length of the number string, return 0
        if (a.length - startIndex != numberStr.length()) {
            return 0;
        }

        // Compare each digit of the number with the array
        for (int i = startIndex; i < a.length; i++) {
            if (a[i] != Character.getNumericValue(numberStr.charAt(i - startIndex))) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        int[] testArray1 = {3, 2, 0, 5, 3};
        int number1 = 32053;
        System.out.println("Expected: 1, Result: " + repsEqual(testArray1, number1)); // Expected output: 1

        int[] testArray2 = {3, 2, 0, 5};
        int number2 = 32053;
        System.out.println("Expected: 0, Result: " + repsEqual(testArray2, number2)); // Expected output: 0

        int[] testArray3 = {3, 2, 0, 5, 3, 4};
        int number3 = 32053;
        System.out.println("Expected: 0, Result: " + repsEqual(testArray3, number3)); // Expected output: 0

        int[] testArray4 = {2, 3, 0, 5, 3};
        int number4 = 32053;
        System.out.println("Expected: 0, Result: " + repsEqual(testArray4, number4)); // Expected output: 0

        int[] testArray5 = {9, 3, 1, 1, 2};
        int number5 = 32053;
        System.out.println("Expected: 0, Result: " + repsEqual(testArray5, number5)); // Expected output: 0

        int[] testArray6 = {0, 3, 2, 0, 5, 3};
        int number6 = 32053;
        System.out.println("Expected: 1, Result: " + repsEqual(testArray6, number6)); // Expected output: 1
    }
}

