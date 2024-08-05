package com.basant.github.miu;
import java.util.Arrays;

public class StringOperationsDemo {

    public static void main(String[] args) {
        // Declare and initialize strings
        String str1 = "Hello, World!";
        String str2 = "Java Programming";

        // Length of a string
        System.out.println("Length of str1: " + str1.length());  // Output: 13

        // Character at a specific index
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));  // Output: e

        // Substring
        System.out.println("Substring of str1 from index 7: " + str1.substring(7));  // Output: World!
        System.out.println("Substring of str1 from index 7 to 12: " + str1.substring(7, 12));  // Output: World

        // Concatenation
        String concatenated = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + concatenated);  // Output: Hello, World! Java Programming

        // Contains
        System.out.println("str1 contains 'World': " + str1.contains("World")); // Output: true

        System.out.println("str1 contains 'world': " + str1.contains("world"));  // Output: true

        // Index of a character or substring
        System.out.println("Index of 'o' in str1: " + str1.indexOf('o'));  // Output: 4
        System.out.println("Last index of 'o' in str1: " + str1.lastIndexOf('o'));  // Output: 8
        System.out.println("Index of 'World' in str1: " + str1.indexOf("World"));  // Output: 7

        // Replace characters or substrings
        String replaced = str1.replace('o', '0');
        System.out.println("Replaced 'o' with '0' in str1: " + replaced);  // Output: Hell0, W0rld!
        String replacedSubstring = str1.replace("World", "Java");
        System.out.println("Replaced 'World' with 'Java' in str1: " + replacedSubstring);  // Output: Hello, Java!

        // Split string
        String[] words = str1.split(", ");
        System.out.println("Split str1 by ', ': " + Arrays.toString(words));  // Output: [Hello, World!]

        // Trim whitespace
        String str3 = "   Hello, Java!   ";
        System.out.println("Trimmed str3: '" + str3.trim() + "'");  // Output: 'Hello, Java!'

        // Convert to uppercase and lowercase
        System.out.println("str1 in uppercase: " + str1.toUpperCase());  // Output: HELLO, WORLD!
        System.out.println("str1 in lowercase: " + str1.toLowerCase());  // Output: hello, world!

        // Check if string is empty or blank
        System.out.println("str1 is empty: " + str1.isEmpty());  // Output: false
        System.out.println("str1 is blank: " + str1.isBlank());  // Output: false

        // Compare strings
        System.out.println("str1 equals str2: " + str1.equals(str2));  // Output: false
        System.out.println("str1 equalsIgnoreCase 'hello, world!': " + str1.equalsIgnoreCase("hello, world!"));  // Output: true
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));  // Output: a negative number

        // Value of different types to string
        int number = 100;
        String numberStr = String.valueOf(number);
        System.out.println("String value of number: " + numberStr);  // Output: 100

        // Formatting strings
        String formattedStr = String.format("Name: %s, Age: %d", "John", 30);
        System.out.println("Formatted string: " + formattedStr);  // Output: Name: John, Age: 30

        // Join strings
        String joinedStr = String.join(", ", "Java", "Python", "C++");
        System.out.println("Joined string: " + joinedStr);  // Output: Java, Python, C++

        // Convert to char array
        char[] charArray = str1.toCharArray();
        System.out.println("Char array from str1: " + Arrays.toString(charArray));  // Output: [H, e, l, l, o, ,,  , W, o, r, l, d, !]

        // Check if a string starts with or ends with a specific substring
        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello"));  // Output: true
        System.out.println("str1 ends with 'World!': " + str1.endsWith("World!"));  // Output: true

        // Interning strings
        String internedStr1 = str1.intern();
        String internedStr2 = new String("Hello, World!").intern();
        System.out.println("Interned strings are equal: " + (internedStr1 == internedStr2));  // Output: true

        // Repeat a string
        String repeatedStr = "abc".repeat(3);
        System.out.println("Repeated string: " + repeatedStr);  // Output: abcabcabc

        // Strip leading and trailing whitespace
        String str4 = "   Hello, Java!   ";
        System.out.println("Stripped leading and trailing: '" + str4.strip() + "'");  // Output: 'Hello, Java!'
        System.out.println("Stripped leading: '" + str4.stripLeading() + "'");  // Output: 'Hello, Java!   '
        System.out.println("Stripped trailing: '" + str4.stripTrailing() + "'");  // Output: '   Hello, Java!'

        // String comparison
        String strA = "abc";
        String strB = "ABC";
        System.out.println("strA compareTo strB: " + strA.compareTo(strB));  // Output: a positive number
        System.out.println("strA compareToIgnoreCase strB: " + strA.compareToIgnoreCase(strB));  // Output: 0
    }
}
