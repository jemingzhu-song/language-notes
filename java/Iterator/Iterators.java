package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/*
    Notes
    0.  All the interfaces under the Collections Framework includes an iterator() method.
        This method returns an instance of iterator used to iterate over elements of
        collections.
    1.  The Iterator interface of the Collections Framework allows us to access elements
        of a collection. It has a Sub-Interface of: ListIterator.
    2.  The Iterator interface provides 4 methods that can be used to perform various 
        operations on elements of collections:
            1) hasNext() - returns true if there exists an element in the collection
            2) next() - returns the next element of the collection
            3) remove() - removes the last element returned by the next()
            4) forEachRemaining() - performs the specified action for each remaining element 
                                    of the collection
*/

public class Iterators {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(10);
        numbers.add(2);
        numbers.add(7);

        // Create an Instance of Iterator
        Iterator<Integer> iterate = numbers.iterator();

        // 1. Use .next() method
        int number = iterate.next();
        System.out.println(number);

        // 2. Use .remove() method - removes the LAST ELEMENT returned by .next()
        iterate.remove();
        System.out.println("Removed element: " + number);

        // 3. Using hasNext() method
        while (iterate.hasNext()) {
            // Using the forEachRemaining() method
            iterate.forEachRemaining((value) -> System.out.print(value + ", "));
        }

        // Using Iterator to Iterate over Elements
        ArrayList<String> names = new ArrayList<>();
        names.add("Johnny");
        names.add("Michael");
        names.add("Kim");
        names.add("Linny");
        names.add("Kevin");
        names.add("David");

        Iterator<String> name = names.iterator();
        while (name.hasNext()) {
            System.out.println(name.next());
        }
    }
}
