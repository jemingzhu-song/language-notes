package DataStructures.List_Interface;

import java.util.Stack;

/*
    Notes
    0.  Stack follows the LIFO (Last In, First Out) manner - elements that are added to the top of the
        stack and removed from the top of the stack.
    1.  The Java collections framework has a class named Stack that provides the functionality of the 
        "stack" data structure.
    2.  The Stack class extends the Vector class.
    3.  Syntax for creating a stack:
            Stack<Type> variableName = new Stack<>();
    4.  Since Stack extends the Vector class, it inherits all the methods Vector. The Stack class includes 
        5 more methods that distinguish it from Vector:
            1) push() - add an element to the top of the stack, we use the push() method
            2) pop() - remove an element from the top of the stack, we use the pop() method
            3) peek() - returns an object from the top of the stack
            4) search() - search an element in the stack, we use the search() method. 
                        It returns the position of the element from the top of the stack
            5) empty() - check whether a stack is empty or not, we use the empty() method
*/

public class Stacks {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> weekdays = new Stack<>();
    
        // 1. Add elements to the stack: .push()
        weekdays.push("Monday");
        weekdays.push("Tuesday");
        weekdays.push("Wednesday");
        weekdays.push("Thursday");
        weekdays.push("Friday");
        System.out.println(weekdays); // [Monday, Tuesday, Wednesday, Thursday, Friday]
        // 2. Remove an element from the top of the stack: .pop()
        System.out.println(weekdays.pop()); // Friday
        System.out.println(weekdays.pop()); // Thursday
        System.out.println(weekdays); // [Monday, Tuesday, Wednesday]

        // 3. Return the element currently at the top of the stack
        System.out.println(weekdays.peek());
        System.out.println(weekdays); // [Monday, Tuesday, Wednesday]

        // 4. Find the position of an element in the stack (from the top of the stack)
        int position = weekdays.search("Tuesday");
        System.out.println("Position of 'Tuesday': " + position); // position: 2

        // 5. Check whether a stack is empty or not
        boolean result = weekdays.empty();
        System.out.println("The stack is empty: " + result); // false
        
    }
     
}
