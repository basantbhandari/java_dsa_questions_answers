package com.basant.github.miu;

public class SumSafeChecker {

    /**
     * Checks if the given array is sum-safe.
     *
     * An array is considered sum-safe if none of its elements are equal to the sum of all its elements.
     * For example, the array {5, -5, 0} is not sum-safe because the sum of its elements is 0,
     * and 0 is one of its elements. The array {5, -2, 1} is sum-safe because the sum of its elements is 4,
     * and none of its elements equal 4.
     *
     * Algorithm:
     * 1. If the array is empty, return 0.
     * 2. Compute the sum of the array elements.
     * 3. Check if any element equals the computed sum.
     * 4. Return 1 if no element equals the sum, otherwise return 0.
     *
     * Example:
     * - For array = {5, -5, 0}:
     *   - Sum = 0
     *   - Since 0 is in the array, return 0.
     * - For array = {5, -2, 1}:
     *   - Sum = 4
     *   - Since 4 is not in the array, return 1.
     *
     * @param a The array to check.
     * @return 1 if the array is sum-safe, otherwise 0.
     */
    public static int isSumSafe(int[] a) {
        if (a.length == 0) {
            return 0; // Return 0 for empty array
        }

        int sum = 0;
        for (int num : a) {
            sum += num;
        }

        for (int num : a) {
            if (num == sum) {
                return 0; // Not sum-safe
            }
        }

        return 1; // Sum-safe
    }

    /**
     * Main method to test the isSumSafe function with different test cases.
     *
     * This method demonstrates how the isSumSafe function processes various input arrays and prints the results.
     *
     * @param args Command line arguments (not used in this method).
     */
    public static void main(String[] args) {
        // Test cases
        System.out.println(isSumSafe(new int[] {5, -5, 0}));  // Should return 0
        System.out.println(isSumSafe(new int[] {5, -2, 1}));  // Should return 1
        System.out.println(isSumSafe(new int[] {1, 2, 3}));   // Should return 0
        System.out.println(isSumSafe(new int[] {1, 2, 3, 6}));// Should return 1
        System.out.println(isSumSafe(new int[] {}));          // Should return 0
    }
}
