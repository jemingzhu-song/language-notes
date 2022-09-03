/* JavaScript Function */
/*
    Syntax for JavaScript Function:
        function nameOfFunction () {
            // function body   
        }
    
    • A function is declared using the "function" keyword.
    • There is no return type declaration in the function
*/

// Declaring a Function
function greet() {
  console.log('Hello there');
}
// Calling a Function
greet();

// Function with Return Value
function add(a, b) {
  return a + b;
}
console.log(add(4, 5));

/* Function Expressions */
/*
    In JavaScript, functions can also be defined as expressions
*/
let x = function (num) {
  return num * num;
};

console.log(x(4));

/* Arrow Function */
/*
    Syntax for JavaScript Arrow Function:
        let nameOfFunction = (arg1, arg2, ... argN) => {
            // function body
        }
    • nameOfFunction - name of the function
    • arg1, arg2, ... argN - the function arguments
*/
// Declaring a Function using Arrow Function
let welcome = () => {
  console.log('Welcome!');
};
// Calling the Arrow Function
welcome();

/* Function Default Parameters */
/* 
    JavaScript allows you to give default values to function parameters.
    Syntax for default values of function parameters:
        function nameOfFunction(arg1 = defaultValue, arg2 = defaultValue, ... argN = defaultValue) {
            // function body
        }
    With default values, you can have 3 types of default values:
        1. Values - i.e. a String or a Number (e.g. 2, 5, "Good Morning")
        2. Expresssions - i.e. a variable, or an expression with variables (e.g. "x + y")
        3. Function - a function itself can be a default value
*/
/* 1. Values as default value */
// The default value of parameter "x" is 3, and the default value of parameter "y" is 5.
function sum(x = 3, y = 5) {
  // return sum
  return x + y;
}
console.log(sum(5, 15)); // 20
console.log(sum(7)); // 12
console.log(sum()); // 8

/* 2. Expressions as default value */
function sum(x = 1, y = x, z = x + y) {
  console.log(x + y + z);
}
sum(); // 4
// If you reference a parameter that has not been initialised yet, you will get an error
// function sum(x = y, y = 1) {
//   console.log(x + y);
// }
// sum(); - this will throw an error

/* 3. Function as default value */
function calcDefault() {
  return 15;
}

function calculate(x, y = x * sum()) {
  return x + y;
}

const result = calculate(10);
console.log(result); // 160
