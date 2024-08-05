package com.basant.github.miu;

public class BinaryUtils {

    /**
     * Counts the number of ones in the binary representation of a given integer.
     *
     * @param n The integer whose binary representation will be examined.
     * @return The number of ones in the binary representation of n.
     */
    public static int countOnes(int n) {
        int count = 0;

        while (n > 0) {
            // Increment count if the least significant bit is 1
            if ((n % 2) == 1) {
                count++;
            }
            // Right shift the number by 1 bit
            n = n >> 1;
        }

        return count;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(countOnes(9));   // Expected output: 2 (binary 1001)
        System.out.println(countOnes(5));   // Expected output: 2 (binary 101)
        System.out.println(countOnes(15));  // Expected output: 4 (binary 1111)
    }
}
