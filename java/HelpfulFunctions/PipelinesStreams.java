package HelpfulFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PipelinesStreams {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Brian");
        names.add("Xavier");
        names.add("Zion");
        names.add("Charles");
        names.add("Adam");
        names.add("Penelope");
        names.add("Kevin");

        System.out.println(names);

        /* Using .stream(), .filter() and .forEach()
        Go through list of names, filter out the names that contain the
        letter "e", and then print those names out */
        names.stream()
        .filter(name -> name.contains("e"))
        .forEach(name -> System.out.println(name));

        /* Using .stream(), .filter() and .collect(Collectors.toList())
        Go through list of names, filter out the names that contain the
        letter "e", and store it in a new list called "filteredNames" */
        List<String> filteredNames = names.stream()
        .filter(name -> name.contains("e"))
        .collect(Collectors.toList());
        System.out.println(filteredNames);

        /* Using .stream(), .filter(), .map(), .collect(Collectors.toList()) 
        Go through list of names, filter out names that contain the letter "a",
        append "HELLO!" to each of those names, and store it in a new list
        called "editedFilteredNames"
        */
        List<String> editedFilteredNames = names.stream()
        .filter(name -> name.contains("a"))
        .map(name -> name = name + "HELLO!")
        .collect(Collectors.toList());
        System.out.println(editedFilteredNames);
    }
}
