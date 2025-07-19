// ArrayList can grow and shrink dynamically.
    // Allows duplicate elements.
    // Internally uses dynamic arrays.
    // It's not synchronized → not thread-safe by default.

import java.util.ArrayList;
import java.util.*;

public class ArrayListt{
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits);
        System.out.println("First fruit: " + fruits.get(0));
        
        fruits.set(1, "Orange"); // Change Banana to Orange
        fruits.remove("Mango");

        System.out.println("Updated Fruits: " + fruits);
        System.out.println("Size: " + fruits.size());
    // LIST----------------
    // list.isEmpty()
    // list.contains("Banana")
    // list.clear()	Removes all elements

// list does not have sort method but can be sort using collection.sort
System.out.println("////////////////////////////////////");
    List<String> names = new ArrayList<>();
    names.add("Ram");
names.add("Amit");
names.add("Kiran");
Collections.sort(names, (a, b) -> b.compareTo(a)); // Descending order
System.out.println(names);  // [Ram, Kiran, Amit]

List<Integer> numbers = new ArrayList<>();
numbers.add(5);
numbers.add(1);
numbers.add(3);

Collections.sort(numbers);  // Ascending order: [1, 3, 5]
System.out.println(numbers);
    }


}