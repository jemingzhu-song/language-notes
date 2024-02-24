import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Revision {
    public static void main(String[] args) {
        System.out.println("HEllo WOrld");
        String test1 = "CONST-2501";

        boolean retrieved1 = test1.matches("CONST-\\d+");
        System.out.println(retrieved1);

        // TreeMap<Integer, String> people = new TreeMap<>();

        // people.put(2, "Adam");
        // people.put(5, "Brian");
        // people.put(3, "Zion");
        // people.put(4, "Xavier");
        // people.put(1, "Danny");
        // people.put(6, "Charles");
        // people.put(7, "Nathan");

        // System.out.println(people);

        // // Get Entries
        // Set<Entry<Integer, String>> entries = people.entrySet();
        // // Put into List
        // ArrayList<Entry<Integer, String>> listEntries = new ArrayList();
        // listEntries.addAll(entries);
        // // Sort List
        // listEntries.sort((Entry<Integer, String> o1, Entry<Integer, String> o2) -> {
        //     return o1.getValue().compareTo(o2.getValue()) * -1;
        // });
        // // Put into LinkedHashMap
        // LinkedHashMap<Integer, String> sorted = new LinkedHashMap<>();
        // for (Entry<Integer, String> e : listEntries) {
        //     sorted.put(e.getKey(), e.getValue());
        // }
        // System.out.println(sorted);

        // System.out.println(Person.defaultName);
        // System.out.println(Person.template());

        // Person p1 = new Person("William", "Chan");
        // System.out.println(p1.defaultName);

    }
}

class Person {
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static String defaultName = "John Doe";
    

    public static String template() {
        return "Firstname Lastname";
    }

}