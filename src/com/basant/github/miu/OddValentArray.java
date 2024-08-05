package com.basant.github.miu;

import java.util.HashMap;

/**
 * Checks if the given array is odd-valent.
 * An array is considered odd-valent if:
 * 1. It contains a value that occurs more than once.
 * 2. It contains at least one odd number.
 *
 * @param a The input array of integers.
 * @return 1 if the array is odd-valent, otherwise 0.
 */
public class OddValentArray {

    /**
     * Checks if the given array is odd-valent.
     *
     * @param a The array to check.
     * @return 1 if the array is odd-valent, otherwise 0.
     */
    public static int isOddValent(int[] a) {
        if (a.length == 0) {
            return 0; // An empty array cannot be odd-valent
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        boolean hasOdd = false;

        // Count occurrences of each number and check for odd numbers
        for (int num : a) {
            if (num % 2 != 0) {
                hasOdd = true;
            }

            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Check if any number occurs more than once
        for (int count : frequencyMap.values()) {
            if (count > 1 && hasOdd) {
                return 1; // Array is odd-valent
            }
        }

        return 0; // Array is not odd-valent
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isOddValent(new int[]{9, 3, 4, 9, 1})); // Expected output: 1
        System.out.println(isOddValent(new int[]{3, 3, 3, 3})); // Expected output: 1
        System.out.println(isOddValent(new int[]{8, 8, 8, 4, 4, 7, 2})); // Expected output: 1
        System.out.println(isOddValent(new int[]{1, 2, 3, 4, 5})); // Expected output: 0
        System.out.println(isOddValent(new int[]{2, 2, 2, 4, 4})); // Expected output: 0
        System.out.println(isOddValent(new int[]{})); // Expected output: 0
    }
}
