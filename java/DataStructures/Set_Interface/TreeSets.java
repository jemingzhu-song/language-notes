package DataStructures.Set_Interface;
/*
    Notes
    TreeSet uses a Tree (red-black) for storage, and the ordering is maintained by the natural ordering
    whether a comparator is provided.
*/

import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        /* -------------------- Ordered Operations -------------------- */
        TreeSet<String> names = new TreeSet<>((String o1, String o2) -> o1.compareTo(o2) * -1);
        names.add("Brian");
        names.add("Lisa");
        names.add("William");
        names.add("Adam");
        names.add("Victor");

        // Returns first element that is "higher" than given element. In this case, returns first String that is alphabetically BEFORE this element (since we insert in reverse-alphabetical order)
        System.out.println(names.higher("Brian"));
        System.out.println(names.higher("Brx"));

        // Returns first element that is "lower" than given element. In this case, returns first String that is alphabetically AFTER this element (since we insert in reverse-alphabetical order)
        System.out.println(names.lower("Brian"));
    }

}
