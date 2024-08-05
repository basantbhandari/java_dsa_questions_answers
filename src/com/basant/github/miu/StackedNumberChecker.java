package com.basant.github.miu;

public class StackedNumberChecker {

    /**
     * Checks if a given number is a stacked number.
     *
     * A number is considered stacked if it can be expressed as the sum of the first k positive integers
     * for some positive integer k. For example, 10 is a stacked number because it can be written as
     * 1 + 2 + 3 + 4, which is the sum of the first 4 positive integers.
     *
     * Algorithm:
     * 1. Start with k = 1.
     * 2. Compute the sum of the first k positive integers.
     * 3. If the sum equals the input number n, return 1.
     * 4. If the sum exceeds n, return 0.
     * 5. Increment k and repeat until the sum exceeds n.
     *
     * Example:
     * - For n = 10:
     *   - k = 1: Sum = 1
     *   - k = 2: Sum = 3
     *   - k = 3: Sum = 6
     *   - k = 4: Sum = 10 (match found)
     *   - Result: 1
     * - For n = 7:
     *   - k = 1: Sum = 1
     *   - k = 2: Sum = 3
     *   - k = 3: Sum = 6
     *   - k = 4: Sum = 10 (sum exceeds 7, no match found)
     *   - Result: 0
     *
     * @param n The number to check.
     * @return 1 if n is a stacked number, otherwise 0.
     */
    public static int isStacked(int n) {
        int k = 1;
        int sum = 0;

        while (sum < n) {
            sum += k;
            if (sum == n) {
                return 1;
            }
            k++;
        }

        return 0;
    }

    /**
     * Main method to test the isStacked function with different test cases.
     *
     * This method includes various examples of numbers to demonstrate how the
     * isStacked function processes different scenarios. It prints the results for each test case.
     *
     * @param args Command line arguments (not used in this method).
     */
    public static void main(String[] args) {
        // Test cases
        System.out.println(isStacked(10)); // Should return 1
        System.out.println(isStacked(7));  // Should return 0
        System.out.println(isStacked(15)); // Should return 1
        System.out.println(isStacked(8));  // Should return 0
    }
}
