import javax.sound.midi.SysexMessage;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

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
        Map<Integer, String> names = Map.of(
            1, "Adam",
            2, "Kenny",
            3, "Brian",
            4, "William",
            5, "Zion",
            6, "Ethan",
            7, "Xavier"
        );

        Map<String, Integer> reversed = names.entrySet()
            .stream()
            .filter(e -> e.getValue().contains("e"))
            .collect(Collectors.toMap(
                e -> e.getValue() + "!",
                e -> e.getKey() + 1
            ));

        System.out.println(reversed);
    }
}