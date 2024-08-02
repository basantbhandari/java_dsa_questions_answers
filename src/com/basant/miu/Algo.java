package com.basant.miu;

public class Algo {

    //  sample problem 1
    /*An array with an odd number of elements is said to be centered if
    all elements (except the middle one) are strictly greater than the value of the middle element.
    Note that only arrays with an odd number of elements have a middle element. Write a function that
    accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0.
    *
    * */

    static int a1(int[] a)
    {
        if (a == null || a.length % 2 == 0) return 0;

        int midIndex = a.length / 2 ;
        int middleItem = a[midIndex];

        for (int i=0; i<a.length; i++)
        {
            if (i != midIndex && middleItem >= a[i])
                return 0;
        }
        return 1;
    }



    // problem 2
    /*
    * Write a function that takes an array of integers as an argument and
    * returns a value based on the sums of the even and odd numbers in the array.
    * Let X = the sum of the odd numbers in the array and let Y = the sum of the
    * even numbers. The function should return X – Y
    * */
    static int a2(int[] a)
    {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i=0; i<a.length; i++)
        {
            if (a[i]%2 == 0)
                sumEven += a[i];
            else
                sumOdd += a[i];
        }
        return sumOdd - sumEven;
    }

    // problem 3
    /*
    * Write a function that accepts a character array,
    * a zero-based start position and a length. It should return a character array
    * containing length characters starting with the start character of the input array.
    * The function should do error checking on the start position and the length and return
    * null if the either value is not legal.
    * */
    static char[] a3(char[] a, int start, int length)
    {
        if (length < 0 || start < 0 || start+length-1>=a.length)
        {
            return null;
        }

        char[] sub = new char[length];
        for (int i=start, j=0; j<length; i++, j++)
        {
            sub[j] = a[i];
        }

        return sub;
    }

    // problem 4
    /*
    * Write a function to reverse an integer using numeric
    * operators and without using any arrays or other data structures.
    * */

    static int a4(int n)
    {
        int sign = 1;

        if (n == 0) return 0;

        if (n < 0)
        {
            sign = -1;
            n = -n;
        }

        int reverse = 0;
        while (n != 0)
        {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }
        return sign * reverse;
    }

    // problem 5
    /*
    * Write a function to return an array containing all elements common to two given arrays containing distinct
    * positive integers. You should not use any inbuilt methods. You are allowed to use any number of arrays.
    * */
    static int[] a5(int[] first, int[] second)
    {
        if (first == null || second == null) return null;

        if (first.length == 0 || second.length == 0) return new int[0];

        int min = (first.length < second.length) ? first.length : second.length;

        int[] a, b;

        if (min == first.length)
        {
            a = first;
            b = second;
        }
        else
        {
            a = second;
            b = first;
        }

        int[] c = new int[min];

        int k = 0;

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b.length; j++)
                if (a[i] == b[j])
                {
                    c[k] = a[i];
                    k++;
                }

        int[] retArray = new int[k];

        for (int t = 0; t < retArray.length; t++)
            retArray[t] = c[t];


        return retArray;
    }


    // problem 6
    /*
    * Consider an array A with n of positive integers.
    * An integer idx is called a POE (point of equilibrium) of A, if A[0] + A[1] + … + A[idx – 1] is
    * equal to A[idx + 1] + A[idx + 2] + … + A[n – 1]. Write a function to return POE of an array,
    * if it exists and -1 otherwise.
     * */

    static int a6(int[] a)
    {
        if (a.length < 3) return -1;

        int i = 0;
        int j = a.length - 1;

        int idx = 1;
        int leftSum = a[i];
        int rightSum = a[j];

        for (int k = 1; k < a.length - 2; k++)
        {
            if (leftSum < rightSum)
            {
                i++;
                leftSum += a[i];
                idx = i + 1;
            }
            else
            {
                j--;
                rightSum += a[j];
                idx = j - 1;
            }
        }

        if (leftSum == rightSum)
            return idx;
        else
            return -1;

    }






























}
