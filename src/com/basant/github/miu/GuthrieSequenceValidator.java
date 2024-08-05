package com.basant.github.miu;

public class GuthrieSequenceValidator {

    /**
     * Checks if the given array is a valid Guthrie sequence.
     *
     * A Guthrie sequence starts with a number and generates subsequent numbers
     * using the following rules:
     * - If the number is even, divide it by 2.
     * - If the number is odd, multiply by 3 and add 1.
     * The sequence must end with 1.
     *
     * @param a The array to check.
     * @return 1 if the array is a valid Guthrie sequence, otherwise 0.
     */
    static int isGuthrieSequence(int[] a) {
        if (a == null || a.length == 0 || a[a.length - 1] != 1) {
            return 0; // Must end with 1
        }

        int current = a[0]; // Starting number of the sequence

        for(int i = 0; i < a.length; i++) {
            if (a[i] != current) {
                return 0; // Current number does not match array element
            }

            // Calculate the next number in the sequence
            if (current == 1) {
                break; // Sequence must end with 1
            } else if (current % 2 == 0) {
                current /= 2;
            } else {
                current = 3 * current + 1;
            }
        }

        // Ensure the entire array was used and the sequence ended at 1
        return (current == 1) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isGuthrieSequence(new int[] {8, 4, 2, 1}));
        // Expected output: 1

        System.out.println(isGuthrieSequence(new int[] {8, 17, 4, 1}));
        // Expected output: 0

        System.out.println(isGuthrieSequence(new int[] {8, 4, 1}));
        // Expected output: 0

        System.out.println(isGuthrieSequence(new int[] {8, 4, 2}));
        // Expected output: 0

        System.out.println(isGuthrieSequence(new int[]{8, 4, 2, 1}));
        // Expected output: 1, this is the Guthrie sequence for 8

        System.out.println(isGuthrieSequence(new int[]{8, 17, 4, 1}));
        // Expected output: 0, this is not the Guthrie sequence for 8

        System.out.println(isGuthrieSequence(new int[]{8, 4, 1}));
        // Expected output: 0, missing the 2

        System.out.println(isGuthrieSequence(new int[]{8, 4, 2}));
        // Expected output: 0, a Guthrie sequence must end with 1
    }
}
