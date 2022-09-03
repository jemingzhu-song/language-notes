/* ---------- JavaScript Syntax ---------- */
// JavaScript syntax is the set of rules, how JavaScript programs are constructed:
// How to create variables:
var x;
let y;

// How to use variables:
x = 5;
y = 6;
let z = x + y;

/* ---------- JavaScript Values ---------- */
// The JavaScript syntax defines two types of values:
// • Fixed values
// • Variable values
// Fixed values are called Literals.
// Variable values are called Variables.

/* ---------- JavaScript Literals ---------- */
// The two most important syntax rules for fixed values are:
// 1. Numbers are written with or without decimals:
10.5;
1001;
// 2. Strings are text, written within double or single quotes:
('John Doe');
('John Doe');

/* ---------- JavaScript Variables ---------- */
// In a programming language, variables are used to store data values.
// JavaScript uses the keywords: "var", "let", and "const" to declare variables.
// An equal sign is used to assign values to variables.
// In this example, x is defined as a variable. Then, x is assigned (given) the value 6:
let x;
x = 6;

/* ---------- JavaScript Operators ---------- */
// JavaScript uses arithmetic operators ( + - * / ) to compute values:
(5 + 6) * 10;
// JavaScript uses an assignment operator ( = ) to assign values to variables:
let x, y;
x = 5;
y = 6;

/* ---------- JavaScript Expressions ---------- */
// An expression is a combination of values, variables and operators, which computes to a value.
// The computation is called an evaluation
// For example, 5 * 10 evaluates to 50:
5 * 10;
// Expressions can also contain variable values:
x * 10;
// The values can be of various types, such as numbers and strings.
// For example, "John" + "" + "Doe", evaluates to "John Doe":
'John' + '' + 'Doe';

/* ---------- JavaScript Keywords ---------- */
// JavaScript keywords are used to identify actions to be performed.
// The "let" keyword tells the browser to create variables:
let x, y;
x = 5 + 6;
y = x * 10;

// The "var" keyword also tells the browser to create variables:
var x, y;
x = 5 + 6;
y = x * 10;

/* ---------- JavaScript is Case Sensitive ---------- */
// All JavaScript identifiers are case sensitive
// The variables lastName and lastname are two different variables:
let lastname, lastName;
lastName = 'Doe';
lastname = 'Peterson';

/* ---------- JavaScript and Camel Case ---------- */
// Hyphens are not allowed in JavaScript, they are reserved for subtractions.
// Underscore, Upper Camel Case can be used, but Lower Camel Case (e.g. firstName, lastName, etc.) are
// mainly used by JavaScript programmers
firstName = 'John';
lastName = 'Doe';
