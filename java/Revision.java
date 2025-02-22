import javax.sound.midi.SysexMessage;
import java.util.*;

/**
 * ========== BASICS  ==========
 * 1. Variables
 * 2. Functions
 * 3. Loops
 * 4. Switch
 * 5. String Functions
 *
 * ========== DATA STRUCTURES ==========
 * 1. ArrayList
 *      - Sorting
 * 2. Stack
 * 3. Queue (LinkedList)
 * 4. PriorityQueue
 * 4. HashMap
 * 5. Initialising Maps
 * 6. TreeMap
 *      - Sorting By Key & Sorting By value
 * 7. HashSet
 * 8. TreeSet
 *
 * ========== STREAMS ==========
 * 1. collect(Collectors.toMap())
 */

public class Revision {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // 1. Add
        set.add("Banana");
        set.add("Apple");
        set.add("Grapes");
        set.add("Watermelon");

        // 2. Contains
        System.out.println(set.contains("Banana"));

        // 3. Remove
        set.remove("Banana");
        set.remove("hwahahah");
        System.out.println(set);
    }
}