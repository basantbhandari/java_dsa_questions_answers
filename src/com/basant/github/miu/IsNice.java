package com.basant.github.miu;

import java.util.HashSet;

public class IsNice {

    /**
     * Checks if the array is a Nice array.
     * A Nice array is such that for every value n in the array, there is also an element n-1 or n+1 in the array.
     *
     * @param a the array to check
     * @return 1 if the array is a Nice array, otherwise 0
     */
    public static int isNice(int[] a) {
        HashSet<Integer> elements = new HashSet<>();
        for (int num : a) {
            elements.add(num);
        }

        for (int num : a) {
            if (!elements.contains(num - 1) && !elements.contains(num + 1)) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        int[] test1 = {2, 10, 9, 3};         // Expected: 1
        int[] test2 = {2, 2, 3, 3, 3};      // Expected: 1
        int[] test3 = {1, 1, 1, 2, 1, 1};  // Expected: 1
        int[] test4 = {0, -1, 1};           // Expected: 1
        int[] test5 = {3, 4, 5, 7};         // Expected: 0

        System.out.println(isNice(test1));
        System.out.println(isNice(test2));
        System.out.println(isNice(test3));
        System.out.println(isNice(test4));
        System.out.println(isNice(test5));
    }
}
