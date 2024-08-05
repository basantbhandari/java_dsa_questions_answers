package com.basant.github.miu;

public class ExponentCalculator {

    /**
     * Returns the largest exponent x such that p^x evenly divides n.
     * If p is <= 1, the method returns -1.
     *
     * @param n the number to be divided
     * @param p the base number
     * @return the largest exponent x such that p^x evenly divides n, or -1 if p <= 1
     */
    public static int getExponent(int n, int p) {
        if (p <= 1) {
            return -1; // Return -1 if p is less than or equal to 1
        }

        int exponent = 0;
        while (n % p == 0) {
            n /= p;
            exponent++;
        }
        return exponent;
    }

    public static void main(String[] args) {
        // Example usage and test cases
        System.out.println(getExponent(162, 3)); // Should return 4
        System.out.println(getExponent(27, 3));  // Should return 3
        System.out.println(getExponent(28, 3));  // Should return 0
        System.out.println(getExponent(280, 7)); // Should return 1
        System.out.println(getExponent(-250, 5));// Should return 3
        System.out.println(getExponent(18, 1));  // Should return -1
        System.out.println(getExponent(128, 4)); // Should return 3
    }
}
