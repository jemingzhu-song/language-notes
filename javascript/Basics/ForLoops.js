/* "for" loop */
/*
    Syntax for the JavaScript "for" loop is:
    
        for (initialExpression; condition; updateExpression) {
            // for loop body
        }
    
    Here,
        1. The initialExpression initializes and/or declares variables and executes only once.
        2. The condition is evaluated.
        3. If the condition is false, the for loop is terminated.
        4. If the condition is true, the block of code inside of the for loop is executed.
        5. The updateExpression updates the value of initialExpression when the condition is true.
        6. The condition is evaluated again. This process continues until the condition is false.
*/

// looping from i = 1 to 5
for (let i = 0; i < 5; i++) {
  console.log(`I love JavaScript.`);
}

/* "for...of" loop */
/*
    Syntax for the JavaScript "for...of" loop:
        for (let element of iterable) {
            // body of for...of loop
        }
    
    Here,
        • iterable - an iterable object (array, set, strings, etc.)
        • element - items in the iterable

    Note: the "for...of" loop is similar to Java's forEach loop, i.e. for (element : iterable) loop
*/

/* for...of with Arrays */
const students = ['John', 'Sara', 'Jack'];

// using for...of
for (let element of students) {
  // display the values
  console.log(element);
}

/* for...of with Strings */
const string = 'code';

// using for...of loop
for (let i of string) {
  console.log(i);
}

/* for...of with Maps */
let map = new Map();

// inserting elements
map.set('name', 'Jack');
map.set('age', '27');

// looping through Map
for (let [key, value] of map) {
  console.log(key + '- ' + value);
}

/* for...of with Sets */
const set = new Set([1, 2, 3]);

// looping through Set
for (let i of set) {
  console.log(i);
}

/* "for...in" loop */
/*
    Syntax for the JavaScript "for...in" loop for OBJECTS is:

        for (key in object) {
            // body of for...in loop
        }
    
    Syntax for the JavaScript "for...in" loop for STRINGS and ARRAYS is:

        for (let index in element) {
            // body of for...in loop
        }
    
    Here,
        1. The for...in loop can be used to iterate over objects (key, object), strings, arrays
        2. The for...in loop for arrays/strings, the (index) represents the actual index in the
           data structure, not the actual element.
*/
// Looping through Object
const student = {
  name: 'Monica',
  class: 7,
  age: 12,
};
for (let key in student) {
  console.log(`${key} => ${student[key]}`); // display the properties
}

// Looping through Array
const names = ['James', 'Kim', 'Adam', 'Charles'];
for (let i in names) {
  console.log(names[i]);
}

// Looping through String
const sentence = 'A brown fox';
for (let i in sentence) {
  console.log(sentence[i]);
}
