package com.basant.github.miu;

/**
 * Utility class for mathematical operations.
 */
public class SameNumberOfFactorsUtils {

    /**
     * Checks if two integers have the same number of factors.
     *
     * @param n1 the first integer
     * @param n2 the second integer
     * @return 1 if both integers have the same number of factors, -1 if either integer is negative, otherwise 0
     */
    public static int sameNumberOfFactors(int n1, int n2) {
        if (n1 < 0 || n2 < 0) {
            return -1;
        }

        int factorsN1 = countFactors(n1);
        int factorsN2 = countFactors(n2);

        return factorsN1 == factorsN2 ? 1 : 0;
    }

    /**
     * Counts the number of factors of a given integer.
     *
     * @param num the integer
     * @return the number of factors
     */
    private static int countFactors(int num) {
        if (num == 0) {
            return 0; // 0 has no factors
        }

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("sameNumberOfFactors(-6, 21): " + sameNumberOfFactors(-6, 21)); // Expected: -1
        System.out.println("sameNumberOfFactors(6, 21): " + sameNumberOfFactors(6, 21)); // Expected: 1
        System.out.println("sameNumberOfFactors(8, 12): " + sameNumberOfFactors(8, 12)); // Expected: 0
        System.out.println("sameNumberOfFactors(23, 97): " + sameNumberOfFactors(23, 97)); // Expected: 1
        System.out.println("sameNumberOfFactors(0, 1): " + sameNumberOfFactors(0, 1)); // Expected: 0
        System.out.println("sameNumberOfFactors(0, 0): " + sameNumberOfFactors(0, 0)); // Expected: 1
    }
}
