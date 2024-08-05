package com.basant.github.miu;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperationsDemo {

    public static void main(String[] args) {
        // Declare and initialize an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        System.out.println("Initial ArrayList: " + list);  // Output: [Java, Python, C++, JavaScript]

        // Adding an element at a specific index
        list.add(2, "Ruby");
        System.out.println("After adding 'Ruby' at index 2: " + list);  // Output: [Java, Python, Ruby, C++, JavaScript]

        // Removing an element by value
        list.remove("Python");
        System.out.println("After removing 'Python': " + list);  // Output: [Java, Ruby, C++, JavaScript]

        // Removing an element by index
        list.remove(1);
        System.out.println("After removing element at index 1: " + list);  // Output: [Java, C++, JavaScript]

        // Checking if the ArrayList contains a specific element
        System.out.println("ArrayList contains 'Java': " + list.contains("Java"));  // Output: true
        System.out.println("ArrayList contains 'Python': " + list.contains("Python"));  // Output: false

        // Getting an element by index
        System.out.println("Element at index 2: " + list.get(2));  // Output: JavaScript

        // Setting a new value at a specific index
        list.set(1, "C#");
        System.out.println("After setting 'C#' at index 1: " + list);  // Output: [Java, C#, JavaScript]

        // Size of the ArrayList
        System.out.println("Size of ArrayList: " + list.size());  // Output: 3

        // Iterating through the ArrayList using a for loop
        System.out.print("Iterating using for loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");  // Output: Java C# JavaScript
        }
        System.out.println();

        // Iterating through the ArrayList using a for-each loop
        System.out.print("Iterating using for-each loop: ");
        for (String element : list) {
            System.out.print(element + " ");  // Output: Java C# JavaScript
        }
        System.out.println();

        // Clearing the ArrayList
        list.clear();
        System.out.println("After clearing: " + list);  // Output: []

        // Adding elements to the ArrayList again for further operations
        Collections.addAll(list, "Java", "Python", "C++", "JavaScript");

        // Sorting the ArrayList
        Collections.sort(list);
        System.out.println("After sorting: " + list);  // Output: [C++, Java, JavaScript, Python]

        // Reversing the ArrayList
        Collections.reverse(list);
        System.out.println("After reversing: " + list);  // Output: [Python, JavaScript, Java, C++]

        // Shuffle the ArrayList
        Collections.shuffle(list);
        System.out.println("After shuffling: " + list);  // Output: [JavaScript, Python, C++, Java] (order may vary)

        // Creating a subList
        ArrayList<String> subList = new ArrayList<>(list.subList(1, 3));
        System.out.println("SubList from index 1 to 3: " + subList);  // Output: [JavaScript, C++] (depends on shuffle)

        // Converting ArrayList to array
        String[] array = list.toArray(new String[0]);
        System.out.print("Array from ArrayList: ");
        for (String element : array) {
            System.out.print(element + " ");  // Output: JavaScript Python C++ Java (order may vary)
        }
        System.out.println();

        // Checking if ArrayList is empty
        System.out.println("ArrayList is empty: " + list.isEmpty());  // Output: false

        // Adding all elements from another collection
        ArrayList<String> anotherList = new ArrayList<>();
        Collections.addAll(anotherList, "Swift", "Kotlin");
        list.addAll(anotherList);
        System.out.println("After adding elements from another list: " + list);  // Output: [JavaScript, Python, C++, Java, Swift, Kotlin] (order may vary)

        // Removing all elements from another collection
        list.removeAll(anotherList);
        System.out.println("After removing elements from another list: " + list);  // Output: [JavaScript, Python, C++, Java] (order may vary)

        // Retaining all elements from another collection
        anotherList.clear();
        Collections.addAll(anotherList, "Python", "Java");
        list.retainAll(anotherList);
        System.out.println("After retaining elements from another list: " + list);  // Output: [Python, Java] (order may vary)
    }
}
