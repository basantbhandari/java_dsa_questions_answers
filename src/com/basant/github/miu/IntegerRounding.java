package com.basant.github.miu;

public class IntegerRounding {

    /**
     * Rounds the positive elements of the array to the nearest multiple of n.
     * If two multiples of n are equidistant, the greater one is used.
     * Negative elements of the array are not modified.
     * If n <= 0, no elements of the array are modified.
     *
     * Examples:
     * If a is {1, 2, 3, 4, 5} and n is 2, then a becomes {2, 2, 4, 4, 6}
     * because the 2-based rounding of 1 is 2, the 2-based rounding of 2 is 2,
     * the 2-based rounding of 3 is 4, the 2-based rounding of 4 is 4, and the
     * 2-based rounding of 5 is 6.
     *
     * If a is {1, 2, 3, 4, 5} and n is 3, then a becomes {0, 3, 3, 3, 6}
     * because the 3-based rounding of 1 is 0, the 3-based roundings of 2, 3, 4
     * are all 3, and the 3-based rounding of 5 is 6.
     *
     * If a is {1, 2, 3, 4, 5} and n is -3, then a remains {1, 2, 3, 4, 5}
     * because the array is not changed if n <= 0.
     *
     * If a is {-1, -2, -3, -4, -5} and n is 3, then a remains {-1, -2, -3, -4, -5}
     * because negative numbers are not rounded.
     *
     * If a is {-18, 1, 2, 3, 4, 5} and n is 4, then a becomes {-18, 0, 4, 4, 4, 4}
     * because -18 is negative and hence is not modified, the 4-based rounding of
     * 1 is 0, and the 4-based roundings of 2, 3, 4, 5 are all 4.
     *
     * If a is {1, 2, 3, 4, 5} and n is 5, then a becomes {0, 0, 5, 5, 5}
     *
     * If a is {1, 2, 3, 4, 5} and n is 100, then a becomes {0, 0, 0, 0, 0}
     *
     * @param a the array of integers to be rounded
     * @param n the base for rounding
     */
    public static int[] doIntegerBasedRounding(int[] a, int n) {
        if (n <= 0) {
            return a;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                int lowerMultiple = (a[i] / n) * n;
                int upperMultiple = lowerMultiple + n;
                if (a[i] - lowerMultiple < upperMultiple - a[i]) {
                    a[i] = lowerMultiple;
                } else {
                    a[i] = upperMultiple;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        // Test cases
        int[] array1 = {1, 2, 3, 4, 5};
        printArray(doIntegerBasedRounding(array1, 2)); // should print [2, 2, 4, 4, 6]

        int[] array2 = {1, 2, 3, 4, 5};
        printArray(doIntegerBasedRounding(array2, 3)); // should print [0, 3, 3, 3, 6]

        int[] array3 = {1, 2, 3, 4, 5};
        printArray(doIntegerBasedRounding(array3, -3)); // should print [1, 2, 3, 4, 5]

        int[] array4 = {-1, -2, -3, -4, -5};
        printArray(doIntegerBasedRounding(array4, 3)); // should print [-1, -2, -3, -4, -5]

        int[] array5 = {-18, 1, 2, 3, 4, 5};
        printArray(doIntegerBasedRounding(array5, 4)); // should print [-18, 0, 4, 4, 4, 4]

        int[] array6 = {1, 2, 3, 4, 5};
        printArray(doIntegerBasedRounding(array6, 5)); // should print [0, 0, 5, 5, 5]

        int[] array7 = {1, 2, 3, 4, 5};
        printArray(doIntegerBasedRounding(array7, 100)); // should print [0, 0, 0, 0, 0]
    }

    // Utility method to print array
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
