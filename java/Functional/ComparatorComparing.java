package Functional;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorComparing {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Jenny", 23));
        people.add(new Person("Adam", 21));
        people.add(new Person("Zion", 19));
        people.add(new Person("Xavier", 24));
        people.add(new Person("Michael", 28));
        people.add(new Person("Zion", 2));
        people.add(new Person("Charles", 5));
        people.add(new Person("Zion", 34));
    
        // Sorting with "Function" defined inside the .sort() parametre
        // people.sort((Person p1, Person p2) -> {
        //     if (p1.getName().equals(p2.getName())) {
        //         if (p1.getAge() > p2.getAge()) {
        //             return 1;
        //         } else {
        //             return -1;
        //         }
        //     } else {
        //         return p1.getName().compareTo(p2.getName());
        //     }
        // });

        System.out.println(people);
        // Sort names by alphabetical order, then by age (ascending)
        people.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        System.out.println(people);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}