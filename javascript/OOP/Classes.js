/* Classes */
/*
    JavaScript classes do not require you to define the fields/values of the class beforehand, they
    can immediately be defined/initialised in the constructor.

    Syntax:
        Note: "export default" is needed beforehand to allow this class to be imported by other files

        export default class className {
            constructor (param1, param2, ... paramN) {
                this.param1 = param1;   // Define field and initialise
                this.param2 = param2;   // Define field and initialise
                this.param8;            // Define field but don't initialise
                this.paramN = paramN;
            }

            methodName(param1, ... paramN) {
                // method body
            }

            get getterName() {
                return this.fieldName;
            }

            set setterName(fieldName) {
                this.fieldName = fieldName;
            }
        }
*/

/* 1. Creating a Class */
class Person {
  /* 2. Constructor */
  constructor(firstName, lastName, age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  /* 3. Methods */
  description() {
    return this.firstName + ' ' + this.lastName + ' ' + this.age;
  }

  /* 4. Getters & Setters */
  get getFirstName() {
    return this.firstName;
  }

  set setFirstName(firstName) {
    this.firstName = firstName;
  }
}

// Testing the class
p1 = new Person('Michael', 'Chenny', 23);
console.log(p1.description());
console.log(p1.firstName);
console.log(p1.getFirstName);
