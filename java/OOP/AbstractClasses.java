package OOP;
/*
    Notes
    1.  Abstract Classes cannot be instantiated (you cannot create objuects of abstract classes).
    2.  Abstract Classes are declared using the "abstract" keyword:

        abstract class Language {
            // abstract class constructor
            public Language() {
                ...
            }

            // abstract method
            abstract void method1();

            // regular method
            public String findDetails() {
                return "Details Finding...";
            }
        }
        Abstract Classes can have a constructor.
        Abstract Classes can have both regular and abstract methods.
    3.  Abstract Methods - a method that doesn't have a body
    4.  We use Abstract Classes to create subclasses from it, and this allows us to access members
        of the abstract class using the object of the subclass
            - Subclasses of the Abstract Class can access the Abstract Class's (regular) methods
            - Any Abstract Methods must be implemented by the subclass of the Abstract Class
    5.  A Class can only extend ONE Abstract Class
*/

public class AbstractClasses {
    
}

abstract class Language {
    private String code;
    // Constructor
    public Language(String code) {
        this.code = code;
    }
    // Abstract Method of Abstract Class - MUST BE IMPLEMENTED by Subclasses
    abstract void homeLanguage();
    // Regular Method of Abstract Class
    public void displayDefault() {
      System.out.println("This is Java Programming");
    }
  }
  
class English extends Language {

    // Constructor to "implement" Abstract Class's Constructor
    public English(String code) {
        super(code);
    }

    // Implement the Abstract Class's Abstract Method: homeLanguage()
    @Override
    void homeLanguage() {
        System.out.println("This is the ENGLISH language");
    }

    public static void main(String[] args) {
        // Create a subclass of the Abstract Class
        English obj = new English("EN");
        // Access the Abstract Class ("Language") method: "displayDefault()"
        obj.displayDefault();
    }
}

/* Importance of Abstraction */
/* 
The major use of abstract classes and methods is to achieve abstraction in Java.

Abstraction is an important concept of object-oriented programming that allows us to 
hide unnecessary details and only show the needed information.

This allows us to manage complexity by omitting or hiding details with a simpler, 
higher-level idea.

A practical example of abstraction can be motorbike brakes. We know what brake does. 
When we apply the brake, the motorbike will stop. However, the working of the brake is 
kept hidden from us.

The major advantage of hiding the working of the brake is that now the manufacturer 
can IMPLEMENT brake() DIFFERENTLY for DIFFERENT motorbikes, however, what brake does 
will be the same.

------------------------------------------------------------------------------------------

In the below example, we have created an abstract super class MotorBike. 
The superclass MotorBike has an abstract method brake().

The brake() method cannot be implemented inside MotorBike. It is because every 
bike has different implementation of brakes. So, all the subclasses of MotorBike would 
have different implementation of brake().

So, the implementation of brake() in MotorBike is kept hidden.

Here, MountainBike makes its own implementation of brake() and SportsBike makes its 
own implementation of brake().
*/

abstract class MotorBike {
    abstract void brake();
}
  
class SportsBike extends MotorBike {
    
    // implementation of abstract method
    public void brake() {
        System.out.println("SportsBike Brake");
    }
}
  
class MountainBike extends MotorBike {
    
    // implementation of abstract method
    public void brake() {
        System.out.println("MountainBike Brake");
    }
}
  
class DemoBikes {
    public static void main(String[] args) {
        MountainBike m1 = new MountainBike();
        m1.brake();
        SportsBike s1 = new SportsBike();
        s1.brake();
    }
}