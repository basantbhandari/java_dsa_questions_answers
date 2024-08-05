package com.basant.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

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

    // https://leetcode.com/problems/roman-to-integer/description/

    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                ans -= m.get(s.charAt(i));
            } else {
                ans += m.get(s.charAt(i));
            }
        }

        return ans;
    }

    // https://leetcode.com/problems/longest-common-prefix/description/
    public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    // https://leetcode.com/problems/valid-parentheses/
    // with using stack
    public boolean isValid(String s) {
        // Create an empty stack to keep track of opening brackets
        Stack<Character> stack = new Stack<Character>();

        // Loop through every character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else { // If the character is a closing bracket
                // If the stack is empty, there is no matching opening bracket, so return false
                if (stack.isEmpty()) {
                    return false;
                }
                // Otherwise, get the top of the stack and check if it's the matching opening bracket
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    // If it is, pop the opening bracket from the stack
                    stack.pop();
                } else { // Otherwise, the brackets don't match, so return false
                    return false;
                }
            }
        }
        // If the stack is empty, all opening brackets have been closed, so return true
        // Otherwise, there are unmatched opening brackets, so return false
        return stack.isEmpty();
    }
    // without using stack
    public static boolean isValid1(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                // If the string becomes empty, it indicates all brackets are matched.
                return s.isEmpty();
            }
        }
    }

    // https://leetcode.com/problems/remove-element/description/
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    // https://leetcode.com/problems/search-insert-position/description/
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }


    // https://leetcode.com/problems/length-of-last-word/
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }

        return length;
    }


    // https://leetcode.com/problems/add-binary/description/
    public String addBinary(String a, String b)
    {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1)
        {

            if(i >= 0)
                carry += a.charAt(i--) - '0';
            if(j >= 0)
                carry += b.charAt(j--) - '0';

            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }

    //
































}
