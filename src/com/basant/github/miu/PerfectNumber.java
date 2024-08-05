package com.basant.github.miu;

public class PerfectNumber {

    /**
     * Returns the sum of the ith and jth perfect numbers.
     *
     * @param i the position of the first perfect number to sum.
     * @param j the position of the second perfect number to sum.
     * @return the sum of the ith and jth perfect numbers.
     *
     * A perfect number is a positive integer that is equal to the sum of its proper
     * divisors (excluding itself). For example:
     * - The 1st perfect number is 6, because 6 = 1 + 2 + 3.
     * - The 2nd perfect number is 28, because 28 = 1 + 2 + 4 + 7 + 14.
     * - The 3rd perfect number is 496, because 496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248.
     *
     * This method uses helper methods to find the nth perfect number and to check
     * if a number is perfect.
     */
    public static int henry(int i, int j) {
        int ithPerfect = findPerfectNumber(i);
        int jthPerfect = findPerfectNumber(j);
        return ithPerfect + jthPerfect;
    }

    /**
     * Finds the nth perfect number.
     *
     * @param n the position of the perfect number to find.
     * @return the nth perfect number.
     *
     * This method iterates through integers, checking if each number is perfect,
     * until it finds the nth perfect number.
     */
    private static int findPerfectNumber(int n) {
        int count = 0;
        int number = 1;

        while (true) {
            if (isPerfect(number)) {
                count++;
                if (count == n) {
                    return number;
                }
            }
            number++;
        }
    }

    /**
     * Checks if a number is perfect.
     *
     * @param num the number to check.
     * @return true if the number is perfect, otherwise false.
     *
     * This method calculates the sum of the factors of the number (excluding itself)
     * and checks if this sum equals the number.
     */
    private static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        // Test cases with explanations
        System.out.println("Sum of 1st and 3rd perfect numbers (henry(1, 3)): " + henry(1, 3)); // Expected: 502
        System.out.println("Sum of 2nd and 4th perfect numbers (henry(2, 4)): " + henry(2, 4)); // Expected: 8156
        System.out.println("Sum of 1st and 2nd perfect numbers (henry(1, 2)): " + henry(1, 2)); // Expected: 34
        System.out.println("Sum of 3rd and 4th perfect numbers (henry(3, 4)): " + henry(3, 4)); // Expected: 8624
    }
}
