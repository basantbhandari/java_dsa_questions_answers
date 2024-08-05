package com.basant.github.miu;

import java.util.ArrayList;

public class NumberEncoder {

    /**
     * Encodes an integer as an array following the specified rules.
     *
     * @param n the number to be encoded
     * @return the encoded array
     */
    public static int[] encodeArray(int n) {
        ArrayList<Integer> encodedList = new ArrayList<>();

        // Handle negative numbers
        if (n < 0) {
            encodedList.add(-1);
            n = Math.abs(n);
        }

        // If n is 0, directly add the encoded representation of 0
        if (n == 0) {
            encodedList.add(1);
            return encodedList.stream().mapToInt(i -> i).toArray();
        }

        // Extract and encode each digit
        ArrayList<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(0, n % 10);
            n /= 10;
        }

        for (int digit : digits) {
            for (int i = 0; i < digit; i++) {
                encodedList.add(0);
            }
            encodedList.add(1);
        }

        // Convert the ArrayList to an array
        return encodedList.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        // Test cases
        int[] encoded0 = encodeArray(0);
        int[] encoded1 = encodeArray(1);
        int[] encodedMinus1 = encodeArray(-1);
        int[] encoded100001 = encodeArray(100001);
        int[] encoded999 = encodeArray(999);

        System.out.println(java.util.Arrays.toString(encoded0));    // Expected output: [1]
        System.out.println(java.util.Arrays.toString(encoded1));    // Expected output: [0, 1]
        System.out.println(java.util.Arrays.toString(encodedMinus1)); // Expected output: [-1, 0, 1]
        System.out.println(java.util.Arrays.toString(encoded100001)); // Expected output: [0, 1, 1, 1, 1, 1, 0, 1]
        System.out.println(java.util.Arrays.toString(encoded999));  // Expected output: [0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1]
    }
}
