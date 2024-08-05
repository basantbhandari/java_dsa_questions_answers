package com.basant.github.miu;

import java.util.HashSet;

public class IsMeera {

    /**
     * Checks if the array is a Meera array.
     * A Meera array is such that for all values n in the array, the value 2*n is not in the array.
     *
     * @param a the array to check
     * @return 1 if the array is a Meera array, otherwise 0
     */
    public static int isMeera(int[] a) {
        if (a == null || a.length == 0) {
            return 0; // Consider an empty array as not a Meera array
        }

        HashSet<Integer> set = new HashSet<>();

        // Add all elements to the set
        for (int num : a) {
            set.add(num);
        }

        // Check if for any number in the set, 2 * number is also in the set
        for (int num : a) {
            if (set.contains(2 * num)) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isMeera(new int[]{3, 5, -2})); // Expected: 1
        System.out.println(isMeera(new int[]{8, 3, 4}));  // Expected: 0
    }
}
