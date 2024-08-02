package com.basant.leetcode;

public class Easy {

    // https://leetcode.com/problems/two-sum/description/

    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i < nums.length; i++){
            for(int j= i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    // https://leetcode.com/problems/palindrome-number/
    public boolean isPalindrome(int x) {
        // check for negative number
        if( x < 0) return false;
        // necessary variable
        long reversedNumber = 0;
        long originalNumber = x;

        // calculate the reverse number
        while(x!=0){
            reversedNumber = reversedNumber * 10 + x % 10;
            x = x / 10;
        }
        return reversedNumber == originalNumber;
    }

    //









}
