package com.basant.github.miu;
public class PackedArray {

    /**
     * Determines if the given array is packed.
     *
     * An array is defined to be packed if:
     * 1. All its values are positive.
     * 2. Each value n appears exactly n times.
     * 3. All equal values are in consecutive locations.
     *
     * Examples:
     * - The array {2, 2, 3, 3, 3} is packed because 2 appears twice and 3 appears three times.
     * - The array {2, 3, 2, 3, 3} is not packed because the 2s are not in consecutive locations.
     * - The array {2, 2, 2, 3, 3, 3} is not packed because 2 appears three times.
     *
     * @param a the array to be checked
     * @return 1 if the array is packed, otherwise 0
     */
    public static int isPacked(int[] a) {
        if (a == null) {
            return 0; // Array is null
        }

        int i = 0;
        while (i < a.length) {
            int count = 1;
            int current = a[i];

            // Check if the current element is positive
            if (current <= 0) {
                return 0;
            }

            // Count the number of occurrences of the current element
            while (i + 1 < a.length && a[i + 1] == current) {
                count++;
                i++;
            }

            // Check if the current element appears exactly 'current' times
            if (count != current) {
                return 0;
            }

            i++;
        }

        return 1;
    }

    public static void main(String[] args) {
        // Example usage
        int[] exampleArray1 = {2, 2, 3, 3, 3};
        System.out.println(isPacked(exampleArray1)); // Should return 1

        int[] exampleArray2 = {2, 3, 2, 3, 3};
        System.out.println(isPacked(exampleArray2)); // Should return 0

        int[] exampleArray3 = {2, 2, 2, 3, 3, 3};
        System.out.println(isPacked(exampleArray3)); // Should return 0

        int[] exampleArray4 = {4, 4, 4, 4, 1, 2, 2, 3, 3, 3};
        System.out.println(isPacked(exampleArray4)); // Should return 1

        int[] exampleArray5 = {7, 7, 7, 7, 7, 7, 7, 1};
        System.out.println(isPacked(exampleArray5)); // Should return 1

        int[] exampleArray6 = {2, 2, 1};
        System.out.println(isPacked(exampleArray6)); // Should return 1

        int[] exampleArray7 = {2, 2, 1, 2, 2};
        System.out.println(isPacked(exampleArray7)); // Should return 0
    }
}
