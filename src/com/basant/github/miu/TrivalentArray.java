package com.basant.github.miu;

import java.util.HashSet;
import java.util.Set;

public class TrivalentArray {

    /**
     * Checks if the array is trivalent.
     * An array is trivalent if it contains exactly three different values.
     *
     * @param a the array of integers to be checked
     * @return 1 if the array is trivalent, otherwise 0
     */
    public static int isTrivalent(int[] a) {
        // Create a set to track unique values
        Set<Integer> uniqueValues = new HashSet<>();

        // Iterate through the array and add each value to the set
        for (int num : a) {
            uniqueValues.add(num);
        }

        // Check if the set contains exactly three different values
        return uniqueValues.size() == 3 ? 1 : 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isTrivalent(new int[]{22, 19, 10, 10, 19, 22, 22, 10}));  // Should return 1
        System.out.println(isTrivalent(new int[]{1, 2, 2, 2, 2, 2, 2}));            // Should return 0
        System.out.println(isTrivalent(new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65}));    // Should return 0
        System.out.println(isTrivalent(new int[]{-1, 0, 1, 0, 0, 0}));              // Should return 1
        System.out.println(isTrivalent(new int[]{}));                              // Should return 0
        System.out.println(isTrivalent(new int[]{2147483647, -1, -2147483648}));   // Should return 1
    }
}
