package Functional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransformingMaps {
    public static void main(String[] args) {
        Map<List<String>, Integer> values = Map.of(
            List.of("jira"), 5,
            List.of("confluence"), 10,
            List.of("bitbucket", "stash"), 2,
            List.of("github"), 20,
            List.of(), 2,
            List.of("zoom"), 5,
            List.of("figma"), 8,
            List.of("trello", "whiteboards"), 9,
            List.of("microsoft word", "microsoft powerpoint"), 52
        );

        // Go through the Map and "flatten" the "List" key, taking the first element of the List
        Map<String, Integer> result = values.entrySet()
            .stream()
            .filter(entry -> !entry.getKey().isEmpty())
            .collect(Collectors.toMap(
                entry -> entry.getKey().get(0),
                Map.Entry::getValue
            ));

        System.out.println(result);
    }
}
