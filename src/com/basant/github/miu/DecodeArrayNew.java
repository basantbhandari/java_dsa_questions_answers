package com.basant.github.miu;

public class DecodeArrayNew {

    /**
     * Decodes an encoded array to return the integer number.
     *
     * An integer number can be encoded as an array where each digit n of the number is represented by n zeros followed by a 1.
     * For example, the number 1234 is encoded as {0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1}.
     * The first 0, 1 is contributed by the digit 1, the next 0, 0, 1 is contributed by the digit 2, and so on.
     *
     * If the number is negative, the first element of the encoded array is -1, so -201 is encoded as {-1, 0, 0, 1, 1, 0, 1}.
     * The 0 digit is represented by no zeros, i.e., there are two consecutive ones!
     *
     * The function returns the decoded number.
     *
     * Examples:
     *
     * if a is then function returns reason
     * {1}            0       because the digit 0 is represented by no zeros followed by a one.
     * {0, 1}         1       because the digit 1 is represented by one zero followed by a one.
     * {-1, 0, 1}     -1      because the encoding of a negative number begins with a -1 followed by the encoding of the absolute value of the number.
     * {0, 1, 1, 1, 1, 1, 0, 1} 100001 because the encoding of the first 1 is 0, 1, the encoding of each of the four 0s is just a 1 and the encoding of the last 1 is 0, 1.
     * {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1} 999 because each 9 digit is encoded as 0,0,0,0,0,0,0,0,0,1.
     *
     * @param a the encoded array
     * @return the decoded number
     */
    public static int decodeArray(int[] a) {
        int number = 0;
        int sign = 1;
        int i = 0;

        // Check if the number is negative
        if (a[0] == -1) {
            sign = -1;
            i = 1; // Start from the second element
        }

        while (i < a.length) {
            int countZeros = 0;

            // Count the number of zeros until we reach a 1
            while (i < a.length && a[i] == 0) {
                countZeros++;
                i++;
            }

            // After counting zeros, the next element should be 1
            if (i < a.length && a[i] == 1) {
                number = number * 10 + countZeros;
            }
            i++; // Move past the 1
        }

        return number * sign;
    }

    /**
     * Main method to test the decodeArray function with various test cases.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Test cases
        int[][] testCases = {
                {1},
                {0, 1},
                {-1, 0, 1},
                {0, 1, 1, 1, 1, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}
        };

        for (int[] testCase : testCases) {
            System.out.print("decodeArray({");
            for (int i = 0; i < testCase.length; i++) {
                System.out.print(testCase[i]);
                if (i < testCase.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}) = ");
            System.out.println(decodeArray(testCase));
        }
    }
}
