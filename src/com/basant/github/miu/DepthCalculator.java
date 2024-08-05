package com.basant.github.miu;

/**
 * Calculates the depth of an integer n.
 *
 * The depth is defined as the number of multiples of n required before all
 * 10 digits (0-9) have appeared at least once in the sequence of multiples.
 *
 * For example, if n = 7, the multiples of 7 are: 7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98.
 * All 10 digits appear before the 14th multiple (98). Hence, the depth is 14.
 *
 * @param n The integer for which to calculate the depth.
 * @return The depth of n.
 */
public class DepthCalculator {
    /**
     * Calculates the depth of the given integer n.
     *
     * @param n The integer for which to calculate the depth.
     * @return The depth of n.
     */
    public static int calculateDepth(int n) {
        // A boolean array to track the appearance of digits 0-9
        boolean[] digitsSeen = new boolean[10];
        int digitsCount = 0;  // To count how many unique digits have appeared
        int multiple = n;     // Current multiple of n
        int depth = 0;        // To keep track of how many multiples have been processed

        // Loop until all 10 digits have been seen
        while (digitsCount < 10) {
            // Convert the current multiple to a string
            String multipleStr = Integer.toString(multiple);

            // Iterate through each character in the string representation of the multiple
            for (char c : multipleStr.toCharArray()) {
                int digit = c - '0'; // Convert character to integer
                // If the digit hasn't been seen before
                if (!digitsSeen[digit]) {
                    digitsSeen[digit] = true; // Mark the digit as seen
                    digitsCount++; // Increment the count of unique digits seen
                }
            }

            // Move to the next multiple
            multiple += n;
            depth++; // Increment the depth counter
        }

        return depth;
    }

    public static void main(String[] args) {
        // Test the function with various values of n
        int[] testValues = {7, 15, 19, 42, 13, 25};

        for (int n : testValues) {
            int depth = calculateDepth(n);
            System.out.println("The depth of " + n + " is: " + depth);
        }
    }

}
