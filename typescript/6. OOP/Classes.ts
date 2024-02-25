/*
    https://www.typescriptlang.org/docs/handbook/2/classes.html
*/

/*
    The most basic class is an empty one
*/
class Dog {}

/*
    A field declaration creates a public writeable property on a class
*/
class Point {
  x: number;
  y: number;
}

const point = new Point();
point.x = 0;
point.y = 0;

/*
    Classes
*/
class Person {
  /*
    Getters/Setters  
      Similar to Kotlin, you can automatically get/set fields of a class using the "." operator, e.g.
        let p1 = new Person("Will", "Chen")  
        console.log(p1.firstName)
        p1.firstName = "Michael"
  */
  firstName: string;
  lastName: string;
  age?: number;
  /*
    readonly field
      You can also make fields "readonly" so that they can't be re-assigned outside of the constructor
      This is equivalent to making the setter of a field "private" in Kotlin/Java
  */
  readonly yob?: string;

  /*
    Constructors
      Similar to Kotlin, you can only have one implementation of a constructor in each class. However,
      you can use the "?" operator to define "optional" fields
  */
  constructor(firstName: string, lastName: string, age?: number, yob?: string) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.yob = yob;
  }

  /*
    Methods
      Methods in classes MUST NOT have the "function" keyword. You just start the method with the method
      name

      Note, there are no override "toString" or "equals" methods in Typescript/JS
  */
  fullName(): string {
    return this.firstName + ' ' + this.lastName;
  }

  toString(): string {
    return this.firstName + ' | ' + this.lastName + ' | ' + this.age + ' | ' + this.yob;
  }
}

let person1 = new Person('Michael', 'Adams', 23, '23/02/2000');
let person2 = new Person('Jennifer', 'Wang', 25);
let person3 = new Person('William', 'Kim');

/*
    Member Visibility: https://www.typescriptlang.org/docs/handbook/2/classes.html#member-visibility

    Typescript also have visibility modifiers that you can apply to fields/properties and methods in classes:
      - public: can be accessed anywhere
      - protected: only visible to subclasses of the class they're delcared in
      - private: only accessible within the class itself
*/
