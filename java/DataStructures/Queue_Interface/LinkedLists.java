package DataStructures.Queue_Interface;

import java.util.LinkedList;

/*
    Notes
    0.  LinkedList class can act as a normal Queue (FIFO) by using .remove() (removes first element by default)
        or .remove(0)
    1.  The LinkedList class of the Java collections framework provides the functionality of the 
        linked list data structure (doubly linkedlist).
    2.  Each element in a linked list is known as a node. It consists of 3 fields:
            1) Prev - stores an address of the previous element in the list. It is null for the first element
            2) Next - stores an address of the next element in the list. It is null for the last element
            3) Data - stores the actual data
    3.  Syntax for creating a LinkedList:
            LinkedList<Type> variableName = new LinkedList<>();
    4.  Methods of LinkedList
            1) add() - method to add an element (node) at the end of the LinkedList. You can also specify an
                       index to indicate where to add the element, e.g. add(1, "Dog") will add "Dog" element
                       to index 1
            2) get(index) - used to access an element from the LinkedList.
            3) set(index, element) - change elements of the LinkedList. 
            4) remove() - remove an element from the LinkedList. If no index is provided, removes the element
                          at the HEAD/FRONT of the list. You can also specify an index to indicate where to
                          remove the element from, e.g. remove(2) will remove the element at index 2
*/


public class LinkedLists {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> animals = new LinkedList<>();
        
        // 1. Add to LinkedList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Donkey");
        animals.add("Kangaroo");
        animals.add("Bird");
        System.out.println(animals);

        // 2. Remove from LinkedList
        System.out.println(animals.remove()); // Dog
        System.out.println(animals.remove()); // Cat
        System.out.println(animals); // [Cow, Donkey, Kangaroo, Bird]

        // 3. Get an Element from the LinkedList
        System.out.println(animals.get(1)); // Donkey
        
        // 4. Set an Element in the LinkedList
        animals.set(1, "DONKEY");
        System.out.println(animals); // [Cow, DONKEY, Kangaroo, Bird]
    }
}
