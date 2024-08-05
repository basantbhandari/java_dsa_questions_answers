package com.basant.github.miu;


public class squarePairCounter {

    /**
     * Counts the number of square pairs in the array.
     * A square pair is defined as a pair (a[i], a[j]) where i < j and a[i] + a[j] is a perfect square.
     * @param a The array of integers.
     * @return The number of square pairs.
     */
    public static int countSquarePairs(int[] a) {
        if (a.length < 2) return 0;

        int count = 0;
        int len = a.length;

        // Check all pairs (i, j) with i < j
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] > 0 && a[j] > 0) {
                    int sum = a[i] + a[j];
                    if (isPerfectSquare(sum)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    /**
     * Checks if a number is a perfect square.
     * @param num The number to check.
     * @return True if num is a perfect square, false otherwise.
     */
    private static boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        int sqrt = (int) Math.sqrt(num);
        return num == sqrt * sqrt;
    }

    public static void main(String[] args) {
        // Test cases with expected values
        System.out.println("Number of square-pairs in {9, 0, 2, -5, 7} is: " + countSquarePairs(new int[]{9, 0, 2, -5, 7}));
        // Expected output: 2 (Pairs: <2, 7> and <7, 9>)

        System.out.println("Number of square-pairs in {9} is: " + countSquarePairs(new int[]{9}));
        // Expected output: 0 (Not enough elements for a pair)

        System.out.println("Number of square-pairs in {3, 0, 6, 10, 15, -17, 1, 9} is: " + countSquarePairs(new int[]{3, 0, 6, 10, 15, -17, 1, 9}));
        // Expected output: 3 (Pairs: <1, 9>, <6, 10>, <6, 15>)
    }
}
