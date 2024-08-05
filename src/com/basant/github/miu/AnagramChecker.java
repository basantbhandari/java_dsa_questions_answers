package com.basant.github.miu;

/**
 * This class contains a method to determine if two character arrays are anagrams of each other.
 *
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once. For example, the arrays {'s', 'i', 't'}
 * and {'i', 't', 's'} represent words that are anagrams of one another because "its" is a rearrangement
 * of all the letters of "sit" and vice versa.
 *
 * The method `areAnagrams` accepts two character arrays and returns:
 * - 1 if the arrays are anagrams of each other, or
 * - 0 if they are not anagrams.
 *
 * It is assumed that the arrays are non-null, and the function should not modify either of the input arrays.
 *
 * Example cases:
 * - If the input arrays are {'s', 'i', 't'} and {'i', 't', 's'}, the function returns 1.
 * - If the input arrays are {'b', 'i', 'g'} and {'b', 'i', 't'}, the function returns 0.
 * - If the input arrays are {'b', 'o', 'g'} and {'b', 'o', 'o'}, the function returns 0.
 * - If the input arrays are empty ({}) and ({}) the function returns 1.
 * - If the input arrays are {'b', 'i', 'g'} and {'b', 'i', 'g'}, the function returns 1.
 *
 * The implementation uses frequency counting to determine if the arrays are anagrams.
 */
public class AnagramChecker {

    /**
     * Checks if two character arrays are anagrams of each other.
     *
     * @param a1 the first character array
     * @param a2 the second character array
     * @return 1 if the arrays are anagrams, otherwise 0
     */
    public static int areAnagrams(char[] a1, char[] a2) {
        // Check if lengths are different
        if (a1.length != a2.length) {
            return 0;
        }

        // Create frequency arrays for both input arrays
        int[] freq1 = new int[256]; // Assuming ASCII characters
        int[] freq2 = new int[256]; // Assuming ASCII characters

        // Count frequencies for the first array
        for (char c : a1) {
            freq1[c]++;
        }


        // Count frequencies for the second array
        for (char c : a2) {
            freq2[c]++;
        }

        // Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(areAnagrams(new char[] {'s', 'i', 't'}, new char[] {'i', 't', 's'})); // Expected output: 1
        System.out.println(areAnagrams(new char[] {'s', 'i', 't'}, new char[] {'i', 'd', 's'})); // Expected output: 0
        System.out.println(areAnagrams(new char[] {'b', 'i', 'g'}, new char[] {'b', 'i', 't'})); // Expected output: 0
        System.out.println(areAnagrams(new char[] {'b', 'o', 'g'}, new char[] {'b', 'o', 'o'})); // Expected output: 0
        System.out.println(areAnagrams(new char[] {}, new char[] {})); // Expected output: 1
        System.out.println(areAnagrams(new char[] {'b', 'i', 'g'}, new char[] {'b', 'i', 'g'})); // Expected output: 1
    }
}
