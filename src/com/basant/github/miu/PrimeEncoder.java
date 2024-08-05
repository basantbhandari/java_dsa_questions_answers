package com.basant.github.miu;

import java.util.ArrayList;
import java.util.List;

public class PrimeEncoder {

    /**
     * Encodes the given number into an array of its prime factors.
     *
     * The fundamental theorem of arithmetic states that every natural number greater than 1 can be written as a unique product of prime numbers.
     * If the number is less than or equal to 1, the function returns null.
     *
     * @param n the number to encode
     * @return an array of prime factors of n, or null if n <= 1
     */
    public static int[] encodeNumber(int n) {
        if (n <= 1) {
            return null;
        }

        List<Integer> factors = new ArrayList<>();

        // Check for the smallest prime factor (2) first
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        // Check for odd factors from 3 upwards
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        // If n is still greater than 2, then it must be a prime number
        if (n > 2) {
            factors.add(n);
        }

        // Convert the list of factors to an array
        int[] result = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            result[i] = factors.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int[] result1 = encodeNumber(6936);
        if (result1 != null) {
            for (int i : result1) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            System.out.println("null");
        }

        int[] result2 = encodeNumber(2);
        if (result2 != null) {
            for (int i : result2) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            System.out.println("null");
        }

        int[] result3 = encodeNumber(6);
        if (result3 != null) {
            for (int i : result3) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            System.out.println("null");
        }

        int[] result4 = encodeNumber(1);
        if (result4 != null) {
            for (int i : result4) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            System.out.println("null");
        }
    }
}

