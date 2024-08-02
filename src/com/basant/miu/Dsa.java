package com.basant.miu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dsa
{
    // 1
    public static int largestAdjacentSum(int[] a){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length-1;i++){
            if(a[i] + a[i+1] > max){
                max = a[i] + a[i+1];
            }
        }
        return max;
    }

    // 2
    static int checkConcatenatedSum(int n, int catlen){
        int originalNumber = n;
        int totalSum = 0;
        while(n!=0){
            int digit = n%10;
            int concatSum = 0;
            for(int i=0;i<catlen;i++){
                concatSum = (concatSum *10) + digit;
            }
            totalSum += concatSum;
            n = n/10;
        }
        return  originalNumber == totalSum ? 1 : 0;
    }

   // 3
    static int equivalentArrays(int[] a1,int[] a2){
        Map<Integer,Integer> mapOne = new HashMap<>();
        Map<Integer,Integer> mapTwo = new HashMap<>();

        for(int i =0;i<a1.length;i++){
            if(!mapOne.containsKey(a1[i])) mapOne.put(a1[i], 1);
            else mapOne.put(a1[i], mapOne.get(a1[i]) + 1);
        }
        for(int i =0;i<a2.length;i++){
            if(!mapTwo.containsKey(a2[i])) mapTwo.put(a2[i], 1);
            else mapTwo.put(a2[i], mapTwo.get(a2[i]) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : mapOne.entrySet()){
            if(!mapTwo.containsKey(entry.getKey())) return 0;
        }
        for(Map.Entry<Integer,Integer> entry : mapTwo.entrySet()){
            if(!mapOne.containsKey(entry.getKey())) return 0;
        }

        return 1;
    }

   // 4
    public static int hasSingleMaximum(int[] arr){
        if(arr.length == 0 ) return 0;

        int max = arr[0];
        boolean duplicated = false;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                duplicated = false;
            }
            else if(arr[i] == max){
                duplicated = true;
            }
        }
        if(duplicated) return 0;
        return 1;
    }

   // 5
    public static int is235Array(int[] arr){
        int total = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0) total += 1;
            if(arr[i] % 3 == 0) total += 1;
            if(arr[i] % 5 == 0) total += 1;
            if(arr[i] % 2 != 0 && arr[i] % 3 != 0 && arr[i] % 5 != 0) total += 1;
        }
        return total == arr.length ? 1 : 0;
    }

   // 6
    public static int largestPrimeFactor(int num){
        if (num <=1) return 0;

        int number = num;
        while(number >1){
            if(num % number == 0){
                boolean isPrime = true;
                for(int i=2;i<number;i++){
                    if(number % i == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) return number;
            }
            number--;
        }
        return 0;
    }

   // 7
    public static int[] encodeNumber(int n){

        if(n<=1) return null;
        List<Integer> primeFactors = new ArrayList<>();

        for(int i=2;i<n;i++){
            while(n%i == 0){
                primeFactors.add(i);
                n = n/i;
            }
        }

        if(n > 1) primeFactors.add(n);
        int [] arrayToReturn = new int [primeFactors.size()];

        for(int i =0; i<primeFactors.size(); i++){
            arrayToReturn[i] = primeFactors.get(i);
        }
        return arrayToReturn;
    }

    // 8
    static void doIntegerBasedRounding(int[] a, int n){
        if(n <= 0) return;
        for(int i = 0;i<a.length;i++){
            if(a[i] >= 0){
                int lowerBound = (a[i]/n)*n;
                int upperBound = lowerBound + n;
                int middleElement = n%2==0  ? lowerBound + n/2 : lowerBound + n/2 +1;
                if(a[i] >= middleElement) a[i] = upperBound;
                else a[i] = lowerBound;
            }
        }
    }

    //9
    static int isCubePowerful(int n){
        if(n<=0) return 0;

        int originalNum = n;
        int totalSum = 0;

        while(n!=0){
            int digit = n%10;
            totalSum += digit * digit * digit;
            n = n/10;
        }
        return originalNum == totalSum ? 1 : 0;
    }

    //10
    static int decodeArray(int[] array){
        int encodedNum = 0;
        for(int i=0; i<array.length-1; i++){
            int digit = Math.abs(array[i] - array[i+1]);
            encodedNum = encodedNum * 10 + digit;
        }

        if(array[0] < 0) return encodedNum * -1;

        return encodedNum;
    }

    //11
    static int checkMNSequence(int[] a, int m, int n){
        if(a[0] != m || a[a.length-1] != n) return 0;

        for (int i=0; i < a.length-1; i++){
            if(a[i+1]-a[i] != 0 && a[i+1]-a[i] != 1) return 0;
        }
        return 1;
    }

}
