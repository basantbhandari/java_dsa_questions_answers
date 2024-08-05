package com.basant.github.miu;

/**
 * This class provides a method to check if an array is a Madhav array.
 * A Madhav array has the property that:
 * a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...
 * The length of a Madhav array must be n*(n+1)/2 for some n.
 */
public class isMadhavArray{

	/**
	 * Checks if the given array is a Madhav array.
	 *
	 * @param a the array to be checked
	 * @return 1 if the array is a Madhav array, otherwise 0
	 */
	public static int isMadhavArray(int[] a) {
		int length = a.length;
		int n = 1;

		// Calculate the value of n such that n*(n+1)/2 is at least the length of the array
		while (n * (n + 1) / 2 < length) {
			n++;
		}

		// If the length of the array is not equal to n*(n+1)/2, it cannot be a Madhav array
		if (n * (n + 1) / 2 != length) {
			return 0;
		}

		int index = 1;
		// Verify the Madhav property: a[0] should equal the sum of each subsequent group of elements
		for (int i = 2; i <= n; i++) {
			int sum = 0;
			for (int j = 0; j < i; j++) {
				sum += a[index++];
			}
			if (sum != a[0]) {
				return 0;
			}
		}

		return 1;
	}

	/**
	 * Main method to test the isMadhavArray function.
	 *
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {
		int[] a1 = {2, 1, 1};
		int[] a2 = {2, 1, 1, 4, -1, -1};
		int[] a3 = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
		int[] a4 = {18, 9, 10, 6, 6, 6};
		int[] a5 = {-6, -3, -3, 8, -5, -4};
		int[] a6 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1};
		int[] a7 = {3, 1, 2, 3, 0};

		System.out.println(isMadhavArray(a1)); // Output: 1
		System.out.println(isMadhavArray(a2)); // Output: 1
		System.out.println(isMadhavArray(a3)); // Output: 1
		System.out.println(isMadhavArray(a4)); // Output: 0
		System.out.println(isMadhavArray(a5)); // Output: 0
		System.out.println(isMadhavArray(a6)); // Output: 1
		System.out.println(isMadhavArray(a7)); // Output: 0
	}
}
