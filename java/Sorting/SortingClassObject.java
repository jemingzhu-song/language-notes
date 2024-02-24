package Sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortingClassObject {
    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();

        // 1. Add to LinkedList
        people.add(new Person("Brian", 18));
        people.add(new Person("James", 23));
        people.add(new Person("Hosha", 24));
        people.add(new Person("Brian", 25));
        people.add(new Person("Frank", 21));
        people.add(new Person("Yasmin", 19));
        people.add(new Person("James", 20));
        System.out.println("Before Sorting");
        System.out.println(people);

        // Sort alphabetically by name. If two names are equal, sort them by descending order of age.
        Collections.sort(people, new Order());
        System.out.println("Sort alphabetically by name. If two names are equal, sort them by descending order of age.");
        System.out.println(people);
    }    
}

class Order implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getName() == o2.getName()) {
            if (o1.getAge() == o2.getAge()) {
                return 0;
            } else if (o1.getAge() > o2.getAge()) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return o1.getName().compareTo(o2.getName());
        }
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