package com.basant.github.miu;


public class nextPerfectSquare {
	/**
	 * The NextPerfectSquare class provides a method to find the next perfect square greater than a given integer.
	 */

	// Function to find the next perfect square greater than n
	public static int nextPerfectSquare(int n) {
		// Find the integer part of the square root of n
		int nextRoot = (int) Math.sqrt(n) + 1;
		// Return the next perfect square
		return nextRoot * nextRoot;
	}

	public static void main(String[] args) {
		// Test the function with different values
		System.out.println(nextPerfectSquare(15)); // Output: 16
		System.out.println(nextPerfectSquare(16)); // Output: 25
		System.out.println(nextPerfectSquare(24)); // Output: 25
		System.out.println(nextPerfectSquare(25)); // Output: 36
	}
}
