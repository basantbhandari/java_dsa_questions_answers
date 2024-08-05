package com.basant.github.miu;

import java.util.ArrayList;
import java.util.Collections;

public class MinDistanceCalculator {

    /**
     * Function to find the smallest distance between any two factors of the number n.
     *
     * @param n - the input integer
     * @return the smallest distance between any two factors of n
     */
    public static int minDistance(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("The number must be positive.");
        }

        ArrayList<Integer> factors = getFactors(n);

        // If there are less than 2 factors, return -1 (not enough factors to calculate distance)
        if (factors.size() < 2) {
            return -1;
        }

        Collections.sort(factors);

        int minDistance = Integer.MAX_VALUE;

        // Find the minimum distance between consecutive factors
        for (int i = 0; i < factors.size() - 1; i++) {
            int distance = factors.get(i + 1) - factors.get(i);
            if (distance < minDistance) {
                minDistance = distance;
            }
        }

        return minDistance;
    }

    /**
     * Helper function to get all factors of a number.
     *
     * @param n - the input integer
     * @return a list of factors of n
     */
    private static ArrayList<Integer> getFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factors.add(i);
                if (i != n / i) { // Avoid adding the square root twice if n is a perfect square
                    factors.add(n / i);
                }
            }
        }

        return factors;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(minDistance(13013)); // Expected: 2 (13 - 11)
        System.out.println(minDistance(8));     // Expected: 1 (2 - 1)
        System.out.println(minDistance(1));     // Expected: -1 (not enough factors)
        System.out.println(minDistance(28));    // Expected: 1 (2 - 1 or 4 - 3)
    }
}
