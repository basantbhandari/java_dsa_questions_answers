package com.basant.github.miu;

public class ConsecutiveFactors {

    /**
     * Checks if a number is consecutive-factored.
     *
     * A number is consecutive-factored if it has factors i and j such that:
     * - i > 1
     * - j > 1
     * - j = i + 1
     *
     * @param n The number to check
     * @return 1 if the number is consecutive-factored, otherwise 0
     */
    public static int isConsecutiveFactored(int n) {
        if (n <= 1) return 0; // Numbers less than or equal to 1 cannot be consecutive-factored

        // Check for all possible factors i and j such that j = i + 1
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                int j = i + 1;
                // Check if j is also a factor of n
                if (n % j == 0) {
                    return 1; // Found consecutive factors i and j
                }
            }
        }

        return 0; // No consecutive factors found
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("isConsecutiveFactored(6): " + isConsecutiveFactored(6));  // Expected: 1 (2 and 3)
        System.out.println("isConsecutiveFactored(12): " + isConsecutiveFactored(12)); // Expected: 1 (2 and 3)
        System.out.println("isConsecutiveFactored(30): " + isConsecutiveFactored(30)); // Expected: 1 (5 and 6)
        System.out.println("isConsecutiveFactored(20): " + isConsecutiveFactored(20)); // Expected: 0 (No consecutive factors)
        System.out.println("isConsecutiveFactored(1): " + isConsecutiveFactored(1));  // Expected: 0 (No factors > 1)
    }
}
