/* Data Types */

/* JavaScript Type */
/*
    JavaScript is a dynamically typed (loosely typed) language. JavaScript automatically determines
    the variables' data type for you.
    This means that a variable can be of one data type and then later changed to another data type.
*/
let data1;
// data1 is of "Integer" type
data1 = 5;
// data1 is changed/redeclared to "String" type
data1 = 'This is a sentence.';

/* JavaScript typeof */
/*
    "typeof" keyword can be used to find the type of a variable.
*/
const type1 = 'Good evening ladies and gentleman';
typeof type1; // returns "String"

const type2 = 4;
typeof type2; // returns "Number"

const type3 = true;
typeof type3; // returns "Boolean"

const type4 = null;
typeof type4; // returns "Object"

/*
    There are 7 basic data types in JavaScript:
        1. String - e.g. "Hello World!", 'hey everyone'
        2. Number (integer or floating) - e.g. 3, 3.234, 3e-2
        3. BigInt (integer with arbitrary precision) - e.g. 399329329239n
        4. Boolean - e.g. true, false
        5. null
        6. Object (key-value pairs of collection of data) - e.g. let student = { };
        7. Symbol (data type whose instances are unique and immutable) - e.g. let value = Symbol('hello');
*/

/* 1. String */
/*
    Strings can be denoted in single or double quotes, or with backticks
*/
const string1 = 'single ticks';
const string2 = 'double ticks';
const string3 = `back ticks`;

/* 2. Number */
/*
    Numbers can represent Integer or Floating Numbers (decimals and exponentials).
    Numbers can also be +Infinity, -Infinity and NaN (Not a Number).
    Numbers only lie in the range: -(2^53 - 1) and +(2^53 -1)
*/
const number1 = 3;
const number2 = 3.14;
const number3 = 3e5; // 3 * 10^5
const number4 = 3 / 0; // +Infinity
const number5 = -3 / 0; // -Infinity
const number6 = 'abc' / 3; // NaN (since Strings can't be divided by Numbers)

/* 3. BigInt */
/*
    BigInt can be used to represent a number that is out of bounds of the Number data type.
    This means BigInt can represent numbers less than -(2^53-1) and greater than +(2^53-1)
*/
const bigint1 = 900719925124740998n;

// Adding two big integers
const result1 = bigint1 + 1n;
console.log(result1); // "900719925124740999n"

const bigint2 = 900719925124740998n;

// Error! BitInt and number cannot be added
const result2 = bigint2 + 1;
console.log(result2);

/* 4. Boolean */
/*
    Boolean can only represent two values: "true" or "false"
*/
const boolean1 = true;
const boolean2 = false;

/* 5. null */
/*
    null represents an empty or unknown value
*/
const null1 = null;

/* 6. Object */
/*
    Object is a complex data type that allows you to store collectiopns of data
    Objects are similar to Python Dictionaries or Java HashMaps
*/
const object1 = {
  firstName: 'James',
  lastName: 'Chen',
  age: 53,
};

/* 7. Symbol */
/*
    Symbol is an immutable primitive value that is unique
*/

// Although "symbol1" and "symbol2" both contain 'hello', they are different since they
// are of "Symbol" data type.
const symbol1 = Symbol('hello');
const symbol2 = Symbol('hello');
