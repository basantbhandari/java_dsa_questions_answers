package com.basant.miu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Algorithms {
    /*
    * Question 1
    An array with an odd number of elements is said to be centered
    if all elements (except the middle one) are strictly greater than the value
    of the middle element. Note that only arrays with an odd number of elements
    have a middle element. Write a function that accepts an integer array and
    returns 1 if it is a centered array, otherwise it returns 0.
    Examples:
     -----------------------|-----------------------------------------------------------------------
    | if the input array is | return                                                                |
    |-----------------------|-----------------------------------------------------------------------|
    | {1,2,3,4,5}           | 0 (the middle element 3 is not strictly less than all other elements) |
    |-----------------------|-----------------------------------------------------------------------|
    | {3,2,1,4,5}           | 1 (the middle element 1 is strictly less than all other elements)     |
    |-----------------------|-----------------------------------------------------------------------|
    | {3,2,1,4,1}           | 0 (the middle element 1 is not strictly less than all other elements) |
    |-----------------------|-----------------------------------------------------------------------|
    | {1,2,3,4}             | 0 (no middle element)                                                 |
    |-----------------------|-----------------------------------------------------------------------|
    | {}                    | 0 (no middle element)                                                 |
    |-----------------------|-----------------------------------------------------------------------|
    | {10}                  | 1 (the middle element 10 is strictly less than all other elements)    |
     -----------------------------------------------------------------------------------------------
    *
    * */

    static int isCentered(int[] items) {
        if (items.length % 2 == 0) return 0;

        int midIndex = items.length / 2;
        int middleItem = items[midIndex];

        for (int i = 0; i < items.length; i++) {
            if (i != midIndex && middleItem >= items[i])
                return 0;
        }
        return 1;
    }



    /*
    * Question 2
    Write a function that takes an array of integers as an argument and returns a
    value based on the sums of the even and odd numbers in the array. Let X = the sum of the odd
    numbers in the array and let Y = the sum of the even numbers. The function should return X - Y
    The signature of the function is:
    int f(int[] a)
    Examples:
     -----------------------|-----------------------------------------------------------------------
    | if input array is     | return                                                                |
    |-----------------------|-----------------------------------------------------------------------|
    | {1}                   | 1                                                                     |
    |-----------------------|-----------------------------------------------------------------------|
    | {1,2}                 | -1                                                                    |
    |-----------------------|-----------------------------------------------------------------------|
    | {1,2,3}               | 2                                                                     |
    |-----------------------|-----------------------------------------------------------------------|
    | {1,2,3,4}             | -2                                                                    |
    |-----------------------|-----------------------------------------------------------------------|
    | {3,3,4,4}             | -2                                                                    |
    |-----------------------|-----------------------------------------------------------------------|
    | {}                    | 0                                                                     |
     -----------------------------------------------------------------------------------------------
    *
    * */

    static int sumEvenOdd(int[] items) {
        int sumEven = 0;
        int sumOdd = 0;

        for(int i = 0; i < items.length; i++) {
            if (items[i] % 2 == 0)
                sumEven += items[i];
            else
                sumOdd += items[i];
        }
        return sumOdd - sumEven;
    }

    /*
    * Question 3
    Write a function that accepts a character array, a zero-based start position and
    a length. It should return a character array containing lengthCharacters starting with
    the startCharacter of the input array. The function should do error checking on the start
    position and the length and return null if the either value is not legal.

    The function signature is:
    char[] f(char[] a, int start, int len)

    --------------------------------|--------------------------------------------------------------
    | if the input parameters are is | return                                                       |
    |--------------------------------|--------------------------------------------------------------|
    | {'a','b','c'}, 0, 4            | null                                                         |
    |--------------------------------|--------------------------------------------------------------|
    | {'a','b','c'}, 0, 3            | {'a','b','c'}                                                |
    |--------------------------------|--------------------------------------------------------------|
    | {'a','b','c'}, 0, 2            | {'a','b'}                                                    |
    |--------------------------------|--------------------------------------------------------------|
    | {'a','b','c'}, 0, 1            | {'a'}                                                        |
    |--------------------------------|--------------------------------------------------------------|
    | {'a','b','c'}, 1, 3            | null                                                         |
    |--------------------------------|--------------------------------------------------------------|
    | {'a','b','c'}, 1, 2            | {'b','c'}                                                    |
    |--------------------------------|--------------------------------------------------------------|
    | {'a','b','c'}, 1, 1            | {'b'}                                                        |
    |--------------------------------|--------------------------------------------------------------|
    | {'a','b','c'}, 2, 2            | null                                                         |
    |--------------------------------|--------------------------------------------------------------|
    | {'a','b','c'}, 2, 1            | {'c'}                                                        |
    |--------------------------------|--------------------------------------------------------------|
    | {'a','b','c'}, 3, 1            | null                                                         |
    |--------------------------------|--------------------------------------------------------------|
    | {'a','b','c'}, 1, 0            | {}                                                           |
    |--------------------------------|--------------------------------------------------------------|
    | {'a','b','c'}, -1, 2           | null                                                         |
    |--------------------------------|--------------------------------------------------------------|
    | {'a','b','c'}, -1, -2          | null                                                         |
    |--------------------------------|--------------------------------------------------------------|
    | {}, 0, 1                       | null                                                         |
    -----------------------------------------------------------------------------------------------

    NOTE: To ease debugging, i will return string containing the characters
    * */

    static String charArrayBasedStartLength(char[] chars, int start, int len) {
        if (len < 0 ||start < 0 || start + len - 1 >= chars.length)
            return null;

        char[] newChars = new char[len];
        for(int i = start, j = 0; j < len; i++, j++){
            newChars[j] = chars[i];
        }
        return Arrays.toString(newChars);
    }


    /*
    * Question 4
    Write a function to reverse an integer using numeric operators and without
    using any arrays or other data structures.

    The signature of the function is:
    int f(int n)
    Examples

     --------------------------------|--------------------------------------------------------------
    | if the input integer is        | return                                                       |
    |--------------------------------|--------------------------------------------------------------|
    | 1234                           | 4321                                                         |
    |--------------------------------|--------------------------------------------------------------|
    | 12005                          | 50021                                                        |
    |--------------------------------|--------------------------------------------------------------|
    | 1                              | 1                                                            |
    |--------------------------------|--------------------------------------------------------------|
    | 1000                           | 1                                                            |
    |--------------------------------|--------------------------------------------------------------|
    | 0                              | 0                                                            |
    |--------------------------------|--------------------------------------------------------------|
    | -12345                         | -54321                                                       |
     --------------------------------|--------------------------------------------------------------
    * */
    static int reverseIntWithNumericOps(int number) {
        int sign = 1;
        if (number == 0) return 0;
        if (number < 0) {
            sign = -1;
            number = -number;
        }

        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }
        return sign * reverse;
    }

    /*
    *
    * Question 5
    Write a function to return an array containing all elements common to two
    given arrays containing distinct positive integers. You should not use any inbuilt
    methods. You are allowed to use any number of arrays.

    The signature of the function is:
    int[] f(int[] first, int[] second)

    Examples:
     --------------------------------|--------------------------------------------------------------
    | if the input parameters are    | return                                                       |
    |--------------------------------|--------------------------------------------------------------|
    | {1,8,3,2},{4,2,6,1}            | {1,2}                                                        |
    |--------------------------------|--------------------------------------------------------------|
    | {1,8,3,2,6},{2,6,1}            | {2,6,1}                                                      |
    |--------------------------------|--------------------------------------------------------------|
    | {1,3,7,9},{7,1,9,3}            | {1,3,7,9}                                                    |
    |--------------------------------|--------------------------------------------------------------|
    | {1,2}, {3,4}                   | {}                                                           |
    |--------------------------------|--------------------------------------------------------------|
    | {}, {1,2,3}                    | {}                                                           |
    |--------------------------------|--------------------------------------------------------------|
    | {1,2}, {}                      | {}                                                           |
    |--------------------------------|--------------------------------------------------------------|
    | {1,2}, null                    | null                                                         |
    |--------------------------------|--------------------------------------------------------------|
    | null, {}                       | null                                                         |
    |--------------------------------|--------------------------------------------------------------|
    | null, null                     | null                                                         |
     --------------------------------|--------------------------------------------------------------

    NOTE: To ease debugging, Will return a string array.
    * */

    static String commonElements(int[] firstArray, int[] secondArray) {
        if (firstArray == null || secondArray == null)
            return null;
        if (firstArray.length == 0 || secondArray.length == 0)
            return Arrays.toString(new int[0]);
        int min = (firstArray.length < secondArray.length) ? firstArray.length : secondArray.length;

        int[] firstClone, secondClone;
        if (min == firstArray.length) {
            firstClone = firstArray;
            secondClone = secondArray;
        } else {
            firstClone = secondArray;
            secondClone = firstArray;
        }

        int[] retArray = new int[min];
        int count = 0;
        for (int i = 0; i < firstClone.length; i++){
            for (int j = 0; j < secondClone.length; j++) {
                if (firstClone[i] == secondClone[j]) {
                    retArray[count] = firstClone[i];
                    count++;
                }
            }
        }

        int[] commonElements = new int[count];
        for (int i = 0; i < commonElements.length; i++) {
            commonElements[i] = retArray[i];
        }

        return Arrays.toString(commonElements);
    }


    /*
    * Question 6
    Consider an array A with n of positive integers. An integer idx is called
    a POE (point of equilibrium) of A, if A[0]+A[1]+...+A[idx-1] is equal to A[idx+1]+A[idx+2]+...+A[n-1].
    Write a function to return POE of an array, if it exists and -1 otherwise.

    The signature of the function is:
    int f(int[] a)

    Examples
     -------------------------|--------------------------------------------------------------
    | if the input arrays are | return                                                       |
    |-------------------------|--------------------------------------------------------------|
    | {1,8,3,7,10,2}          | 3 Reason: a[0]+a[1]+a[2] is equal to a[4]+a[5]               |
    |-------------------------|--------------------------------------------------------------|
    | {1,5,3,1,1,1,1,1,1}     | 2 Reason: a[0]+a[1] is equal to a[3]+a[4]+a[5]+a[6]+a[7]+a[8]|
    |-------------------------|--------------------------------------------------------------|
    | {2,1,1,1,2,1,7}         | 5 Reason: a[0]+a[1]+a[2]+a[3]+a[4] is equal to a[6]          |
    |-------------------------|--------------------------------------------------------------|
    | {1,2,3}                 | -1 Reason: No POE                                            |
    |-------------------------|--------------------------------------------------------------|
    | {3,4,5,10}              | -1 Reason: No POE                                            |
    |-------------------------|--------------------------------------------------------------|
    | {1,2,10,3,4}            | -1 Reason: No POE                                            |
     -------------------------|--------------------------------------------------------------

    * */

    static int poe(int[] numbers) {
        if (numbers.length < 3) return -1;
        int i = 0;
        int j = numbers.length - 1;

        int idx = 1;
        int leftSum = numbers[i];
        int rightSum = numbers[j];

        for (int k = 1; k < numbers.length - 2; k++ ){
            if (leftSum < rightSum) {
                i++;
                leftSum += numbers[i];
                idx = i + 1;
            } else {
                j--;
                rightSum += numbers[j];
                idx = j - 1;
            }
        }

        if (leftSum == rightSum)
            return idx;
        else
            return -1;
    }


    /*
    * Question 7
    Write a function com.basant.moremiu.nextPerfectSquare that returns the first perfect square that is greater than
    it's integer argument. A perfect square is an integer that is equal to some integer squared.

    For example 16 is a perfect square because 16 = 4*4. However 15 is not a perfect square because
    there is no integer n such that 15 = n*n.

    The signature of the function is
    int isPerfectSquare(int n)
    Examples
     -------------------------|--------------------------------------------------------------
    | n                       | next perfect square                                          |
    |-------------------------|--------------------------------------------------------------|
    | 6                       | 9                                                            |
    |-------------------------|--------------------------------------------------------------|
    | 36                      | 49                                                           |
    |-------------------------|--------------------------------------------------------------|
    | 0                       | 1                                                            |
    |-------------------------|--------------------------------------------------------------|
    | -5                      | 0                                                            |
     -------------------------|--------------------------------------------------------------

    * */
    static int nextPerfectSquare(int number) {
        int nextPerfectSquare = 0;

        if (number >= 0) {
            double sqrtResult = Math.sqrt(number);
            int baseNumber = (int) sqrtResult;
            int nextNumber = baseNumber + 1;
            nextPerfectSquare = (int) Math.pow(nextNumber, 2);
        }

        return nextPerfectSquare;
    }


    /*
    * Question 8
    Define the n-upcount of an array to be the number of times the partial sum goes from less than
    or equal to n to greater than n during the calculation of the sum of elements of the array.
    if you are programming in Java or C#, the function signature is int nUpCount(int[] a, int n)

    For example, if n=5, the 5-upcount of the array {2,3,1,-6,8,-3,-1,2} is 3.
     ------|------|--------------|---------|---------------------------------
    | i    | a[i] | partial sum  | upcount | comment                         |
    |------|------|--------------|---------|---------------------------------|
    | 0    | 2    | 2            |         |                                 |
    |------|------|--------------|---------|---------------------------------|
    | 1    | 3    | 5            |         |                                 |
    |------|------|--------------|---------|---------------------------------|
    | 2    | 1    | 6            | 1       | partial sum goes from 5 to 6    |
    |------|------|--------------|---------|---------------------------------|
    | 3    | -6   | 0            |         |                                 |
    |------|------|--------------|---------|---------------------------------|
    | 4    | 8    | 8            | 2       | partial sum goes from 0 to 8    |
    |------|------|--------------|---------|---------------------------------|
    | 5    | -3   | 5            |         |                                 |
    |------|------|--------------|---------|---------------------------------|
    | 6    | -1   | 4            |         |                                 |
    |------|------|--------------|---------|---------------------------------|
    | 7    | 2    | 6            | 3       | partial sum goes from 4 to 6    |
     ------|------|--------------|---------|---------------------------------

    *
    * */

    static int nUpCount(int[] numbers, int number) {
        int upCount = 0;
        int previousPartialSum = 0;
        int currentPartialSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            previousPartialSum = currentPartialSum;
            currentPartialSum += numbers[i];
            if (previousPartialSum <= number && currentPartialSum > number) {
                upCount += 1;
            }
        }
        return upCount;
    }

    /*
    * Question 9
    Write a function named primeCount with signature int primeCount(int start, int end);
    The function returns the number of primes between start and end inclusive.
    Recall that a prime is a positive integer greater than 1 whose only integer factors are 1 and itself.

    Examples
     -------------|------------|---------|------------------------------------------------------------------
    | if start is | and end is | return  | reason                                                           |
    |-------------|------------|---------|------------------------------------------------------------------|
    | 10          | 30         | 6       | The primes between 10 and 30 inclusive are 11,13,17,19,23 and 29 |
    |-------------|------------|---------|------------------------------------------------------------------|
    | 11          | 29         | 6       | The primes between 11 and 29 inclusive are 11,13,17,19,23 and 29 |
    |-------------|------------|---------|------------------------------------------------------------------|
    | 20          | 22         | 0       | 20,21, and 22 are all non-prime                                  |
    |-------------|------------|---------|------------------------------------------------------------------|
    | 1           | 1          | 0       | By definition, 1 is not a prime number                           |
    |-------------|------------|---------|------------------------------------------------------------------|
    | 5           | 5          | 1       | 5 is a prime number                                              |
    |-------------|------------|---------|------------------------------------------------------------------|
    | 6           | 2          | 0       | start must be less than or equal to end                          |
    |-------------|------------|---------|------------------------------------------------------------------|
    | -10         | 6          | 3       | primes are greater than 1. 2, 3 and 5 are prime                  |
     -------------|------------|---------|------------------------------------------------------------------

    * */

    static int primeCount(int start, int end) {
        int primeCount = 0;
        for (int i = start; i <= end; i++) {
            if (i > 1) {
                boolean isPrime = true;
                for (int j = 2; j*2 <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                    primeCount++;
            }
        }
        return primeCount;
    }


    /*
    * Question 10
    A fancy number is a number in the sequence 1,1,5,17,61,... Note the first two fancy numbers
    are 1 and any fancy number other than the first two is sum of three times previous one and two times
    the one before that. see below
    1,
    1,
    3*1 + 2*1 = 5,
    5*3 + 2*1 = 17,
    17*3 + 5*2 = 61
    Write a function named isFancy that returns 1, if it's integer argument is a Fancy number,
    otherwise it returns 0.
    * */

    static int isFancy(int number) {
        int isFancyNumber = 0;

        int previous = 1;
        int pPrevious = 1;

        int currentNumber = 0;

        if (number == 1) return 1;
        if (number <= 0) return 0;

        for (int i = 0; i < number/2; i++){
            currentNumber = 3*previous + 2*pPrevious;
            if (currentNumber == number) {
                isFancyNumber = 1;
                break;
            } else {
                pPrevious = previous;
                previous = currentNumber;
            }
        }
        return isFancyNumber;
    }

    /*
    * Question 11
    A Meera array is any array that contains the value 1 if and only if it contains 9.
    The array {7,9,0,10,1} is a Meera array because it contains 1 and 9.
    The array {6,10,8} is a Meera array because it contains no 1 and no 9.
    The array {7,6,1} is not a Meera array because it contains 1 but does not contain a 9.
    The array {9,10,0} is not a Meera array because it contains a 9 but does not contain 1.
    It is okay if a Meera array contains more than one value 1 and more than one 9.
    So the array {1,1,0,8,0,9,9,1} is a Meera array.
    Write a function named isMeera that returns 1 if it's array argument is a Merra array
    and returns 0 otherwise.
    If you are programming in Java or C#, the function signature is int isMeera(int[] a)

    * */

    static int isMeera(int[] a) {
        int isMeeraArray = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1 || a[i] == 9) {
                if (a[i] == 1) {
                    for (int j = i; j < a.length; j++) {
                        if (a[j] == 9) {
                            isMeeraArray = 1;
                            return isMeeraArray;
                        }
                    }
                    return isMeeraArray;
                }
                if (a[i] == 9) {
                    for (int j = i; j < a.length; j++) {
                        if (a[j] == 1) {
                            isMeeraArray = 1;
                            return isMeeraArray;
                        }
                    }
                    return isMeeraArray;
                }
            }
        }
        return isMeeraArray;
    }

    /*
    * Question 12
    A Bean array is defined to be an integer array where for every value n in the array,
    there is also an element 2n, 2n+1 or n/2 in the array.

    for example {4,9,8} is a Bean array because for 4,8 is present, for 9, 4 is present, for 8, 4 is present.
    Other Bean arrays include {2,2,5,11,23}, {7,7,3,6} and {0}
    The array {3,8,4} is not a Bean array because of the value 3 which requires that the array contains
    either the value 6, 7 or 1 and none of these values are in the array.
    Write a function named isBean that returns 1 if it's array argument is a Bean array,
    otherwise it returns a 0.
    if you are programming in Java or C#, the function signature is int isBean(int[] a)
    * */

    static int isBean(int[] a) {
        int isBean = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == 2*a[j] || a[i] == 2*a[j] + 1 || a[i] == a[j]/2) {
                    isBean = 1;
                    break;
                }
            }
            return isBean;
        }
        return isBean;
    }



    /*
    * Question 13
    Consider the positive integer 50. Note that 50 = 25 + 25 = 5^2 + 5^2 and 50 = 1 + 49 = 1^2 + 7^2,
    Thus 50 can be expressed as a sum of the two squares in two different ways.
    Write a method whether or not a positive integer n can be expressed as a sum of two squares in
    exactly two different ways.
    The signature of the function is
    int answerOne(int n)
    *
    * */
    static String expressedAsSumOfTwoSquares(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++) {
                if (n == i * i + j * j)
                    return n + " = " + i + "^2 + " + j + "^2";
            }
        }
        return n + " cannot be expressed as a sum of two squares";
    }




    /*
    * Question 14
    Write a function that will return the most occurring number in an array. If there is more than
    one such number, the function may return any one of them.
    If you are programming in Java or C#, the function signature is int answerTwo(int[] a)

    Examples
     -------------------------|----------|------------------------------------------------------------
    | a                       | return   | Explanation                                                |
    |-------------------------|----------|------------------------------------------------------------|
    | {6,8,1,8,2}             | 8        | 8 occurs two times. No other number occurs 3 or more times |
    |-------------------------|----------|------------------------------------------------------------|
    | {6,8,1,8,6}             | 8 or 6   | 8, 6. The Function may return either 8 or 6                |
     -------------------------|----------|------------------------------------------------------------
    * */
    static int mostOccurringNumber(int[] a) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : a) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequent = a[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequent;
    }


    /*
    * Question 15
    Write a function that will return 1 if an integer array satisfies the following conditions and returns 0 otherwise.
    1. it has even numbers of elements
    2. Sum of all the numbers in the first half of the array is equal to the sum of all the numbers in the second half of the array.

    If you are programming in Java, the function Signature is
    int answerThree(int[] a)
    Examples
     -------------------|--------|-----------------------------------------------------------------------
    | a                 | return | Explanation                                                           |
    |-------------------|--------|-----------------------------------------------------------------------|
    | {5,4,3,2,3,4,6,1} | 1      | *There are 8 (even) number of elements in the array. Thus condition 1 |
    |                   |        | satisfied.                                                            |
    |                   |        | *The sum of all the numbers in the first half = 5+4+3+2 = 14          |
     -------------------|--------|-----------------------------------------------------------------------
    * */
    static int satisfiesConditions(int[] a) {
        int isSatisfied = 0;

        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        if (a.length % 2 == 0) {
            for (int i = 0; i < a.length/2; i++) {
                sumFirstHalf += a[i];
            }
            for (int i = a.length - 1; i >= a.length/2; i--) {
                sumSecondHalf += a[i];
            }

            if (sumFirstHalf == sumSecondHalf) {
                isSatisfied = 1;
                return isSatisfied;
            }
        }
        return isSatisfied;
    }



    /*
    * Question 16
    A Madhav array has the following property.
    a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...
    The length of a Madhav array must be n*(n+1)/2 for some n.
    Write a method named isMadhavArray that returns 1 if its array argument is a Madhav array,
    otherwise it returns 0. If you are programming in Java or C# the function signature is
    int isMadhavArray(int[] a)

    Examples
     -----------------------------------|-------|---------------------------------------------------
    | if a is                           | return| reason                                            |
    |-----------------------------------|-------|---------------------------------------------------|
    | {2,1,1}                           | 1     | 2 = 1 + 1                                         |
    |-----------------------------------|-------|---------------------------------------------------|
    | {2,1,1,4,-1,-1}                   | 1     | 2 = 1 + 1, 2 = 4 + -1 + -1                        |
    |-----------------------------------|-------|---------------------------------------------------|
    | {6,2,4,2,2,2,1,5,0,0}             | 1     | 6 = 2 + 4, 6 = 2 + 2 + 2, 6 = 1 + 5 + 0 + 0       |
    |-----------------------------------|-------|---------------------------------------------------|
    | {18,9,10,6,6,6}                   | 0     | 18 != 9 + 10                                      |
    |-----------------------------------|-------|---------------------------------------------------|
    | {-6,-3,-3,8,-5,-4}                | 0     | -6 != 8 + -5 + -4                                 |
    |-----------------------------------|-------|---------------------------------------------------|
    | {0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1} | 1     | 0 = 0+0, 0 = 0+0+0, 0 = 0+0+0+0, 0 = 1+1+1+-2+-1  |
    |-----------------------------------|-------|---------------------------------------------------|
    | {3,1,2,3,0}                       | 0     | The length of the array is 5, but 5 != n*(n+1)/2  |
     -----------------------------------|-------|---------------------------------------------------

    * */

    public static int isMadhavArray(int[] a) {
        int len = a.length;
        int n = 1;
        int expectedLength = 0;

        // Find the value of n such that n * (n + 1) / 2 equals the length of the array
        while (expectedLength < len) {
            expectedLength = n * (n + 1) / 2;
            if (expectedLength == len) {
                break;
            }
            n++;
        }

        if (expectedLength != len) {
            return 0; // Length of array does not match n * (n + 1) / 2 for any n
        }

        // Check the Madhav array property
        int index = 1;
        for (int i = 2; i <= n; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += a[index++];
            }
            if (sum != a[0]) {
                return 0;
            }
        }

        return 1;
    }



    /*
    * Question 17
    An array is defined to be inertial if the following conditions hold:
    a. it contains at least one odd value
    b. the maximum value in the array is even
    c. every odd value is greater than every even value that is not the maximum value.
    so {11,4,20,9,2,8} is inertial because
     - it contains at least one odd value
     - the maximum value in the array is 20 which is even
     - the two odd values (11 and 9) are greater than all the even values that are not
    equal to 20 (the maximum), i.e {4,2,8}.
    However, {12,11,4,9,2,3,10} is not inertial because it fails condition (c), i.e.
    10 (which is even) is greater than 9 (which is odd), and 10 is not the maximum value
    in the array.

    Write a function called isInertial that accepts an integer array and returns 1 if the array
    is inertial; otherwise it returns 0.
    If you are programing in Java or C#, the function signature is
    int isInertial(int[] a)

    Some other examples:
     -----------------------|--------|-----------------------------------------------------------------------
    | if the input array is | return | reason                                                                |
    |-----------------------|--------|-----------------------------------------------------------------------|
    | {1}                   | 0      | fails condition (a) - the maximum value must be even                  |
    |-----------------------|--------|-----------------------------------------------------------------------|
    | {2}                   | 0      | fails condition (b) - the array must contain at least one odd value   |
    |-----------------------|--------|-----------------------------------------------------------------------|
    | {1,2,3,4}             | 0      | fails condition (c) - 1(which is odd) is not greater than all even    |
    |                       |        | values other than the maximum (1 is less than 2 which is not the max) |
    |-----------------------|--------|-----------------------------------------------------------------------|
    | {1,1,1,1,1,1,2}       | 1      | there is no even number other than the maximum. Hence, there can be no|
    |                       |        | other even values that are greater than 1.                            |
    |-----------------------|--------|-----------------------------------------------------------------------|
    | {2,12,4,6,8,11}       | 1      | 11, the only odd value is greater than all even values except 12 which|
    |                       |        | is the maximum value in the array.                                    |
    |-----------------------|--------|-----------------------------------------------------------------------|
    | {2,12,12,4,6,8,11}    | 1      | same as previous, ie, it is ok if maximum value occurs more than once |
    |-----------------------|--------|-----------------------------------------------------------------------|
    | {-2,-4,-6,-8,-11}     | 0      | -8, which is even, is not the maximum value but is greater than -11   |
    |-----------------------|--------|-----------------------------------------------------------------------|
    | {2,3,5,7}             | 0      | the maximum value is odd                                              |
    |-----------------------|--------|-----------------------------------------------------------------------|
    | {2,4,6,8,10}          | 0      | there is no odd value in the array                                    |
     -----------------------|--------|-----------------------------------------------------------------------

    NOTE: To ease debugging, i will return a string
    * */
    public static int isInertial(int[] a) {
        boolean hasOdd = false;
        int max = Integer.MIN_VALUE;

        for (int num : a) {
            if (num % 2 != 0) {
                hasOdd = true;
            }
            if (num > max) {
                max = num;
            }
        }

        if (!hasOdd) {
            return 0; // Condition (a) not met
        }

        if (max % 2 != 0) {
            return 0; // Condition (b) not met
        }

        for (int num : a) {
            if (num % 2 != 0) {
                for (int other : a) {
                    if (other % 2 == 0 && other != max && num <= other) {
                        return 0; // Condition (c) not met
                    }
                }
            }
        }

        return 1;
    }


    /*
    * Question 18
    Define a square pair to be the tuple <x,y> where x and y are positive, non-zero integers,
    x<y and x+y is a perfect square. A perfect square is an integer whose square root is also
    an integer, e.g 4,9,16 are perfect squares but 3,10,and 17 are not.

    Write a function named countSquarePairs that takes an array and returns the number of square
    pairs that can be constructed from the elements in the array.
    For example, if  the array is {11,5,4,20} the function would return 3 because the only square
    pairs that can be constructed from those numbers are <5,11>,<5,20> and <4,5>.
    You may assume that there exists a function named isPerfectSquare that returns 1 if
    its argument is a perfect square and 0 otherwise. isPerfectSquare(4) returns 1 and
    isPerfectSquare(8) returns 0.
    If you are programming in Java or C#, the function signature is
    int countSquarePairs(int[] a)
    You may assume that there are no duplicate values in the array. ie you don't have to deal
    with an array like {2,7,2,2}.

    examples:
     -------------------|--------|-----------------------------------------------------------------------
    | if a is           | return | reason                                                                |
    |-------------------|--------|-----------------------------------------------------------------------|
    | {9,0,2,-5,7}      | 2      | The square pairs are <2,7> and <7,9>. Note that <-5,9> and <0,9> are  |
    |                   |        | not square pairs, even though they sum to perfect squares, because    |
    |                   |        | both members of a square pair have to be greater than 0. Also <7,2>   |
    |                   |        | and <9,7> are not square pairs because the first number has to be less|
    |                   |        | than the second number.                                               |
    |-------------------|--------|-----------------------------------------------------------------------|
    | {9}               | 0      | The array must have at least 2 elements                               |
     -------------------|--------|-----------------------------------------------------------------------

    * */


    static int countSquarePairs(int[] a) {
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                for(int j = 0; j < a.length; j++) {
                    if (a[j] > 0 && a[i] < a[j] && isPerfectSquare(a[i] + a[j])) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    static boolean isPerfectSquare(int number) {
        for (int i = 0; i < number/2; i++) {
            if (i * i == number) return true;
        }
        return false;
    }



    /*
    * Question 19
    A prime number is an integer that is divisible only by 1 and itself. A porcupine number is a prime
    number whose last digit is 9 and the next prime number that follows it also ends with the digit 9.
    For example 139 is a porcupine number because:
    a - it is prime
    b - it ends in a 9
    c - The next prime number after it is 149 which also ends in 9.
    Note that 140, 141, 142, 143, 144, 145, 146, 147, and 148 are not prime so 149 is the next prime
    number after 139.

    Write a method named findPorcupineNumber which takes an integer argument n and returns the first
    porcupine number that is greater than n. So findPorcupineNumber(0) would return 139 (because 139
    happens to be the first porcupine number) and so would findPorcupineNumber(138).
    But findPorcupineNumber(139) would return 409 which is the second porcupine number.

    The function signature is
    int findPorcupineNumber(int n)
    You may assume that a porcupine number greater than n exists.
    You may assume that a function isPrime exists that returns 1 if its argument is prime, otherwise
    it returns 0. e.g isPrime(7) returns 1 and isPrime(8) returns 0.
    Hint: Use modulo base 10 arithmetic to get last digit of a number.
    * */

    public static int findPorcupineNumber(int n) {
        int candidate = n + 1;

        while (true) {
            if (isPrime(candidate) && candidate % 10 == 9) {
                int nextPrime = candidate + 1;
                while (!isPrime(nextPrime)) {
                    nextPrime++;
                }
                if (nextPrime % 10 == 9) {
                    return candidate;
                }
            }
            candidate++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i != 0) return false;
        }
        return true;
    }


    /*
    *
    * Question 20
    Consider the following algorithm
    - Start with a positive number n
    - if n is even then divide by 2
    - if n is odd then multiply by 3 and add 1
    -* continue this until n becomes 1

    The Guthrie sequence of a positive number n is defined to be the numbers generated by the above algorithm.

    For example, the Guthrie sequence of the number 7 is
    7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1
    It is easy to see that this sequence was generated from number 7 by the above algorithm.
    Since 7 is odd, multiply by 3 and add 1 to get 22 which is the second number of the sequence.
    Since 22 is even, divide by 2 to get 11 which is the third number of the sequence.
    11 is odd, multiply by 3 and add 1 to get 34 which is the fourth number of the sequence and so on.

    Note: the first number of a Guthrie sequence is always the number that generated the sequence and
    the last number is always 1.

    Write a function named isGuthrieSequence which returns 1 if the elements of the array form a
    Guthrie sequence. Otherwise, it returns 0.
    If you are programming in Java or c#, the function signature is
    int isGuthrieSequence(int[] a)
    Examples
     -------------------------|----------|------------------------------------------------------------
    | if a is                 | return   | reason                                                     |
    |-------------------------|----------|------------------------------------------------------------|
    | {8,4,2,1}               | 1        | This is the Guthrie sequence for 8                         |
    |-------------------------|----------|------------------------------------------------------------|
    | {8,17,4,1}              | 0        | This is not the Guthrie sequence for 8                     |
    |-------------------------|----------|------------------------------------------------------------|
    | {8,4,1}                 | 0        | Missing the 2                                              |
    |-------------------------|----------|------------------------------------------------------------|
    | {8,4,2}                 | 0        | A Guthrie sequence must end with 1                         |
     -------------------------|----------|------------------------------------------------------------

    * */

    public static int isGuthrieSequence(int[] a) {
        if (a[a.length - 1] != 1) {
            return 0; // A Guthrie sequence must end with 1
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 0) {
                if (a[i] / 2 != a[i + 1]) {
                    return 0; // If even, next should be half
                }
            } else {
                if (a[i] * 3 + 1 != a[i + 1]) {
                    return 0; // If odd, next should be 3*n + 1
                }
            }
        }

        return 1;
    }


    /*
    * Question 21
    The Stanton measure of an array is computed as follows. Count the number of 1s in the array.
    Let this count be n. The Stanton measure is the number of times that n appears in the array.
    For example, the Stanton measure of {1,4,3,2,1,2,3,2} is 3 because 1 occurs 2 times in the array and
    2 occurs 3 times.
    Write a function named stantonMeasure that returns the Stanton measure of its array argument.
    If you are programming in Java or C#, the function prototype is
    int stantonMeasure(int[] a)
    Examples
     -------------------------|----------|------------------------------------------------------------
    | if a is                 | return   | reason                                                     |
    |-------------------------|----------|------------------------------------------------------------|
    | {1}                     | 1        | 1 occurs 1 time, 1 occurs 1 time                           |
    |-------------------------|----------|------------------------------------------------------------|
    | {0}                     | 1        | 1 occurs 0 times, O occurs 1 time                          |
    |-------------------------|----------|------------------------------------------------------------|
    | {3,1,1,4}               | 0        | 1 occurs 2 times, 2 occurs 0 times                         |
    |-------------------------|----------|------------------------------------------------------------|
    | {1,3,1,1,3,3,2,3,3,3,4} | 6        | 1 occurs 3 times, 3 occurs 6 times                         |
    |-------------------------|----------|------------------------------------------------------------|
    | {}                      | 0        | 1 occurs 0 times, 0 occurs 0 times                         |
     -------------------------|----------|------------------------------------------------------------
    *
    * */

    public static int stantonMeasure(int[] a) {
        int countOfOnes = 0;

        // Count the number of 1s in the array
        for(int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                countOfOnes++;
            }
        }

        // Count how many times countOfOnes appears in the array
        int stantonMeasure = 0;
        for(int i = 0; i < a.length; i++) {
            if (a[i] == countOfOnes) {
                stantonMeasure++;
            }
        }

        return stantonMeasure;
    }

    /*
    * Question 22
    The sum factor of an array is defined to be the number of times that the sum of the array appears
    as an element of the array. So the sum factor of {1,-1,1,-1,1,-1,1} is 4 because the sum of the elements
    of the array is 1 and 1 appears four times in the array.
    And the sum factor of {1,2,3,4} is 0 because the sum of the elements of the array is 10 and 10
    does not occur as an element of the array. The sum factor of the empty array is defined to be 0.

    Write a function named sumFactor that returns the sum factor of its array argument.
    if you are programming in Java or C#, the function signature is
    int sumFactor(int[] a)
     -------------------------|----------|------------------------------------------------------------
    | if a is                 | return   | reason                                                     |
    |-------------------------|----------|------------------------------------------------------------|
    | {3,0,2,-5,0}            | 2        | The sum of array is 0 and 0 occurs 2 times                 |
    |-------------------------|----------|------------------------------------------------------------|
    | {9,-3,-3,-1,-1}         | 0        | The sum of the array is 1 and 1 does not occur in array    |
    |-------------------------|----------|------------------------------------------------------------|
    | {1}                     | 1        | The sum of the array is 1 and 1 occurs once in the array   |
    |-------------------------|----------|------------------------------------------------------------|
    | {0,0,0}                 | 3        | The sum of the array is 0 and 0 occurs 3 times in the array|
     -------------------------|----------|------------------------------------------------------------


    * */

    public static int sumFactor(int[] a) {
        int sum = 0;
        for (int num : a) {
            sum += num;
        }

        int count = 0;
        for (int num : a) {
            if (num == sum) {
                count++;
            }
        }

        return count;
    }



    /*
    * Question 23
An integer array is said to be evenSpaced, if the difference between the largest value
and the smallest value is an even number.

Write a function isEvenSpaced(int[] a) that will return 1 if it is evenSpaced and 0 otherwise.
if array has less than two elements, function will return 0.
 --------------------|--------------|----------------|----------------|----------------------------
| Array              | Largest value| Smallest value | Difference     | Return value               |
|--------------------|--------------|----------------|----------------|----------------------------|
| {100,19,131,140}   | 140          | 19             | 140 - 19 = 121 | 0                          |
|--------------------|--------------|----------------|----------------|----------------------------|
| {200,1,151,160}    | 200          | 1              | 200 - 1 = 199  | 0                          |
|--------------------|--------------|----------------|----------------|----------------------------|
| {200,10,151,160}   | 200          | 10             | 200 - 10 = 190 | 1                          |
|--------------------|--------------|----------------|----------------|----------------------------|
| {100,19,-131,-140} | 100          | -140           | 100-(-140)= 240| 1                          |
|--------------------|--------------|----------------|----------------|----------------------------|
| {80,-56,11,-81}    | 80           | -81            | 80 -(-81) = 161| 0                          |
 --------------------|--------------|----------------|----------------|----------------------------
    * */


    public static int isEvenSpaced(int[] a) {
        if (a.length < 2) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : a) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        int difference = max - min;
        return difference % 2 == 0 ? 1 : 0;
    }



    /*
    * Question 24
    A Sub Array is defined to be an array in which each element is greater than sum of all
    elements after that. see example below:
    {13,6,3,2} is a sub array. Note that 13 > 6+3+2, 6 > 3+2, 3>2.
    {11,5,3,2} is NOT a sub array. Note that 5 is not greater than 3+2.
    Write a function named isSub that returns 1 if its array argument is a Sub array. otherwise it returns 0.
    if you are programming in Java or C#, the function signature is: int isSub(int[] a)
    * */

    public static int isSub(int[] a) {
        int n = a.length;
        if (n < 2) {
            return 1; // Any single element or empty array is trivially a Sub Array
        }

        for (int i = 0; i < n; i++) {
            int sumAfter = 0;
            // Calculate sum of elements after the current element
            for (int j = i + 1; j < n; j++) {
                sumAfter += a[j];
            }
            // Check if the current element is greater than sum of elements after it
            if (a[i] <= sumAfter) {
                return 0;
            }
        }
        return 1;
    }


    /*
    *
    * Question 25
    An isSym (even/odd Symmetric) array is defined to be an array in which even numbers
    and odd numbers appear in the same order from "both directions".
    You can assume array has at least one element.
    {2,7,9,10,11,5,8} is a isSym array.
    Note that from left to right or right to left we have even,odd,odd,even,odd,odd,even.

    {9,8,7,13,14,17} is a isSym array.
    Note from left to right or right to left we have {odd,even,odd,odd,even,odd}

    However, {2,7,8,9,11,13,10} is NOT a isSym array.
    From left to right we have {even,odd,even,odd,odd,odd,even}
    From right to left we have {even,odd,odd,odd,even,odd,even} which is not the same.

    Write a function named isSym that returns 1 if its array argument is a isSym array,
    otherwise it returns 0.

    if you are programming in Java or C#, the function signature is:
    int isSym(int[] a)

    if you are programming in C or C++, the function is:
    int isSym(int a[], int len) where len is the number of elements in the array.
    * */

    public static int isSym(int[] a) {
        int n = a.length;
        int[] leftToRight = new int[n];
        int[] rightToLeft = new int[n];

        // Fill leftToRight and rightToLeft arrays
        for (int i = 0; i < n; i++) {
            leftToRight[i] = (a[i] % 2 == 0) ? 1 : 0;
            rightToLeft[n - 1 - i] = (a[i] % 2 == 0) ? 1 : 0;
        }

        // Compare the two arrays
        for (int i = 0; i < n; i++) {
            if (leftToRight[i] != rightToLeft[i]) {
                return 0;
            }
        }

        return 1;
    }

































}
