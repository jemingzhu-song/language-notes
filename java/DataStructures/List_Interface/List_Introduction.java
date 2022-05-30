package DataStructures.List_Interface;

/*
    Notes: https://www.programiz.com/java-programming/list
    
    In Java, the List interface is an ordered collection that allows us to store and 
    access elements sequentially. It extends the Collection interface.
*/

/* ------------------------------ Classes that Implement List ------------------------------ */
/*
    Since List is an interface, we cannot create objects from it.
    In order to use functionalities of the List interface, we can use these classes:
        1) ArrayList
        2) LinkedList
        3) Vector
        4) Stack
*/

/* ------------------------------ Methods of List Interface ------------------------------ */
/*
    The List interface includes all the methods of the Collection interface. 
    Its because Collection is a super interface of List.

    Some of the commonly used methods of the Collection interface that's also 
    available in the List interface are:

    1) add() - adds an element to a list
    2) addAll() - adds all elements of one list to another
    3) get() - helps to randomly access elements from lists
    4) iterator() - returns iterator object that can be used to sequentially access elements of lists
    5) set() - changes elements of lists
    6) remove() - removes an element from the list
    7) removeAll() - removes all the elements from the list
    8) clear() - removes all the elements from the list (more efficient than removeAll())
    9) size() - returns the length of lists
    10) toArray() - converts a list into an array
    11) contains() - returns true if a list contains specified element
*/

public class List_Introduction {
    
}
