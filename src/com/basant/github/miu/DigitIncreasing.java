package com.basant.github.miu;

public class DigitIncreasing {

    /**
     * Checks if a number is digit-increasing.
     *
     * A number is called digit-increasing if it is equal to n + nn + nnn + ...
     * for some digit n between 1 and 9.
     * For example, 24 is digit-increasing because it equals 2 + 22 (here n = 2).
     *
     * The function returns 1 if the number is digit-increasing, otherwise it returns 0.
     *
     * Examples:
     *
     * if n is then function returns reason
     * 7         1         because 7 = 7 (here n is 7)
     * 36        1         because 36 = 3 + 33
     * 984       1         because 984 = 8 + 88 + 888
     * 7404      1         because 7404 = 6 + 66 + 666 + 6666
     *
     * @param n the number to check
     * @return 1 if the number is digit-increasing, otherwise 0
     */
    public static int isDigitIncreasing(int n) {
        // Iterate over all possible digits from 1 to 9
        for (int digit = 1; digit <= 9; digit++) {
            int sum = 0;
            int currentTerm = 0;

            // Construct terms like n, nn, nnn, ... and add to the sum
            for (int i = 1; sum < n; i++) {
                // Append the current digit to the currentTerm
                currentTerm = currentTerm * 10 + digit;
                // Add the currentTerm to the sum
                sum += currentTerm;

                // Check if the sum matches the given number
                if (sum == n) {
                    return 1;
                }
            }
        }

        // If no digit from 1 to 9 makes the number digit-increasing, return 0
        return 0;
    }

    /**
     * Main method to test the isDigitIncreasing function with various test cases.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Test cases
        int[] testCases = {7, 36, 984, 7404, 1, 15, 100};

        for (int testCase : testCases) {
            System.out.println("isDigitIncreasing(" + testCase + ") = " + isDigitIncreasing(testCase));
        }
    }
}
