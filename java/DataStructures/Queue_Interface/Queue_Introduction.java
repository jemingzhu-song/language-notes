package DataStructures.Queue_Interface;

/*
    Notes
    0.  Queue follows the FIFO (First In, First Out) manner - elements that are added from behind
        removed from the front of the queue.
    1.  The Queue interface of the Java collections framework provides the functionality of the queue data 
        structure. It extends the Collection interface.
    2.  Normal Queue is implemented using the "LinkedList" class - (add(), remove() methods)
        Priority Queue is implemented using the "PriorityQueue" class - (add(), remove() methods, & Comparator)
*/

/* ------------------------------ Classes that Implement Queue ------------------------------ */
/* 
    Since the Queue is an interface, we cannot provide the direct implementation of it.
    In order to use the functionalities of Queue, we need to use classes that implement it:
        - ArrayDeque
        - LinkedList
        - PriorityQueue
*/


/* ------------------------------ Methods of List Interface ------------------------------ */
/*
    The Queue interface includes all the methods of the Collection interface. 
    It is because Collection is the super interface of Queue.

    Some of the commonly used methods of the Queue interface are:
        1) add() - Inserts the specified element into the queue. If the task is successful, add() returns true, 
                if not it throws an exception.
        2) offer() - Inserts the specified element into the queue. If the task is successful, offer() 
           returns true, if not it returns false.
        3) element() - Returns the head of the queue. Throws an exception if the queue is empty.
        4) peek() - Returns the head of the queue. Returns null if the queue is empty.
        5) remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
        6) poll() - Returns and removes the head of the queue. Returns null if the queue is empty.
*/

public class Queue_Introduction {
    
}
