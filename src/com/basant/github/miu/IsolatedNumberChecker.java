package com.basant.github.miu;


import java.util.HashSet;
import java.util.Set;

public class IsolatedNumberChecker {

    /**
     * Checks if a number is isolated.
     *
     * A number is considered isolated if none of the digits in its square appear in its cube.
     * For example, the number 163 is isolated because the digits in 163*163 (26569) do not
     * appear in 163*163*163 (4330747). On the other hand, 162 is not isolated because the digits
     * in 162*162 (26244) appear in 162*162*162 (4251528).
     *
     * The function returns:
     * - 1 if the number is isolated,
     * - 0 if it is not isolated,
     * - -1 if it cannot determine (e.g., if n < 1 or n > 2,097,151).
     *
     * Algorithm:
     * 1. Check if the number is within valid range.
     * 2. Compute square and cube of the number.
     * 3. Extract digits from square and cube.
     * 4. Check if any digit from the square is present in the cube.
     * 5. Return 1 if isolated, otherwise return 0.
     *
     * @param n The number to check.
     * @return 1 if the number is isolated, 0 if not, and -1 if it cannot determine.
     */
    public static int isIsolated(long n) {
        // Check for valid range
        if (n < 1 || n > 2097151) {
            return -1;
        }

        // Compute square and cube
        long square = n * n;
        long cube = n * n * n;

        // Extract digits from square
        Set<Character> digitsInSquare = new HashSet<>();
        for (char digit : Long.toString(square).toCharArray()) {
            digitsInSquare.add(digit);
        }

        // Extract digits from cube
        Set<Character> digitsInCube = new HashSet<>();
        for (char digit : Long.toString(cube).toCharArray()) {
            digitsInCube.add(digit);
        }

        // Check if any digit in square is present in cube
        for (char digit : digitsInSquare) {
            if (digitsInCube.contains(digit)) {
                return 0; // Not isolated
            }
        }

        return 1; // Isolated
    }

    /**
     * Main method to test the isIsolated function with different test cases.
     *
     * This method demonstrates how the isIsolated function processes various input numbers
     * and prints the results.
     *
     * @param args Command line arguments (not used in this method).
     */
    public static void main(String[] args) {
        // Test cases
        System.out.println(isIsolated(163));  // Should return 1
        System.out.println(isIsolated(162));  // Should return 0
        System.out.println(isIsolated(2));    // Should return 1
        System.out.println(isIsolated(3));    // Should return 0
        System.out.println(isIsolated(8));    // Should return 1
        System.out.println(isIsolated(9));    // Should return 0
        System.out.println(isIsolated(14));   // Should return 1
        System.out.println(isIsolated(24));   // Should return 1
        System.out.println(isIsolated(28));   // Should return 0
        System.out.println(isIsolated(34));   // Should return 1
        System.out.println(isIsolated(58));   // Should return 1
        System.out.println(isIsolated(63));   // Should return 0
        System.out.println(isIsolated(2097152)); // Should return -1 (exceeds limit)
        System.out.println(isIsolated(0));     // Should return -1 (below limit)
    }
}
