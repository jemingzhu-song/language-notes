package DataStructures.Map_Interface;

import java.util.*;

public class Initialise {
    List<String> list = List.of("Adam", "Victor", "Brian", "William");

    List<String> arrayList = new ArrayList(List.of("Victor", "Brian", "Adam"));

    Map<Integer, String> map = Map.of(
        1, "Adam",
        2, "Victor",
        3, "Nathan",
        4, "William"
    );

    Map<Integer, String> hashmap = new HashMap(Map.of(
        1, "Adam",
        2, "Victor",
        3, "Nathan",
        4, "William",
        5, "Zion",
        6, "Daniel",
        7, "Brian",
        8, "Charlie",
        9, "Xavier"
    ));

    Set<String> set = Set.of("William", "Brian", "Adam");

    HashSet<String> hashset = new HashSet<>(Set.of("William", "Brian", "Adam"));
}
