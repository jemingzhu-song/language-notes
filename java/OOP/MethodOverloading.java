package OOP;
/*
    Notes:
    1. If two or more methods have the same name, but differ in parameters (either have a different
    number of parameters, different types of parameters, or both), these methods are called:
    "overloaded" methods and this feature is called "method overloading".
    2. Examples:
        void func() {...}
        void func(int a) {...}
        void func(double a) {...}
        void func(int a, int b) {...}
       The func() method is overloaded - they have the same name but different types and number of
       arguments.
*/

public class MethodOverloading {
    /* The different ways to perform method overloading are listed below: */
    
    // 1. Overloading by changing the number of parameters
    private static void display(int a) {
        System.out.println("Arguments: " + a);
    }

    private static void display(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    // 2. Overloading by changing the data types of parameters
    private static void show(int a) {
        System.out.println("Got integer data: " + a);
    }

    private static void show(String a) {
        System.out.println("Got string data: " + a);
    }


    public static void main(String[] args) {
        // 1. Overloading by changing number of parameters
        display(1);
        display(2,3);
        // 2. Overloading by changing the data types of parameters
        show(999);
        show("Hello world");
    }
}
