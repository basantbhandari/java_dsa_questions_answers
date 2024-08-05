package com.basant.github.miu;

public class SmallestNumber {

    /**
     * Checks if a number contains the digit '2'.
     *
     * @param num the number to check
     * @return true if the number contains the digit '2', false otherwise
     */
    private static boolean containsDigitTwo(int num) {
        String numStr = Integer.toString(num);
        return numStr.contains("2");
    }

    /**
     * Finds the smallest number whose first n multiples each contain the digit '2'.
     *
     * @param n the number of multiples to check
     * @return the smallest number that meets the condition
     */
    public static int smallest(int n) {
        int k = 1;

        while (true) {
            boolean allContainTwo = true;

            // Check if the first n multiples of k contain the digit '2'
            for (int i = 1; i <= n; i++) {
                if (!containsDigitTwo(k * i)) {
                    allContainTwo = false;
                    break;
                }
            }

            if (allContainTwo) {
                return k;
            }

            k++;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(smallest(3));
        System.out.println(smallest(4));
        System.out.println(smallest(5));
        System.out.println(smallest(6));
        System.out.println(smallest(7));

    }
}
