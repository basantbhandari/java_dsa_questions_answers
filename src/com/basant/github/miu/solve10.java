package com.basant.github.miu;


public class solve10 {

	/**
	 * Calculates the factorial of a given number n.
	 *
	 * @param n the number to calculate the factorial for.
	 * @return the factorial of n.
	 */
	static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	/**
	 * Solves the problem of finding two numbers x and y such that x! + y! = 10!.
	 *
	 * @return an array of two integers {x, y} where x! + y! = 10!.
	 */
	static int[] solve10() {
		int target = factorial(10); // Calculate 10!

		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (factorial(x) + factorial(y) == target) {
					return new int[] {x, y};
				}
			}
		}

		// In case no such pair is found, which should not happen according to the problem statement.
		return new int[] {-1, -1};
	}

	public static void main(String[] args) {
		int[] result = solve10();
		System.out.println("x: " + result[0] + ", y: " + result[1]);
		// Expected output: One of the valid pairs (e.g., x = -1, y = -1 or vice versa)
	}
}
