package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingLambdaFunction {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Michael", "Adam", "Kenny", "Brian", "Zion", "Xavier", "Nathan"));

        System.out.println(names);

        names.sort((String o1, String o2) -> {
            return o1.compareTo(o2) * -1;
        });

        System.out.println(names);
    }
}
