package com.basant.github.miu;

/**
 * This class provides a method to convert seconds into hours, minutes, and seconds.
 */
public class TimeConverter {

    /**
     * Converts the given number of seconds into hours, minutes, and seconds.
     *
     * @param seconds the number of seconds to convert
     * @return an array of three integers where:
     *         - arr[0] is the number of hours
     *         - arr[1] is the number of minutes
     *         - arr[2] is the number of seconds
     */
    public static int[] computeHMS(int seconds) {
        // Array to store the result: hours, minutes, seconds
        int[] hms = new int[3];

        // Calculate hours
        hms[0] = seconds / 3600;

        // Calculate remaining seconds after hours
        seconds = seconds % 3600;

        // Calculate minutes
        hms[1] = seconds / 60;

        // Calculate remaining seconds after minutes
        hms[2] = seconds % 60;

        return hms;
    }

    public static void main(String[] args) {
        // Test cases for computeHMS
        printArray(computeHMS(3735)); // Expected output: [1, 2, 15]
        printArray(computeHMS(380));  // Expected output: [0, 6, 20]
        printArray(computeHMS(3650)); // Expected output: [1, 0, 50]
        printArray(computeHMS(55));   // Expected output: [0, 0, 55]
        printArray(computeHMS(0));    // Expected output: [0, 0, 0]
    }

    /**
     * Utility method to print an array.
     *
     * @param array the array to print
     */
    private static void printArray(int[] array) {
        System.out.println("[" + array[0] + ", " + array[1] + ", " + array[2] + "]");
    }
}
