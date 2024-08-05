package com.basant.github.miu;

public class PatternMatcher {

    /**
     * Checks if array A matches the pattern defined by array P.
     *
     * The pattern array P specifies sequences within A. Each positive element in P indicates
     * a sequence of positive numbers of the specified length, while each negative element in P
     * indicates a sequence of negative numbers of the specified length. The sum of the absolute
     * values in P must be equal to the length of A, and each sequence in A must match the sign
     * specified by the corresponding element in P.
     *
     * Algorithm:
     * 1. Initialize an index to track the current position in array A.
     * 2. Iterate over the elements of P, starting from index 1 (p[0] is the length of pattern).
     * 3. For each element in P:
     *    a. Determine the length of the current subsequence using the absolute value of the element.
     *    b. Check if the subsequence in A matches the required sign (positive or negative).
     *    c. Move the index forward by the length of the current subsequence.
     * 4. After processing all patterns, ensure the index has reached the end of A.
     * 5. Return 1 if the entire A matches the pattern; otherwise, return 0.
     *
     * Examples:
     * - For A = {1, 2, 3, -5, -5, 2, 3, 18} and P = {8, 3, -2, 3}:
     *   The function should return 1 because:
     *   - The first 3 elements (1, 2, 3) are positive as required by P[0].
     *   - The next 2 elements (-5, -5) are negative as required by P[1].
     *   - The last 3 elements (2, 3, 18) are positive as required by P[2].
     *
     * - For A = {1, 2, 3, -5, -5, 2, 3, 18} and P = {4, -1, 3}:
     *   The function should return 0 because:
     *   - The first 4 elements (1, 2, 3, -5) do not match the pattern since A[3] is negative.
     *
     * - For A = {1, 2, 3, -5, -5, 2, 3, 18} and P = {2, -3, 3}:
     *   The function should return 0 because:
     *   - The second pattern element (-3) expects 3 negative numbers, but A[2] is positive.
     *
     * - For A = {1, 2, 3, -5, -5, 2, 3, 18} and P = {8}:
     *   The function should return 0 because:
     *   - The pattern expects all elements to be positive, but there are negative elements in A.
     *
     * @param a The array of integers to be checked.
     * @param p The pattern array where each element defines the length and sign of the subsequences in A.
     * @return 1 if A matches the pattern P, otherwise 0. Returns 0 if any subsequence does not meet the required
     *         sign or if the lengths do not match.
     */
    static int matches(int[] a, int[] p) {
        int index = 0; // To track the current position in array A

        for (int i = 1; i < p.length; i++) { // Start from 1 since p[0] is the length of pattern
            int length = Math.abs(p[i]); // Length of the current subsequence
            boolean isPositive = p[i] > 0; // Determine if the subsequence should be positive

            // Check if the subsequence in A matches the pattern
            for (int j = 0; j < length; j++) {
                if (index >= a.length) {
                    return 0; // Exceeds the length of A
                }
                if ((isPositive && a[index] <= 0) || (!isPositive && a[index] >= 0)) {
                    return 0; // The sign of the element does not match the pattern
                }
                index++;
            }
        }

        // Ensure that we have reached the end of A
        return index == a.length ? 1 : 0;
    }

    /**
     * Main method to test the matches function with different test cases.
     *
     * This method includes various examples of arrays and patterns to demonstrate how the
     * matches function processes different scenarios. It prints the results for each test case.
     *
     * @param args Command line arguments (not used in this method).
     */
    public static void main(String[] args) {
        // Test cases
        int[] a1 = {1, 2, 3, -5, -5, 2, 3, 18};
        int[] p1 = {8, 3, -2, 3};
        int[] a2 = {1, 2, 3, -5, -5, 2, 3, 18};
        int[] p2 = {4, -1, 3};
        int[] a3 = {1, 2, 3, -5, -5, 2, 3, 18};
        int[] p3 = {2, -3, 3};
        int[] a4 = {1, 2, 3, -5, -5, 2, 3, 18};
        int[] p4 = {8};

        System.out.println(matches(a1, p1)); // Should return 1
        System.out.println(matches(a2, p2)); // Should return 0
        System.out.println(matches(a3, p3)); // Should return 0
        System.out.println(matches(a4, p4)); // Should return 0
    }
}
