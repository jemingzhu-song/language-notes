package Strings;

import java.util.ArrayList;

// Full Tutorial: https://www.programiz.com/java-programming/library/string
public class Strings {
    public static void main (String[] args) {
        /*
            1. Find the length of a string by using: 
                .length()
        */
        String greetings = "Hello World";
        int length = greetings.length();
        System.out.println("The length of: " + greetings + " is: " + length);
        /*
            2. Convert/Cast a number
                Integer.toString(value)
                    - "value": the number to convert to a string
                Double.toString(value)
                    - "value": the number to convert to a string
                Float.toString(value)
                    - "value": the number to convert to a string
                
                Convert/Cast an object
                object.toString()
                    - "object": the class name of an object
        */
        int num = 10000;
        String numberString = Integer.toString(num);
        System.out.println("Cast integer: " + num + " to a string: " + numberString);
        /*
            3. Convert all characters to upper and lower cases using:
                .toUpperCase()
                .toLowerCase()
        */
        String sentence = "The lazy dog jumped over the brown fox";
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
        /*
            4. Find a Character in a String using: 
                    .indexOf() - which returns the index of the FIRST OCCURRENCE of a specified text
                    in a string (including whitespace)
        */
        String text = "Please locate where 'locate' occurs!";
        int occurs = text.indexOf("locate");
        int eOccurs = text.indexOf("e");
        System.out.println("'locate' occurs at index: " + occurs + ", and 'e' occurs at index: " + eOccurs);
        /*
            5. Split a string into a list of strings using: 
                .split(separator, maxsplit (optional)) - divides the string base on the "separator" into
                an array of substrings
                    - "separator": the string or character to split on
                    - "maxsplit": the maximum length of the array of substrings
        */
        String[] result = text.split(" ");
        System.out.print("[");
        for (String s : result) {
            System.out.print(s + ", ");
        }
        System.out.println("]");
        /*
            6. Join two or more strings based on an expression:
                String.join(delimiter, elements)
                    - "delimiter": the delimiter to be joined with the elements
                    - "elements": the elements to be joined. It can be more than one input. You can pass
                                  any iterable that implements "CharSequence", (e.g. ArrayList<String>)
                                  into it
        */
        // Normal
        String joined = String.join("-", "Java", "is", "fun");
        System.out.println(joined);
        // ArrayList Case
        ArrayList<String> joinedArrayList = new ArrayList<>();
        joinedArrayList.add("Joining");
        joinedArrayList.add("a");
        joinedArrayList.add("list");
        joinedArrayList.add("of");
        joinedArrayList.add("strings");
        String joinedList = String.join("...", joinedArrayList);
        System.out.println(joinedList);
        /*
            7. Check whether a string contains another string or character by using:
                .contains(expression)
                    - expression: a string or a character
        */
        String random = "This Java String contains dog a bunch cats of random pumpkin words";
        System.out.println(random.contains("dog"));                 // true
        System.out.println(random.contains("random pumpkin"));      // true
        System.out.println(random.contains("random expression"));   // false
        /*
            8. Compare two strings using:
                .equals()
        */
        String compare1 = "Elephant";
        String compare2 = "Elephant";
        String compare3 = "elephant";
        System.out.println(compare1.equals(compare2));
        System.out.println(compare1.equals(compare3));
    }
}
