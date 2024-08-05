package com.basant.github.miu;

public class UniqueChecker {

    /**
     * Checks if the array is n-unique, meaning exactly one pair of elements sums to n.
     *
     * @param a the array of integers to check.
     * @param n the target sum to check for unique pairs.
     * @return 1 if exactly one pair sums to n, otherwise 0.
     *
     * This method iterates through the array to find pairs of elements that sum to the target value n.
     * It keeps a count of how many such pairs exist. If there is exactly one pair, it returns 1.
     * If there are zero pairs or more than one pair, it returns 0.
     * An array with fewer than 2 elements cannot have a pair, so it also returns 0 in that case.
     */
    public static int isNUnique(int[] a, int n) {
        int count = 0; // Counter for pairs that sum to n

        // Check if the array has less than 2 elements
        if (a.length < 2) {
            return 0; // Not enough elements to form a pair
        }

        // Iterate through the array to find pairs
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                // Check if the sum of the pair equals n
                if (a[i] + a[j] == n) {
                    count++; // Increment the pair count
                }
                // If more than one pair is found, exit early
                if (count > 1) {
                    return 0; // More than one pair found
                }
            }
        }

        // Return 1 if exactly one pair sums to n, otherwise 0
        return count == 1 ? 1 : 0;
    }

    public static void main(String[] args) {
        // Test cases with expected results
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 6));  // Expected: 0
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 10)); // Expected: 0
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 11)); // Expected: 1
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 8));  // Expected: 0
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 4));  // Expected: 0
        System.out.println(isNUnique(new int[]{1}, 2));               // Expected: 0
    }
}
