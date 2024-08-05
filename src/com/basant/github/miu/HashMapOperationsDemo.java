package com.basant.github.miu;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperationsDemo {

    public static void main(String[] args) {
        // Declare and initialize a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Java", 1);
        map.put("Python", 2);
        map.put("C++", 3);
        map.put("JavaScript", 4);

        System.out.println("Initial HashMap: " + map);  // Output: {Java=1, Python=2, C++=3, JavaScript=4}

        // Check if the HashMap contains a key
        System.out.println("HashMap contains key 'Java': " + map.containsKey("Java"));  // Output: true
        System.out.println("HashMap contains key 'Ruby': " + map.containsKey("Ruby"));  // Output: false

        // Check if the HashMap contains a value
        System.out.println("HashMap contains value 2: " + map.containsValue(2));  // Output: true
        System.out.println("HashMap contains value 5: " + map.containsValue(5));  // Output: false

        // Retrieve a value associated with a key
        System.out.println("Value associated with key 'C++': " + map.get("C++"));  // Output: 3
        System.out.println("Value associated with key 'Ruby': " + map.get("Ruby"));  // Output: null

        // Remove a key-value pair from the HashMap
        map.remove("C++");
        System.out.println("After removing 'C++': " + map);  // Output: {Java=1, Python=2, JavaScript=4}

        // Size of the HashMap
        System.out.println("Size of HashMap: " + map.size());  // Output: 3

        // Iterating through the HashMap using entrySet
        System.out.print("Iterating using entrySet: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");  // Output: Java=1 Python=2 JavaScript=4
        }
        System.out.println();

        // Iterating through the HashMap using keySet
        System.out.print("Iterating using keySet: ");
        for (String key : map.keySet()) {
            System.out.print(key + "=" + map.get(key) + " ");  // Output: Java=1 Python=2 JavaScript=4
        }
        System.out.println();

        // Iterating through the HashMap using values
        System.out.print("Iterating using values: ");
        for (Integer value : map.values()) {
            System.out.print(value + " ");  // Output: 1 2 4
        }
        System.out.println();

        // Clearing the HashMap
        map.clear();
        System.out.println("After clearing: " + map);  // Output: {}

        // Adding key-value pairs to the HashMap again for further operations
        map.put("Java", 1);
        map.put("Python", 2);
        map.put("C++", 3);
        map.put("JavaScript", 4);

        // Checking if HashMap is empty
        System.out.println("HashMap is empty: " + map.isEmpty());  // Output: false

        // Putting all elements from another map
        HashMap<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Ruby", 5);
        anotherMap.put("Swift", 6);
        map.putAll(anotherMap);
        System.out.println("After adding elements from another map: " + map);  // Output: {Java=1, Python=2, JavaScript=4, Ruby=5, Swift=6, C++=3}

        // Replacing a value for a specific key
        map.replace("Python", 22);
        System.out.println("After replacing value for 'Python': " + map);  // Output: {Java=1, Python=22, JavaScript=4, Ruby=5, Swift=6, C++=3}

        // Replace a value for a specific key only if it is currently mapped to a given value
        map.replace("JavaScript", 4, 44);
        System.out.println("After conditionally replacing value for 'JavaScript': " + map);  // Output: {Java=1, Python=22, JavaScript=44, Ruby=5, Swift=6, C++=3}

        // Getting a default value if the key is not present
        System.out.println("Getting value for 'PHP' with default 0: " + map.getOrDefault("PHP", 0));  // Output: 0

        // Merging a value for a specific key
        map.merge("Swift", 10, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("After merging value for 'Swift': " + map);  // Output: {Java=1, Python=22, JavaScript=44, Ruby=5, Swift=16, C++=3}
    }
}
