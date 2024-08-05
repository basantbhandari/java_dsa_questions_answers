package com.basant.github.miu;

public class primeCount {

	/**
	 * Determines if a number is prime.
	 *
	 * @param num the number to check
	 * @return true if the number is prime, false otherwise
	 */
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns the number of prime numbers between start and end inclusive.
	 *
	 * @param start the starting number of the range
	 * @param end   the ending number of the range
	 * @return the number of primes in the range
	 */
	public static int primeCount(int start, int end) {
		int count = 0;
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// Test the function with different ranges
		System.out.println(primeCount(10, 20)); // Output: 4 (11, 13, 17, 19)
		System.out.println(primeCount(1, 10));  // Output: 4 (2, 3, 5, 7)
		System.out.println(primeCount(20, 30)); // Output: 2 (23, 29)
		System.out.println(primeCount(1, 1));   // Output: 0 (no primes)
	}
}
