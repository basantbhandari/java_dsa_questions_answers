package com.basant.github.miu;

public class FactorChecker {

    /**
     * Function to check if n has k-small factors.
     * An integer n has k-small factors if there exist factors u and v such that:
     * - u * v = n
     * - u < k
     * - v < k
     *
     * @param k - positive integer to determine the maximum value of factors
     * @param n - positive integer to check for k-small factors
     * @return true if n has k-small factors, otherwise false
     */
    public static boolean hasKSmallFactors(int k, int n) {
        // Check if k or n is not positive
        if (k <= 0 || n <= 0) {
            return false;
        }

        // Iterate to find factors
        for (int u = 1; u < k; u++) {
            if (n % u == 0) { // u is a factor of n
                int v = n / u;
                // Check if the corresponding factor is also less than k
                if (v < k) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("hasKSmallFactors(7, 30): " + hasKSmallFactors(7, 30)); // Expected: true
        System.out.println("hasKSmallFactors(6, 14): " + hasKSmallFactors(6, 14)); // Expected: false
        System.out.println("hasKSmallFactors(6, 30): " + hasKSmallFactors(6, 30)); // Expected: false
        System.out.println("hasKSmallFactors(10, 20): " + hasKSmallFactors(10, 20)); // Expected: true
        System.out.println("hasKSmallFactors(10, 22): " + hasKSmallFactors(10, 22)); // Expected: false
        System.out.println("hasKSmallFactors(-5, 20): " + hasKSmallFactors(-5, 20)); // Expected: false
        System.out.println("hasKSmallFactors(5, -20): " + hasKSmallFactors(5, -20)); // Expected: false
    }
}
