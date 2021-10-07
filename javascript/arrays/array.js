/* ---------- JavaScript Arrays ---------- */
// JavaScript arrays are used to store multiple values in a single variable.
// It is a common practice to declare arrays with the const keyword.
const cars = ['Saab', 'Volvo', 'BMW'];

/* ---------- Creating an Array ---------- */
// Using an array literal is the easiest way to create a JavaScript Array.
// Syntax for Creating an Array:
const array_name = [item1, item2, item3, item4];
// Spaces and line breaks are not important. A declaration can span multiple lines
// You can also create an array, and then provide the elements:
const cars = [];
cars[0] = 'Saab';
cars[1] = 'Volvo';
cars[2] = 'BMW';

/* ---------- Using the JavaScript Keyword "new" ---------- */
// The following example also creates an Array, and assigns values to it:
const cars = new Array('Saab', 'Volvo', 'BMW');
// The two examples above do exactly the same.
// There is no need to use new Array().
// For simplicity, readability and execution speed, use the first one (the array literal method).

/* ---------- Accessing Array Elements ---------- */
// You access an array element by referring to the index number:
const cars = ['Saab', 'Volvo', 'BMW'];
let x = cars[0]; // x = "Saab"

/* ---------- Chaning an Array Element ---------- */
// This statement changes the value of the first element in cars:
cars[0] = 'Opel';
// Example:
const cars = ['Saab', 'Volvo', 'BMW'];
cars[0] = 'Opel';

/* ---------- Accessing the Full Array ---------- */
// With JavaScript, the full array can be accessed by referring to the array name:
const cars = ['Saab', 'Volvo', 'BMW'];
document.getElementById('demo').innerHTML = cars;
var accessing_the_array = cars;

/* ---------- Arrays are Objects ---------- */
// Arrays are a special type of objects. The typeof operator in JavaScript returns "object" for arrays.
// But, JavaScript arrays are best described as arrays.
// Arrays use numbers to access its "elements". In this example, person[0] returns John:
const person = ['John', 'Doe', 46];
// Objects use names to access its "members". In this example, person.firstName returns John:
const person = { firstName: 'John', lastName: 'Doe', age: 46 };

/* ---------- Arrays Elements Can Be Objects ---------- */
// JavaScript variables can be objects. Arrays are special kinds of objects.
// Because of this, you can have variables of different types in the same Array.
// You can have objects in an Array. You can have functions in an Array. You can have arrays in an Array:
myArray[0] = Date.now;
myArray[1] = myFunction;
myArray[2] = myCars;

/* ---------- Array Properties and Methods ---------- */
// The real strength of JavaScript arrays are the built-in array properties and methods:
cars.length; // Returns the number of elements
cars.sort(); // Sorts the array

/* ---------- The length Property ---------- */
// The length property of an array returns the length of an array (the number of array elements).
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
fruits.length; // Returns 4

/* ---------- Accessing the First Array Element ---------- */
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
fruits[0]; // Returns "Banana"

/* ---------- Accessing the Last Array Element ---------- */
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
fruits[fruits.length - 1]; // Returns "Mango"

/* ---------- Looping Array Elements ---------- */
// The safest way to loop through an array, is using a for loop:
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
let fLen = fruits.length;

text = '<ul>';
for (let i = 0; i < fLen; i++) {
  text += '<li>' + fruits[i] + '</li>';
}
text += '</ul>';
// You can also use the Array.forEach() function:
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];

let text = '<ul>';
fruits.forEach(myFunction);
text += '</ul>';

function myFunction(value) {
  text += '<li>' + value + '</li>';
}

/* ---------- Adding Array Elements ---------- */
// The easiest way to add a new element to an array is using the push() method:
const fruits = ['Banana', 'Orange', 'Apple'];
fruits.push('Lemon'); // Adds a new element (Lemon) to fruits

// New elements can also be added to an array using the length property:
const fruits = ['Banana', 'Orange', 'Apple'];
fruits[fruits.length] = 'Lemon'; // Adds "Lemon" to fruits

/* ---------- Associative Arrays ---------- */
// Many programming languages support arrays with named indexes.
// Arrays with named indexes are called associative arrays (or hashes).
// JavaScript does not support arrays with named indexes.
// In JavaScript, arrays always use numbered indexes.
const person = [];
person[0] = 'John';
person[1] = 'Doe';
person[2] = 46;
person.length; // Will return 3
person[0]; // Will return "John"

const person = [];
person['firstName'] = 'John';
person['lastName'] = 'Doe';
person['age'] = 46;
person.length; // Will return 0
person[0]; // Will return undefined

/* ---------- The Difference Between Arrays and Objects ---------- */
// In JavaScript, arrays use numbered indexes.
// In JavaScript, objects use named indexes.
// JavaScript does not support associative arrays.
// You should use objects when you want the element names to be strings (text).
// You should use arrays when you want the element names to be numbers.

/* ---------- JavaScript new Array() ---------- */
