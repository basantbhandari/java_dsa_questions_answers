package com.basant.github.miu;

public class MinMaxDisjoint {

    /**
     * Checks if the given array is minmax-disjoint.
     *
     * An array is minmax-disjoint if:
     * 1. The minimum and maximum values are not equal.
     * 2. The minimum and maximum values are not adjacent to one another.
     * 3. The minimum value occurs exactly once.
     * 4. The maximum value occurs exactly once.
     *
     * @param a the integer array to be checked
     * @return 1 if the array is minmax-disjoint, otherwise 0
     */
    public static int isMinMaxDisjoint(int[] a) {
        if (a.length < 2) {
            return 0; // Not enough elements to have non-adjacent min and max
        }

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        int minIndex = -1;
        int maxIndex = -1;

        int minCount = 0;
        int maxCount = 0;


        // Traverse the array to find min and max values and their indices
        for (int i = 0; i < a.length; i++) {
            if (a[i] < minValue) {
                minValue = a[i];
                minIndex = i;
                minCount = 1;
            } else if (a[i] == minValue) {
                minCount++;
            }

            if (a[i] > maxValue) {
                maxValue = a[i];
                maxIndex = i;
                maxCount = 1;
            } else if (a[i] == maxValue) {
                maxCount++;
            }
        }

        // Check if min and max are the same
        if (minValue == maxValue) {
            return 0;
        }

        // Check if min and max are adjacent
        if (Math.abs(minIndex - maxIndex) == 1) {
            return 0;
        }

        // Check if min and max occur exactly once
        if (minCount != 1 || maxCount != 1) {
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isMinMaxDisjoint(new int[]{18, -1, 3, 4, 0}));    // Should return 0
        System.out.println(isMinMaxDisjoint(new int[]{9, 0, 5, 9}));         // Should return 0
        System.out.println(isMinMaxDisjoint(new int[]{0, 5, 18, 0, 9}));    // Should return 0
        System.out.println(isMinMaxDisjoint(new int[]{7, 7, 7, 7}));        // Should return 0
        System.out.println(isMinMaxDisjoint(new int[]{}));                   // Should return 0
        System.out.println(isMinMaxDisjoint(new int[]{1, 2}));              // Should return 0
        System.out.println(isMinMaxDisjoint(new int[]{1}));                 // Should return 0
        System.out.println(isMinMaxDisjoint(new int[]{5, 4, 1, 3, 2}));    // Should return 1
    }
}
