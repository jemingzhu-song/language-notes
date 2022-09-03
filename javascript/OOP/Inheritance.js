/* Inheritance */
/*
    For a class to inherit another class, JavaScript also uses the "extends" keyword
    
    Syntax for inheriting classes:
        class parentClassName {

        }

        class childClassName extends parentClassName {
            
        }
    
    Using class inheritance, a class can inherit all the methods and properties of another class.
    The child class can gain access to the parent class also via the "super" keyword.
    Similarly, the child class can "Override" methods of the parent class by just defining a method with
    the exact same name as the parent class. There is no need to use an "Override" keyword, overriding is
    assumed automatically.
*/

/* 1. Inheritance */
class Person {
  constructor(firstName, lastName, age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  get getFirstName() {
    return this.firstName;
  }

  set setFirstName(firstName) {
    this.firstName = firstName;
  }

  get getLastName() {
    return this.lastName;
  }

  set setLastName(lastName) {
    this.lastName = lastName;
  }

  get getAge() {
    return this.age;
  }

  set setAge(age) {
    this.age = age;
  }

  description() {
    return this.firstName + ' ' + this.lastName + ' ' + this.age;
  }
}

class Student extends Person {
  constructor(firstName, lastName, age, degree) {
    /* 2. "super" keyword */
    super(firstName, lastName, age);
    this.degree = degree;
  }

  get getDegree() {
    return this.degree;
  }

  set setDegree(degree) {
    this.degree = degree;
  }

  /* 3. Method Overriding */
  description() {
    /* 2. "super" keyword */
    return super.description() + ' ' + this.degree;
  }
}

// Testing the classes and inheritance
p1 = new Person('John', 'Kim', 23);
console.log(p1.description());

s1 = new Student('Penelope', 'Brizaa', 20, 'Commerce');
console.log(s1.description());
console.log(s1.getFirstName);
