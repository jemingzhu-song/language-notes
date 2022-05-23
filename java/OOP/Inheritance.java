package OOP;

/*
    Notes
    1.  Inheritance allows us to create a new class from an existing class - the new class is known
        as the "subclass" or "child class", and the existing class is known as the "superclass" or
        "parent class".
    2.  Use the "extends" keyword to denote a "subclass" (i.e. perform inheritance in Java), e.g.
        class Animal {
            // fields & methods
        }

        // Dog is a "subclass" of "Animal"
        class Dog extends Animal {

        }
    3.  Method Overriding (@Override) when the same method (same method name)
        is present in both the subclass and superclass. The method in the subclass "overrides" the
        method in the superclass
    4.  Super Keyword (super.) allows us to call the method of the PARENT class from the CHILD class
        i.e. allows you to call a method of the superclass from the subclass.
    
*/
public class Inheritance {
    
}

class Person_Inheritance {
    private String firstName;
    private String lastName;
    private int age;

    // Example of Method Overloading - 2 Arguments Only
    public Person_Inheritance(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
    }
    // Example of Method Overloading - 3 Arguments
    public Person_Inheritance(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.age;
    }
}

class Student_Inheritance extends Person_Inheritance {
    // Since "Student" is a subclass of "Person", an instance of this object will
    // "automatically" contain the fields/values of the superclass: "Person"
    private String degree;

    public Student_Inheritance(String firstName, String lastName, String degree) {
        // Use of the "super" keyword to call the constructor in the superclass ("Person" class)
        super(firstName, lastName);
        this.degree = degree;
    }

    public Student_Inheritance(String firstName, String lastName, int age, String degree) {
        super(firstName, lastName, age);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int estimateFinishAge() {
        // Use of the "super" keyword to call the "getAge()" method in the superclass ("Person" class)
        return super.getAge() + 4;
    }

    // Method Overriding - to replace the "toString()" method in the superclass
    @Override
    public String toString() {
        return super.toString() + " " + this.degree;
    }
}
