package com.basant.github.miu;

public class GuthrieIndexCalculator {

    /**
     * Computes the Guthrie index of a positive number n.
     * The Guthrie index is the number of iterations required for n to reach 1
     * using the following algorithm:
     *
     * 1. Start with a positive integer n.
     * 2. If n is even, divide n by 2.
     * 3. If n is odd, multiply n by 3 and add 1.
     * 4. Repeat steps 2 and 3 until n becomes 1.
     * 5. The Guthrie index is the total number of iterations performed.
     *
     * @param n The positive number to compute the Guthrie index for.
     * @return The Guthrie index, which is the number of iterations before reaching 1.
     * @throws IllegalArgumentException if n is less than or equal to 0.
     */
    public static int guthrieIndex(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("The input must be a positive integer.");
        }

        int index = 0;
        while (n != 1) {
            index++;
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Guthrie index of 1: " + guthrieIndex(1));
        // Expected output: 0, because the number is already 1

        System.out.println("Guthrie index of 2: " + guthrieIndex(2));
        // Expected output: 1, sequence is [2, 1]

        System.out.println("Guthrie index of 3: " + guthrieIndex(3));
        // Expected output: 7, sequence is [3, 10, 5, 16, 8, 4, 2, 1]

        System.out.println("Guthrie index of 4: " + guthrieIndex(4));
        // Expected output: 2, sequence is [4, 2, 1]

        System.out.println("Guthrie index of 42: " + guthrieIndex(42));
        // Expected output: 8, sequence is [42, 21, 64, 32, 16, 8, 4, 2, 1]
    }
}
