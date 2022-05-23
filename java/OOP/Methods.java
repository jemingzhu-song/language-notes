package OOP;
/*
    Notes:
    1. Functions in Java are called "Methods" - it is a block of code that performs a specific task.
       The Syntax of a Method is:
            modifier (static) returnType methodName(param1, param2, ...) {
                // method body
            }

            - modifier: defines access types and whether the method is:
                i) public: the method is visible everywhere
                ii) private: the method is visible only within the class itself
                iii) protected: the method is visible within the package or all subclasses
                iv) default: the method is visible only within the package (package private)
            - static: OPTIONAL, if we use this keyword, it can be accessed WITHOUT CREATING OBJECTS
            e.g. the "sqrt()" method of the standard "Math" class is static. Hence, we can call
            Math.sqrt() without creating an instance of a Math class. If the static function is
            defined in the current class, then we can just call it without having to reference
            the class in the first place.
            - returnType: what type of value a method returns. If the method DOES NOT return
            a value, its return type is "void".
            e.g. If a method has an "int" return type, then it returns an integer value. 
            - methodName: the name of the method used to refer to it
            - param1, param2: values passed to a method. Parameters are "pass-by-value", meaning
            any parameters passed into a method are a "copy" of the method. They won't overwrite
            the variable outside the method.
*/

public class Methods {
    // Not a "static" method. Meaning we must create an instance of the "Methods" class first
    // before we can access and use this method by calling: obj.addNumbers() where "obj" is an
    // instance of the "Methods" class
    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // "static" method. Meaning we don't need to create an instance of the "Methods" class first.
    // We can just access and use this method directly by calling either:
    //      i) Methods.multiply()
    //      ii) multiply() - we can do this because we are in the current class of "Methods". So we
    //                       can directly reference it like this. If in another class, and calling
    //                       this function, then we will need to use: Methods.multiply()
    public static int multiply(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 30;
        // Create an object of "Methods" - use the addNumbers() function
        Methods obj = new Methods();
        int sum = obj.addNumbers(num1, num2);
        System.out.println("Sum is: " + sum);
        // No need to create an object of "Methods" - use the add() function
        int mul = Methods.multiply(num1, num2);
        int again = multiply(num1, num2);
        System.out.println("Multiplication is: " + mul);
        System.out.println("Multiplication (again) is: " + again);
    }
}
