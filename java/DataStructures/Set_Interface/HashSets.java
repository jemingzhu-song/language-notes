package DataStructures.Set_Interface;
/*
    Notes
    0.  HashSets do not maintain order of the elements - hence, sorting of HashSets is not possible.
        HashSets also do not maintain indicies - hence, you cannot iterate or find values by index.
        In Java, HashSet is commonly used if we have to access elements randomly. 
        It is because elements in a hash table are accessed using hash codes.
    1.  The HashSet class of the Java Collections framework provides the functionalities of the hash 
        table data structure. It implements the Set interface.
    2.  Syntax for creating a HashSet:
            HashSet<Type> variableName = new HashSet<>();
    3.  Methods of HashSet:
            1) add() - inserts the specified element to the set
            2) add All() - inserts all the elements of the specified collection to the set
            3) remove() - removes the specified element from the set
            4) removeAll() - removes all the elements from the set
    4.  Set Operations:
            1) addAll() - perform a union between two sets. 
                Syntax:
                    set01.addAll(set02);
                This union will be combined into "set01" variable
            2) retainAll() - perform the intersection between two sets
                Syntax:
                    set01.retainAll(set02);
                This intersection will be combined into "set01" variable
            3) removeAll() - perform the difference between two sets
                    Syntax:
                    set01.removeAll(set02);
                This difference will be combined into "set01" variable
            4) subset() - check if a set is a subset of another set. Returns boolean.
                    Syntax:
                    setMaster.containsAll(setSubset);
                    Check whether "setSubset" is a subset of "setMaster"
*/

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
    
        // 1. Insert into HashSet
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        numbers.add(12);
        System.out.println(numbers);

        // 2. Accessing HashSet elements - must use for-each loop or an iterator()
        // A) iterator()
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()) {
            System.out.println(iterate.next());
        }
        // B) for-each loop
        for (Integer i : numbers) {
            System.out.println(i);
        }

        // 3. Remove elements using: .remove()
        numbers.remove(12);
        System.out.println(numbers);

        // 4. Check if Contains
        numbers.contains(10);

        /* -------------------- Set Operations -------------------- */
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        evenNumbers.add(10);
        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        oddNumbers.add(9);
        
        // 1. Union: addAll()
        evenNumbers.addAll(oddNumbers);
        System.out.println(evenNumbers);


        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        
        // 2. Intersection: retainAll()
        oddNumbers.retainAll(primeNumbers);
        System.out.println(oddNumbers);

        HashSet<String> days = new HashSet<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");

        HashSet<String> daysOff = new HashSet<>();
        daysOff.add("Monday");
        daysOff.add("Thursday");
        
        // 3. Difference: .removeAll()
        days.removeAll(daysOff);
        System.out.println(days);


        HashSet<String> people = new HashSet<>();
        people.add("James");
        people.add("Kim");
        people.add("Adam");
        people.add("Zion");
        people.add("Lucas");

        HashSet<String> students = new HashSet<>();
        students.add("Kim");
        students.add("Zion");

        // 4. Subset
        boolean result = people.containsAll(students);
        System.out.println("Students is a subset of People: " + result);
    }
    
}
