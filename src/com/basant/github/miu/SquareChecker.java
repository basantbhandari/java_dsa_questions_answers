package com.basant.github.miu;

public class SquareChecker {

    /**
     * Checks if the given integer is a perfect square without using any library functions.
     *
     * @param n the integer to check.
     * @return 1 if the integer is a perfect square, otherwise 0.
     *
     * The method iterates through numbers starting from 0 up to the number itself, checking if the square
     * of any number equals the given integer.
     */
    public static int isSquare(int n) {
        if (n < 0) {
            return 0; // Negative numbers cannot be perfect squares
        }
        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) {
                return 1; // Found a number whose square is equal to n
            }
        }
        return 0; // No number's square is equal to n
    }

    public static void main(String[] args) {
        // Test cases with explanations
        System.out.println("isSquare(4): " + isSquare(4)); // Expected: 1 because 4 = 2*2
        System.out.println("isSquare(25): " + isSquare(25)); // Expected: 1 because 25 = 5*5
        System.out.println("isSquare(-4): " + isSquare(-4)); // Expected: 0 because there is no integer whose square is -4
        System.out.println("isSquare(8): " + isSquare(8)); // Expected: 0 because the square root of 8 is not an integer
        System.out.println("isSquare(0): " + isSquare(0)); // Expected: 1 because 0 = 0*0
    }
}
