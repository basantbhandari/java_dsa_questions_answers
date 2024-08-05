package com.basant.github.miu;
public class nUpCount {

	/**
	 * Calculates the n-upcount of an array.
	 *
	 * @param a the array of integers
	 * @param n the threshold value
	 * @return the n-upcount
	 */
	public static int nUpCount(int[] a, int n) {
		int upCount = 0;
		int partialSum = 0;

		for (int i = 0; i < a.length; i++) {
			int previousSum = partialSum;
			partialSum += a[i];

			if (previousSum <= n && partialSum > n) {
				upCount++;
			}
		}

		return upCount;
	}

	public static void main(String[] args) {
		// Test the function with different arrays and threshold values
		int[] arr1 = {2, 3, 1, -6, 8, -3, -1, 2};
		int n1 = 5;
		System.out.println(nUpCount(arr1, n1)); // Output: 3

		int[] arr2 = {6, 3, 1};
		int n2 = 6;
		System.out.println(nUpCount(arr2, n2)); // Output: 1

		int[] arr3 = {1, 2, -1, 5, 3, 2, -3};
		int n3 = 20;
		System.out.println(nUpCount(arr3, n3)); // Output: 0
	}
}
