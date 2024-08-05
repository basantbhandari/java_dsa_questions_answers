package com.basant.github.miu;

public class porcupineNumberFinder {

    /**
     * Checks if a number is prime.
     * @param num The number to check.
     * @return 1 if num is prime, otherwise 0.
     */
    private static int isPrime(int num) {
        if (num <= 1) return 0;
        if (num <= 3) return 1;
        if (num % 2 == 0 || num % 3 == 0) return 0;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return 0;
        }
        return 1;
    }

    /**
     * Finds the first porcupine number greater than n.
     * A porcupine number is a prime number ending with 9,
     * and the next prime number after it also ends with 9.
     * @param n The integer to find the porcupine number greater than.
     * @return The first porcupine number greater than n.
     */
    public static int findPorcupineNumber(int n) {
        int current = n + 1;
        while (true) {
            // Check if current number is a prime and ends with 9
            if (isPrime(current) == 1 && current % 10 == 9) {
                int nextPrime = current + 1;
                // Find the next prime number after current
                while (isPrime(nextPrime) == 0) {
                    nextPrime++;
                }
                // Check if the next prime number also ends with 9
                if (nextPrime % 10 == 9) {
                    return current;
                }
            }
            current++;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("The first porcupine number greater than 0 is: " + findPorcupineNumber(0));
        // Expected output: 139

        System.out.println("The first porcupine number greater than 138 is: " + findPorcupineNumber(138));
        // Expected output: 139

        System.out.println("The first porcupine number greater than 139 is: " + findPorcupineNumber(139));
        // Expected output: 409
    }
}
