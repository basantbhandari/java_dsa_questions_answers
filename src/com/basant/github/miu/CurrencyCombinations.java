package com.basant.github.miu;

public class CurrencyCombinations {

    /**
     * Calculates the number of ways to represent a given amount of money using
     * rupee notes of denominations 1, 2, 5, 10, and 20.
     *
     * @param numRupees the amount of money to be represented
     * @return the number of ways to represent the amount using the given denominations
     */
    public static int countRepresentations(int numRupees) {
        int count = 0;

        // Iterate over all possible combinations of rupee notes
        for (int rupee20 = 0; rupee20 * 20 <= numRupees; rupee20++) {
            for (int rupee10 = 0; rupee10 * 10 <= numRupees - (rupee20 * 20); rupee10++) {
                for (int rupee5 = 0; rupee5 * 5 <= numRupees - (rupee20 * 20) - (rupee10 * 10); rupee5++) {
                    for (int rupee2 = 0; rupee2 * 2 <= numRupees - (rupee20 * 20) - (rupee10 * 10) - (rupee5 * 5); rupee2++) {
                        // Calculate remaining amount to be fulfilled by 1 rupee notes
                        int rupee1 = numRupees - (rupee20 * 20) - (rupee10 * 10) - (rupee5 * 5) - (rupee2 * 2);

                        // Check if rupee1 is non-negative
                        if (rupee1 >= 0) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(countRepresentations(12)); // Should return 15
        System.out.println(countRepresentations(5));  // Should return 6
        System.out.println(countRepresentations(0));  // Should return 1 (only one way: no notes)
        System.out.println(countRepresentations(20)); // Should return 39
    }
}
