package com.basant.github.miu;

public class CubePowerful {

    /**
     * Checks if a number is cube-powerful.
     * A number n is cube-powerful if it is equal to the sum of the cubes of its digits.
     *
     * For example:
     * 153 is cube-powerful because 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
     * 370 is cube-powerful because 370 = 3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 370
     *
     * @param n the number to check
     * @return 1 if the number is cube-powerful, otherwise 0
     */
    public static int isCubePowerful(int n) {
        if (n <= 0) {
            return 0;  // Since n > 0 is given as a condition
        }

        int original = n;
        int sumOfCubes = 0;

        while (n > 0) {
            int digit = n % 10;
            sumOfCubes += digit * digit * digit;
            n /= 10;
        }

        return (sumOfCubes == original) ? 1 : 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isCubePowerful(153)); // should return 1
        System.out.println(isCubePowerful(370)); // should return 1
        System.out.println(isCubePowerful(371)); // should return 1
        System.out.println(isCubePowerful(407)); // should return 1
        System.out.println(isCubePowerful(123)); // should return 0
    }
}
