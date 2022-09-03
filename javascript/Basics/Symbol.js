/* Symbols */
/*
    JavaScript Symbols are immutable (cannot be changed) and are unique.
    They contain a "description", which is their value
*/

/* Creating Symbols */
/*
    The "Symbol()" function is used to create a Symbol
*/
const value1 = Symbol('Welcome');
const value2 = Symbol('Welcome');

/* Accessing Symbol Description */
/*
    To access the description (the value) of the symbol, use the "." operator
*/
console.log(value1.description); // Welcome

/* Adding Symbol as an Object Key */
/* 
    You can add symbols as a key in an object using square brackets [].
*/
let id = Symbol('identifier');
let person = {
  name: 'John Marston',
  age: 23,
  [id]: 123,
};
console.log(person); // { name: 'John Marston', Symbol(identifier): 123 }

/* Symbols are not included in for...in Loops */
/*
    The for...in loop does not iterate over Symbolic properties
*/
for (let key in person) {
  console.log(key);
}
// Output would just be:
// name
// age
