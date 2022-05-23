package OOP;

/*
    Notes
    1.  The "instanceOf" operator is used to check whether an object is an instance of a particular
        class or not. The syntax is:
            objectName instanceof className;
    2. It can be used to check:
            i) Whether an object of a subclass is also an instance of the superclass
            ii) Whether an object of a class is also an instance of the interface implemented by the class
*/

public class InstanceOf {

    private static void checkInstanceOf(Object obj) {
        if (obj instanceof Animal) {
            System.out.println("Object is an instanceof an 'Animal'");
        } else if (obj instanceof Insect){
            System.out.println("Object is an instanceof an 'Insect'");
        }
    }

    public static void main(String[] args) {
        String name = "Hello World";
        // Check if "name" is an instance of a string
        System.out.println("'name' is an instanceof 'String': " + (name instanceof String));
        /* i) Check whether an object of a subclass is also an instance of the superclass */
        Dog d1 = new Dog();
        System.out.println(d1 instanceof Dog); // true
        System.out.println(d1 instanceof Animal); // true
        /* ii) Check whether an object of a class is also an instance of the interface implemented by the class */
        Ant a1 = new Ant();
        System.out.println(a1 instanceof Ant); // true
        System.out.println(a1 instanceof Insect); // true
        /* iii) Check using instanceOf */
        checkInstanceOf(d1); // Animal
        checkInstanceOf(a1); // Insect
    }
}

/* i) Check whether an object of a subclass is also an instance of the superclass */
// Superclass
class Animal {
    
}

// Subclass
class Dog extends Animal {

}

// Not Superclass
class Fish {

}

/* ii) Check whether an object of a class is also an instance of the interface implemented by the class */
interface Insect {

}

class Ant implements Insect {

}