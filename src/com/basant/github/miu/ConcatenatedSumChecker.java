package com.basant.github.miu;

public class ConcatenatedSumChecker {

    /**
     * Checks if the number n is equal to the sum of each of its digits concatenated catlen times.
     *
     * @param n      the number to check
     * @param catlen the number of times to concatenate each digit
     * @return 1 if n is equal to the sum of each digit concatenated catlen times, otherwise 0
     */
    public static int checkConcatenatedSum(int n, int catlen) {
        // Convert the number to a string to easily access each digit
        String numStr = Integer.toString(n);
        int sum = 0;

        // Iterate through each digit of the number
        for (char c : numStr.toCharArray()) {
            // Get the digit as an integer
            int digit = Character.getNumericValue(c);

            // Create the concatenated number by repeating the digit catlen times
            StringBuilder concatenatedStr = new StringBuilder();
            for (int i = 0; i < catlen; i++) {
                concatenatedStr.append(digit);
            }

            // Convert the concatenated string back to an integer and add to the sum
            sum += Integer.parseInt(concatenatedStr.toString());
        }

        // Compare the sum with the original number
        return sum == n ? 1 : 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(checkConcatenatedSum(198, 2)); // Output should be 1
        System.out.println(checkConcatenatedSum(2997, 3)); // Output should be 1
        System.out.println(checkConcatenatedSum(123, 1)); // Output should be 1
        System.out.println(checkConcatenatedSum(123, 2)); // Output should be 0
    }
}
