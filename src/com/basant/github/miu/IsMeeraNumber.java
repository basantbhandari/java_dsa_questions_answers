package com.basant.github.miu;

public class IsMeeraNumber {

    /**
     * Checks if the given number is a Meera number.
     * A Meera number is such that the number of nontrivial factors is a factor of the number.
     *
     * @param n the number to check
     * @return 1 if n is a Meera number, otherwise 0
     */
    public static int isMeera(int n) {
        if (n <= 1) {
            return 0; // 1 and negative numbers are not considered Meera numbers
        }

        int nonTrivialFactorCount = 0;

        // Find nontrivial factors of n
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                nonTrivialFactorCount++;
            }
        }

        // Check if nonTrivialFactorCount is a factor of n
        if (nonTrivialFactorCount > 0 && n % nonTrivialFactorCount == 0) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isMeera(6));  // Expected: 1
        System.out.println(isMeera(30)); // Expected: 1
        System.out.println(isMeera(21)); // Expected: 0
    }
}
