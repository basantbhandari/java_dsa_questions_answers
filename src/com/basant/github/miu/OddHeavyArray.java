package com.basant.github.miu;

public class OddHeavyArray {

    /**
     * Determines if the given array is odd-heavy.
     *
     * An array is defined to be odd-heavy if:
     * 1. It contains at least one odd element.
     * 2. Every odd element is greater than every even element.
     *
     * Examples:
     * - The array {11, 4, 9, 2, 8} is odd-heavy because the two odd elements (11 and 9) are greater than all the even elements.
     * - The array {11, 4, 9, 2, 3, 10} is not odd-heavy because the even element 10 is greater than the odd element 9.
     *
     * @param a the array to be checked
     * @return 1 if the array is odd-heavy, otherwise 0
     */
    public static int isOddHeavy(int[] a) {
        if (a == null || a.length == 0) {
            return 0; // Array is null or empty
        }

        Integer minOdd = null;
        Integer maxEven = null;

        for (int value : a) {
            if (value % 2 != 0) { // Odd value
                if (minOdd == null || value < minOdd) {
                    minOdd = value;
                }
            } else { // Even value
                if (maxEven == null || value > maxEven) {
                    maxEven = value;
                }
            }
        }

        // Check if there is at least one odd element
        if (minOdd == null) {
            return 0;
        }

        // Check if every odd element is greater than every even element
        if (maxEven == null || minOdd > maxEven) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[] exampleArray1 = {11, 4, 9, 2, 8};
        System.out.println(isOddHeavy(exampleArray1)); // Should return 1

        int[] exampleArray2 = {11, 4, 9, 2, 3, 10};
        System.out.println(isOddHeavy(exampleArray2)); // Should return 0

        int[] exampleArray3 = {1};
        System.out.println(isOddHeavy(exampleArray3)); // Should return 1

        int[] exampleArray4 = {2};
        System.out.println(isOddHeavy(exampleArray4)); // Should return 0

        int[] exampleArray5 = {1, 1, 1, 1, 1, 1};
        System.out.println(isOddHeavy(exampleArray5)); // Should return 1

        int[] exampleArray6 = {2, 4, 6, 8, 11};
        System.out.println(isOddHeavy(exampleArray6)); // Should return 1

        int[] exampleArray7 = {-2, -4, -6, -8, -11};
        System.out.println(isOddHeavy(exampleArray7)); // Should return 0
    }
}
