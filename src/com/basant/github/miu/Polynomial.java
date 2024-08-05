package com.basant.github.miu;

/**
 * Utility class for mathematical operations related to polynomials.
 */
public class Polynomial {

    /**
     * Evaluates the polynomial represented by the given coefficients at the specified value of x.
     *
     * @param x the value at which to evaluate the polynomial
     * @param coefficients the coefficients of the polynomial, where coefficients[i] is the coefficient for x^i
     * @return the result of evaluating the polynomial at x
     */
    public static double eval(double x, int[] coefficients) {
        double result = 0.0;
        int degree = coefficients.length - 1;

        for (int i = 0; i <= degree; i++) {
            result += coefficients[i] * Math.pow(x, degree - i);
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("eval(1.0, new int[]{0, 1, 2, 3, 4}): " + eval(1.0, new int[]{0, 1, 2, 3, 4})); // Expected: 10.0
        System.out.println("eval(3.0, new int[]{3, 2, 1}): " + eval(3.0, new int[]{3, 2, 1})); // Expected: 18.0
        System.out.println("eval(2.0, new int[]{3, -2, -1}): " + eval(2.0, new int[]{3, -2, -1})); // Expected: -5.0
        System.out.println("eval(-3.0, new int[]{3, 2, 1}): " + eval(-3.0, new int[]{3, 2, 1})); // Expected: 6.0
        System.out.println("eval(2.0, new int[]{3, 2}): " + eval(2.0, new int[]{3, 2})); // Expected: 7.0
        System.out.println("eval(2.0, new int[]{4, 0, 9}): " + eval(2.0, new int[]{4, 0, 9})); // Expected: 40.0
        System.out.println("eval(2.0, new int[]{10}): " + eval(2.0, new int[]{10})); // Expected: 10.0
        System.out.println("eval(10.0, new int[]{0, 1}): " + eval(10.0, new int[]{0, 1})); // Expected: 10.0
    }
}
