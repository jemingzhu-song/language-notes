package OOP;

/*
    Notes:
    1. A constructor is similar to a method that is invoked when an object of the class is created,
    however it has the SAME NAME as the class and DOES NOT HAVE A RETURN TYPE. Syntax of it is:
        class Test {
            Test() {
                // constructor body
            }
        }
    2. When the object is created, the object's constructor method is called, and any variables
    are initialised. 
    3. Constructors can also be overloaded - creating two or more constructors with the same name
    but different parameters.
*/
public class Constructors {

}

/* 
There are 3 types of constructors:
        1) No-Arg Constructor
        2) Parameterized Constructor
        3) Default Constructor
*/

/* 1. No-Arg Constructor */
class Country {
    int population;

    public Country() {
        this.population = 5000000;
    }

    public static void main(String[] args) {
        Country country = new Country();
        System.out.println("Default Country Population: " + country.population);
    }
}

/* 2. Parameterized Constructor */
// Private Parameterized Constructor: once a constructor is private, it cannot be accessed from
// outside the class - so creating objects from OUTSIDE THE CLASS is prohibited using the
// private constructor. We can only create the object inside the same class
class PrivateCompany {
    String name;

    private PrivateCompany(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        PrivateCompany company = new PrivateCompany("Atlassian");
        System.out.println("Private Company: " + company.name);
    }

}

// Public Parameterized Constructor: objects can be created outside the class
class PublicCompany {
    String name;
    double sharePrice;

    PublicCompany(String name, double sharePrice) {
        this.name = name;
        this.sharePrice = sharePrice;
    }

    public static void main(String[] args) {
        PublicCompany company = new PublicCompany("Google", 504.23);
        System.out.println("Public Company: " + company.name + " share price: " + company.sharePrice);
    }
}

/* 3. Default Constructor */
// If we do not create any constructor, the Java compiler automatically create a no-arg constructor 
// during the execution of the program. This constructor is called default constructor.
class Person {

    int lifeSpan;
    boolean alive;
  
    public static void main(String[] args) {
  
      // A default constructor is called
      Person person = new Person();
  
      /*
        Here, we haven't created any constructors. Hence, the Java compiler 
        automatically creates the default constructor.
        The default constructor initializes any uninitialized instance variables 
        with default values:
        Type	        Default Value
        boolean	        false
        byte	        0
        short	        0
        int	            0       
        long	        0L
        char	        \u0000
        float	        0.0f
        double	        0.0d
        object	        Reference null
      */
      System.out.println("Default Value:");
      System.out.println("a = " + person.lifeSpan);
      System.out.println("b = " + person.alive);
    }
}

/* Constructor Overloading */
class Main {
    String language;
    // constructor with no parameter
    Main() {
      this.language = "Default Language";
    }
    // constructor with a single parameter
    Main(String language) {
      this.language = language;
    }
    public void getName() {
      System.out.println("Programming Langauage: " + this.language);
    }
  
    public static void main(String[] args) {
  
      // call constructor with no parameter
      Main obj1 = new Main();
      // call constructor with a single parameter
      Main obj2 = new Main("Python");
  
      obj1.getName();
      obj2.getName();
    }
}