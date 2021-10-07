/* ---------- JavaScript Const ---------- */
// Variables defined with const cannot be Redeclared.
// Variables defined with const cannot be Reassigned.
// Variables defined with const have Block Scope.

/* ---------- Cannot be Reassigned ---------- */
// A const variable cannot be reassigned:
const PI = 3.141592653589793;
PI = 3.14; // This will give an error
PI = PI + 10; // This will also give an error

/* ---------- Must be Assigned ---------- */
// JavaScript const variables msut be assigned a value when they are declared
const MULTIPLIER = 5;
// i.e. this will fail:
// const DIVIDER;
// DIVIDER = 2;

/* ---------- Constant Objects and Arrays ---------- */
// The keyword const is a little misleading.
// It does not define a constant value. It defines a constant reference to a value.
// Because of this you can NOT:
// • Reassign a constant value
// • Reassign a constant array
// • Reassign a constant object
// But you CAN:
// • Change the elements of constant array
// • Change the properties of constant object

/* ---------- Constant Arrays ---------- */
// You can change the elements of a constant array:
// You can create a constant array:
const cars = ['Saab', 'Volvo', 'BMW'];

// You can change an element:
cars[0] = 'Toyota';

// You can add an element:
cars.push('Audi');

// But you can NOT reassign the array:
const cars = ['Saab', 'Volvo', 'BMW'];
cars = ['Toyota', 'Volvo', 'Audi']; // ERROR

/* ---------- Constant Objects ---------- */
// You can create a const object:
const car = { type: 'Fiat', model: '500', color: 'white' };

// You can change a property:
car.color = 'red';

// You can add a property:
car.owner = 'Johnson';

// But you can NOT reassign the object:
const car = { type: 'Fiat', model: '500', color: 'white' };
car = { type: 'Volvo', model: 'EX60', color: 'red' }; // ERROR

/* ---------- Block Scope ---------- */
// Declaring a variable with const is similar to let when it comes to Block Scope.
// The x declared in the block, in this example, is not the same as the x declared outside the block:
const x = 10;
// Here x is 10
{
  const x = 2;
  // Here x is 2
}
// Here x is 10

/* ---------- Redeclaring ---------- */
// Redeclaring a JavaScript var variable is allowed anywhere in a program:
var x = 2; // Allowed
var x = 3; // Allowed
x = 4; // Allowed

// Redeclaring an existing var or let variable to const, in the same scope, is not allowed:
var x = 2; // Allowed
const x = 2; // Not allowed

{
  let x = 2; // Allowed
  const x = 2; // Not allowed
}

{
  const x = 2; // Allowed
  const x = 2; // Not allowed
}

// Reassigning an existing const variable, in the same scope, is not allowed:
const x = 2; // Allowed
x = 2; // Not allowed
var x = 2; // Not allowed
let x = 2; // Not allowed
const x = 2; // Not allowed

{
  const x = 2; // Allowed
  x = 2; // Not allowed
  var x = 2; // Not allowed
  let x = 2; // Not allowed
  const x = 2; // Not allowed
}

// Redeclaring a variable with const, in another scope, or in another block, is allowed:
const x = 2; // Allowed
{
  const x = 3; // Allowed
}
{
  const x = 4; // Allowed
}

/* ---------- Const Hoisting ---------- */
// Variables defined with var are hoisted to the top and can be initialized at any time.
// Meaning: You can use the variable before it is declared:
carName = 'Volvo';
var carName;

// Variables defined with const are also hoisted to the top, but not initialized.
// Meaning: Using a const variable before it is declared will result in a ReferenceError:
alert(carName);
const carName = 'Volvo'; // ReferenceError
