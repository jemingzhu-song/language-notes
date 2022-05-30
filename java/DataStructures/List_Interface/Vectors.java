package DataStructures.List_Interface;

import java.util.Vector;

/*
    Notes
    1.  The Vector class is an implementation of the List interface which allows you to create
        resizeable arrays similar to the ArrayList class.
    2.  The Vector class synchronizes each individual operation, meaning whenever you want to perform an
        operation on vectors, the Vector class automatically applies a "lock" to the operation.
        This is because when one thread is accessing a vector, and at the same time another thread
        tries to access it, an exception called: "ConcurrentModificationException" is raised. Hence,
        this continuous use of lock for each operation makes vectors less efficient. 
        However, in array lists, methods are not synchronized. Instead, it uses the 
        Collections.synchronizedList() method that synchronizes the list as a whole.
    3.  It is generally recommended to use ArrayList in place of Vector because vectors are less efficient.
    4.  Syntax for creating a vector:
            Vector<Type> variableName = new Vector<>();
    5.  The methods for the Vector class are the same/similar to the ArrayList class:
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

public class Vectors {

    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> languages = new Vector<>();

        // 1. Add elements to a vector
        languages.add("English");
        languages.add(1, "German");
        languages.add("Chinese");
        languages.add("Japanese");
        System.out.println(languages);

        // 2. Access elements of a vector
        String element1 = languages.get(1);
        System.out.println(element1);

        // 3. Remove elements from a vector
        languages.remove("Chinese");
        System.out.println(languages);

        // 4. Modify/Set elements of a vector
        languages.set(1, "Germanese");
        System.out.println(languages);
    }
}
