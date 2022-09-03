/* Object */
/*
    JavaScript object is a non-primitive data-type that allows you to store multiple collections of data.
*/

/* Object Declaration */
/*
    Syntax to declare an Object:
        const object_name = {
            key1: value1,
            key2: value2
        }
    
    Here, an "object_name" is defined. Each member of an object is a key:value pair, separated by
    commas and enclosed in curly braces {}
*/
const student1 = {
  firstName: 'James',
  lastName: 'Kim',
  age: 21,
  degree: 'Computer Science',
};

/* 1. Accessing Object Properties */
/*
    To access the value of a property, you use its key. You can access an object's key in two ways:
        1. Dot Notation: 
            objectName.key
        2. Bracket Notation:
            objectName["propertyName"]
*/
// 1. Dot Notation
let student1_first_name = student1.firstName;
console.log(student1_first_name);

// 2. Bracket Notation
let student1_degree = student1['degree'];
console.log(student1_degree);

/* 2. Adding Object Properties */
/* 
    To add a property to an object, use the dot notation or bracket notation, and declare it.
*/
const student2 = {};
// Add "firstName" property using DOT NOTATION
student2.firstName = 'Michael';
console.log(student2); // { firstName: 'Michael' }
student2.firstName = 'Michael'; // Adding it again even though it exists won't throw an error
// Add "lastName" property using BRACKET NOTATION
student2['lastName'] = 'Zhu'; // { firstName: 'Michael', lastName: 'Zhu' }
console.log(student2);

/* 3. Modifying Object Properties */
/* 
    To modify an object property, use the dot notation or bracket notation, and assign it the new value.
    If the property doesn't exist, then this new property will be created.
*/
const student3 = { firstName: 'Adam', lastName: 'Lin', age: 21, degree: 'Commerce' };
console.log('Before modification: ', student3);
// Modifying the "firstName" property
student3.firstName = 'Charles';
console.log('After modification: ', student3);

/* 4. Removing Object Properties */
/*
    To delete an object property, use the "delete" operator, then the objectName and key:
        delete objectName.key
            or
        delete objectName["key"]
    If the property doesn't exist, no error will be thrown
*/
const student4 = { firstName: 'Kenny', lastName: 'Pin', age: 23 };
console.log('Before deletion: ', student4);
// Removing "firstName" property
delete student4.firstName;
console.log('Deleting firstName property: ', student4);
// Removing "lastName" property
delete student4['lastName'];
console.log('Deleting lastName property: ', student4);

/* 5. Nested Objects */
/* 
    Objects can also contain another object
*/
const studentNested = {
  name: 'John',
  age: 20,
  marks: {
    science: 70,
    math: 75,
  },
};

// accessing property of student object
console.log(studentNested.marks); // {science: 70, math: 75}

// accessing property of marks object
console.log(studentNested.marks.science); // 70

/* -------------------- Object Methods/Constructors -------------------- */
/* 6. Object Functions */
/*
    Objects can also contain a function inside of it, which can be called.
    You can access an object function/method using the dot notation:
        objectName.methodKey()
*/
const person = {
  name: 'Sam',
  age: 30,
  // using function as a value
  greet: function () {
    let greeting = 'mister'; // You can also declare variables in these functions
    console.log('Hey there ' + greeting + '!');
  },
};
person.greet(); // hello

/* 7. Adding, Accessing, Modifying, Deleting Methods in Objects */
/*
    You can add a method in an object
*/
const student5 = { firstName: 'James', lastName: 'Chen' };
// i) Adding a Method
student5.greet = function () {
  console.log('Hello');
};
// ii) Accessing Method
student5.greet(); // Hello
// iii) Modifying Method
student5.greet = function () {
  console.log("What's Up!");
};
student5.greet(); // What's Up
// iv) Deleting Method
delete student5.greet;
// Calling the function again will throw an error
// student5.gree()

/* 8. "this" Keyword */
/*
    To access a property of an object from within a method of the SAME object, use the
    "this" keyword.
*/
const student6 = {
  firstName: 'John',
  lastName: 'Morgan',
  age: 30,

  // accessing name property by using this.name
  introduce: function () {
    console.log('Hey, my name is: ' + this.firstName + ' ' + this.lastName);
  },
};
student6.introduce(); // Hey, my name is John Morgan

/* 9. Constructor Function */
/*
    In JavaScript, a constructor function is used to create objects.
    A constructor function is the exact same as a normal function, however to create an object
    from a constructor function, we use the "new" keyword.

    It is standard practice to CAPITALISE the first letter of your constructor function
*/
// Constructor Function (basically the same as a normal function).
function Student(firstName, lastname, age) {
  this.firstName = firstName;
  this.lastName = lastname;
  this.age = age;
  this.toString = function () {
    return this.firstName + ' ' + this.lastName + ' ' + this.age;
  };
  // Getter and Setter
  this.getAge = function () {
    return this.age;
  };
  this.setAge = function (age) {
    this.age = age;
  };
}
// Creating Objects
const s1 = new Student('Johnny', 'Van', 23);
const s2 = new Student('Kimmy', 'Chan', 20);
console.log(s1.toString());
console.log(s2.toString());

/* 10. Getters and Setters */
/*
    In JavaScript, accessor properties are methods that can get or set the value of an object.
    JavaScript uses the 2 keywords:
        • get - to define a getter method to get the property value
        • set - to define a setter method to set the property value
    NOTE: this applies to Objects only (not Constructors Functions)
*/
const teacher = {
  firstName: 'Michael',
  lastName: 'Woo',
  get getFirstName() {
    return this.firstName;
  },
  set setFirstName(firstName) {
    this.firstName = firstName;
  },
};
