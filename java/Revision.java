class Person {
    private String firstName;
    private String lastName;
    private int age;
    
    // Primary Constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Secondary Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}

class Student extends Person {
    private String degree;

    // Primary Constructor
    public Student(String firstName, String lastName, String degree) {
        super(firstName, lastName);
        this.degree = degree;
    }

    // Secondary Constructor
    public Student(String firstName, String lastName, int age, String degree) {
        super(firstName, lastName, age);
        this.degree = degree;
    }
}