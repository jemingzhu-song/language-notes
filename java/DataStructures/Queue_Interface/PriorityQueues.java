package DataStructures.Queue_Interface;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
    Notes
    0.  Unlike normal queues, priority queue elements are retrieved in sorted order. 
        Suppose, we want to retrieve elements in the ascending order. In this case, the head of the 
        priority queue will be the smallest element. Once this element is retrieved, the next smallest 
        element will be the head of the queue. It is important to note that the elements of a priority 
        queue may not be sorted. However, elements are always retrieved in sorted order.
    1.  The PriorityQueue class provides the functionality of the heap data structure.
        It implements the Queue interface.
    2.  Syntax for creating a Priority Queue:
            PriorityQueue<Type> variable = new PriorityQueue<>();
    3.  The PriorityQueue class provides the implementation of all the methods present in the Queue interface:
            1) add() - Inserts the specified element into the queue. If the task is successful, add() 
            returns true, if not it throws an exception.
            2) offer() - Inserts the specified element into the queue. If the task is successful, offer() 
            returns true, if not it returns false.
            3) element() - Returns the head of the queue. Throws an exception if the queue is empty.
            4) peek() - Returns the head of the queue. Returns null if the queue is empty.
            5) remove() - removes the specified element from the queue. If no element is specified, returns
                          and removes the head of the queue.
            6) poll() - returns and removes the head of the queue
            7) contains(element) - Searches the priority queue for the specified element. If the element is found, it returns true, if not it returns false.
            8) size() - Returns the length of the priority queue.
            9) toArray() - Converts a priority queue to an array and returns it.
    4.  By default, the PriorityQueue will keep the "smallest" elements at the head/front of the queue.
        To customise how the ordering is determined, we use the Comparator interface.
*/

public class PriorityQueues {
    public static void main(String[] args) {
        // Creating a PriorityQueue
        PriorityQueue<Integer> scores = new PriorityQueue<>();
        
        // 1. Add to a PriorityQueue: .add()
        scores.add(80);
        scores.add(89);
        scores.add(60);
        scores.add(95);
        scores.add(78);
        System.out.println(scores); 

        // 2. Remove from a PriorityQueue: .remove()
        System.out.println(scores.remove()); // removes 60 
        System.out.println(scores.remove()); // removes 78 
        System.out.println(scores.remove()); // removes 80
        System.out.println(scores.remove()); // removes 89
        System.out.println(scores.remove()); // removes 95
        
        // PriorityQueue Comparator
        /* 
            In all the examples above, priority queue elements are retrieved in the natural order 
            (ascending order). However, we can customize this ordering.
            For this, we need to create our own comparator class that implements the Comparator interface. 
        */
        // We have created a priority queue passing CustomComparator class as an argument.
        // The CustomComparator class implements the Comparator interface.
        // We then override the compare() method. The method now causes the head of the element to be 
        // the largest number.
        PriorityQueue<Integer> numbers = new PriorityQueue<>(new CustomComparator());
        numbers.add(92);
        numbers.add(2);
        numbers.add(52);
        numbers.add(78);
        System.out.println("PriorityQueue: " + numbers);

        System.out.println(numbers.remove()); // removes 92
        System.out.println(numbers.remove()); // removes 78
        System.out.println(numbers.remove()); // removes 52
        System.out.println(numbers.remove()); // removes 2
    }
}

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer number1, Integer number2) {
        if (number1 == number2) {
            return 0;
        } else if (number1 > number2) {
            return -1;
        } else { // number1 < number2
            return 1;
        }
    }
}

