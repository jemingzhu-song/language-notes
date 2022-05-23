package Basics;

public class Variables {
    public static void main(String [] args) {
        /*
            1. To create a variable, you must specify the type and assign it a value:
                [type] variableName = value;
            For example, create a variable name of type String and assign it the value: "Jeming"
        */
        String name = "Jeming";
        System.out.println(name);
        /*
            2. To create a variable that stores an integer:
        */
        int number01 = 5;
        Integer number02 = 10;
        System.out.println(number01);
        System.out.println(number02);
        System.out.println("Sum of: " + number01 + " and " + number02 + " is: " + (number01 + number02));
        /*
            3. You can also declare a variable without assigning the value, and assign the value later:
        */
        int number;
        number = 20;
        System.out.println(number);
        /*
            4. You can also assign a new value to an existing variable, overwriting the previous value:
        */
        int numberAgain = 3;
        numberAgain = 999;
        System.out.println(numberAgain);
        /*
            5. If you don't want a variable to be overwrited again, use the "final" keyword,
            which will make the variable unchangeable and read-only
        */
        final int finalNumber = 33;
        System.out.println("Final Number: " + finalNumber);
        /*
            6. Other Variable Types:
        */
        // Numeric Types
        short shortType = 2;        // Size of 2 Bytes
        int integerType = 4;        // Size of 4 Bytes
        long longType = 8;          // Size of 8 Bytes
        float floatType = 3.00f;    // Size of 4 Bytes - Stores fractional numbers. Value should end with an "f" for floats and "d" for doubles

        double doubleType = 8.9231; // Size of 8 Bytes - Stores fractional numbers    
        // Characters/String Types
        char charType = 'C';        // Must be in single quotes ''
        String stringType = "String";
        // Boolean Type
        boolean booleanType = true;
        /*
            7. Declaring many variables in ONE LINE
        */
        int x = 5; int y = 10; int z = 15;
        System.out.println(x + y + z);
        /*
            8. Type Casting. There are two ways of type casting:
                i) Widening Casting (automatically) - converting a smaller type to a larger type size
                    byte -> short -> char -> int -> long -> float -> double
                ii) Narrowing Casting (manually) - converting a larger type to a smaller size type
                    double -> float -> long -> int -> char -> short -> byte
        */
        // Widening Casting - done automatically when passing a smaller size type to a larger size type
        int cast01 = 9;
        double double01 = cast01;
        System.out.println(cast01);
        System.out.println(double01);
        // Narrowing Casting - done manully by placing the type in parentheses in front of the value:
        int cast02 = 99;
        double double02 = (double) cast02;
        System.out.println(cast02);
        System.out.println(double02);
    }
}
