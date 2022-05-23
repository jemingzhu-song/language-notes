package DataStructures.List_Interface;

import java.util.ArrayList;

/*
    Notes:
    1.  The ArrayList class implements the functionality of resizable-arrays. It implements the
        List interface of the collections framework - they are DYNAMIC arrays.
    2.  Syntax for creating an ArrayList:
        
        ArrayList<Type> variableName = new ArrayList<>();

            - Type: indicates the type of an array list, e.g. ArrayList<Integer> integerArray;
    3.  In the "List_Introduction.java" file, as discussed, the ArrayList class implements the
        "List" interface of the "collections" framework, and therefore has access to the following
        methods:

            1) add() - adds an element to a list
            2) addAll() - adds all elements of one list to another
            3) get() - helps to randomly access elements from lists
            4) iterator() - returns iterator object that can be used to sequentially access 
                            elements of lists
            5) set() - changes elements of lists
            6) remove() - removes an element from the list. Returns the element that was removed.
            7) removeAll() - removes all the elements from the list
            8) clear() - removes all the elements from the list (more efficient than removeAll())
            9) size() - returns the length of lists
            10) toArray() - converts a list into an array
            11) contains() - returns true if a list contains specified element
*/


public class ArrayLists {
    public static void main(String[] args) {
        // Declare an Array of Strings
        ArrayList<String> languages = new ArrayList<>();

        // 0. Print an ArrayList
        System.out.println("ArrayList: " + languages);
        
        // 1. Add Elements to an ArrayList
        languages.add("Java");
        languages.add("C");
        languages.add("Python");
        languages.add("Javascript");
        languages.add("HTML/CSS");
        System.out.println("ArrayList: " + languages);
        
        // 2. Access ArrayList Elements
        String element1 = languages.get(2);
        System.out.println(element1);

        // 3. Change ArrayList Elements
        languages.set(2, "Python Replaced...");
        System.out.println("ArrayList Modified: " + languages);

        // 4. Remove ArrayList Elements
        String removed = languages.remove(2);
        System.out.println("ArrayList Removed Element: " + languages);
        System.out.println("Removed Element is: " + removed);
        
    }
}
