package com.basant.github.miu;

/**
 * Class NumberUtils contains utility methods for number operations.
 */
public class NumberUtils {

    /**
     * Checks if the given integer n is a perfect square.
     *
     * A number is considered a perfect square if there exists an integer k
     * such that n = k * k. For example:
     * - 4 is a perfect square because 2 * 2 = 4.
     * - 25 is a perfect square because 5 * 5 = 25.
     * - -4 is not a perfect square because there is no integer k such that k * k = -4.
     * - 8 is not a perfect square because the square root of 8 is not an integer.
     * - 0 is a perfect square because 0 * 0 = 0.
     *
     * @param n The integer to be checked.
     * @return 1 if n is a perfect square, otherwise 0.
     */
    public static int isSquare(int n) {
        // Check if n is negative, which cannot be a perfect square
        if (n < 0) {
            return 0;
        }

        // Special case for 0
        if (n == 0) {
            return 1;
        }

        int i = 0;
        while (i * i <= n) {
            if (i * i == n) {
                return 1; // n is a perfect square
            }
            i++;
        }

        return 0; // n is not a perfect square
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("isSquare(4): " + isSquare(4));   // Expected: 1
        System.out.println("isSquare(25): " + isSquare(25)); // Expected: 1
        System.out.println("isSquare(-4): " + isSquare(-4)); // Expected: 0
        System.out.println("isSquare(8): " + isSquare(8));   // Expected: 0
        System.out.println("isSquare(0): " + isSquare(0));   // Expected: 1
    }
}
