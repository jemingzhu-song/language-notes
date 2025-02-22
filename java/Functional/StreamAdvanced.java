package HelpfulFunctions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsAdvanced {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap(Map.of(
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

        // Transform this Map
        Map<Integer, String> transformed = names.entrySet()
            .stream()
            .collect(Collectors.toMap(
                entry -> entry.getKey(),
                entry -> entry.getValue() + "!"
            ));

        System.out.println(transformed);
    }
}