package com.basant.github.miu;

public class RailroadTieArray {

    /**
     * Determines if the given array is a railroad-tie array.
     *
     * An array is defined as a railroad-tie array if it satisfies the following conditions:
     * 1. The array contains at least one non-zero element.
     * 2. Every non-zero element has exactly one non-zero neighbor.
     * 3. Every zero element has exactly two non-zero neighbors.
     *
     * For example:
     * - The array {1, 2, 0, 3, -18, 0, 2, 2} is a railroad-tie array because:
     *   - Each non-zero element has exactly one non-zero neighbor.
     *   - Each zero element has exactly two non-zero neighbors.
     *
     * - The array {1, 2, 3, 0, 2, 2} is not a railroad-tie array because:
     *   - The element 2 has two non-zero neighbors (1 and 3).
     *   - The element 0 only has one non-zero neighbor (2).
     *
     * @param a the array to be checked
     * @return 1 if the array is a railroad-tie array, otherwise 0
     */
    public static int isRailroadTie(int[] a) {
        if (a == null || a.length == 0) {
            return 0; // Array is empty or null
        }

        boolean hasNonZero = false;

        for (int i = 0; i < a.length; i++) {
            // Check if the current element is non-zero
            if (a[i] != 0) {
                hasNonZero = true;
                int nonZeroNeighbors = 0;
                // Check left neighbor
                if (i > 0 && a[i - 1] != 0) {
                    nonZeroNeighbors++;
                }
                // Check right neighbor
                if (i < a.length - 1 && a[i + 1] != 0) {
                    nonZeroNeighbors++;
                }
                // Every non-zero element must have exactly one non-zero neighbor
                if (nonZeroNeighbors != 1) {
                    return 0;
                }
            } else {
                // The element is zero, so check its non-zero neighbors
                int nonZeroNeighbors = 0;
                // Check left neighbor
                if (i > 0 && a[i - 1] != 0) {
                    nonZeroNeighbors++;
                }
                // Check right neighbor
                if (i < a.length - 1 && a[i + 1] != 0) {
                    nonZeroNeighbors++;
                }
                // Every zero element must have exactly two non-zero neighbors
                if (nonZeroNeighbors != 2) {
                    return 0;
                }
            }
        }

        // Check if there was at least one non-zero element
        return hasNonZero ? 1 : 0;
    }

    public static void main(String[] args) {
        // Example usage
        int[] exampleArray = {1, 2, 0, 3, -18, 0, 2, 2};
        System.out.println(isRailroadTie(exampleArray)); // Should return 1

        int[] nonRailroadTieArray = {1, 2, 3, 0, 2, 2};
        System.out.println(isRailroadTie(nonRailroadTieArray)); // Should return 0
    }
}
