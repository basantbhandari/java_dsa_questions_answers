package com.basant.github.miu;

public class HodderNumber {

    /**
     * Checks if the given number is a hodder number.
     * A hodder number is a prime number that can be expressed as 2^j - 1 for some integer j.
     *
     * @param n the number to check
     * @return 1 if n is a hodder number, otherwise 0
     */
    public static int isHodder(int n) {
        // Check if n is a prime number
        if (!isPrime(n)) {
            return 0;
        }

        // Check if n can be expressed as 2^j - 1
        int value = n + 1;
        while (value % 2 == 0) {
            value /= 2;
        }

        return (value == 1) ? 1 : 0;
    }

    /**
     * Checks if a number is a prime number.
     *
     * @param n the number to check
     * @return true if n is prime, otherwise false
     */
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isHodder(3));   // Expected output: 1 (3 = 2^2 - 1)
        System.out.println(isHodder(7));   // Expected output: 1 (7 = 2^3 - 1)
        System.out.println(isHodder(31));  // Expected output: 1 (31 = 2^5 - 1)
        System.out.println(isHodder(127)); // Expected output: 1 (127 = 2^7 - 1)
        System.out.println(isHodder(15));  // Expected output: 0 (15 is not prime)
        System.out.println(isHodder(11));  // Expected output: 0 (11 = 2^4 - 1 but not hodder)
    }
}
