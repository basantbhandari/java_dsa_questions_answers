package com.basant.github.miu;


public class SmallestBEQ {

    /**
     * Finds the smallest BEQ number. A BEQ number is defined as a number whose cube contains exactly four 6's.
     *
     * @return The smallest BEQ number.
     */
    public static int findSmallestBEQnumber() {
        int number = 1;

        while (true) {
            long cube = (long) number * number * number;
            int countOfSixes = countDigitOccurrences(cube, 6);

            if (countOfSixes == 4) {
                return number;
            }

            number++;
        }
    }

    /**
     * Counts occurrences of a specific digit in a given number.
     *
     * @param number The number to search within.
     * @param digit The digit to count.
     * @return The count of occurrences of the digit in the number.
     */
    private static int countDigitOccurrences(long number, int digit) {
        int count = 0;
        while (number > 0) {
            if (number % 10 == digit) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("The smallest BEQ number is: " + findSmallestBEQnumber());
    }
}
