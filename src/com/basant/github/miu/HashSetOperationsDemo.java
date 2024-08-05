package com.basant.github.miu;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperationsDemo {

    public static void main(String[] args) {
        // Declare and initialize a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("JavaScript");

        System.out.println("Initial HashSet: " + set);  // Output: [Java, Python, C++, JavaScript]

        // Check if the HashSet contains an element
        System.out.println("HashSet contains 'Java': " + set.contains("Java"));  // Output: true
        System.out.println("HashSet contains 'Ruby': " + set.contains("Ruby"));  // Output: false

        // Remove an element from the HashSet
        set.remove("C++");
        System.out.println("After removing 'C++': " + set);  // Output: [Java, Python, JavaScript]

        // Size of the HashSet
        System.out.println("Size of HashSet: " + set.size());  // Output: 3

        // Iterating through the HashSet using Iterator
        System.out.print("Iterating using Iterator: ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");  // Output: Java Python JavaScript
        }
        System.out.println();

        // Iterating through the HashSet using enhanced for-loop
        System.out.print("Iterating using enhanced for-loop: ");
        for (String element : set) {
            System.out.print(element + " ");  // Output: Java Python JavaScript
        }
        System.out.println();

        // Clearing the HashSet
        set.clear();
        System.out.println("After clearing: " + set);  // Output: []

        // Adding elements to the HashSet again for further operations
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("JavaScript");

        // Checking if HashSet is empty
        System.out.println("HashSet is empty: " + set.isEmpty());  // Output: false

        // Adding all elements from another collection
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Ruby");
        anotherSet.add("Swift");
        set.addAll(anotherSet);
        System.out.println("After adding elements from another collection: " + set);  // Output: [Java, Python, JavaScript, Ruby, Swift, C++]

        // Removing all elements present in another collection
        set.removeAll(anotherSet);
        System.out.println("After removing elements of another collection: " + set);  // Output: [Java, Python, C++, JavaScript]

        // Retaining only elements present in another collection
        anotherSet.add("Java");
        set.retainAll(anotherSet);
        System.out.println("After retaining elements of another collection: " + set);  // Output: [Java]

        // Converting HashSet to an array
        String[] array = set.toArray(new String[0]);
        System.out.println("HashSet to Array: " + java.util.Arrays.toString(array));  // Output: [Java]

        // Creating a HashSet from another collection
        HashSet<String> setFromCollection = new HashSet<>(java.util.Arrays.asList("Go", "Kotlin", "Dart"));
        System.out.println("HashSet from Collection: " + setFromCollection);  // Output: [Go, Kotlin, Dart]
    }
}
