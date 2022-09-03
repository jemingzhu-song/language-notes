/* Type Conversions */
/*
    There are 2 types of conversion in JavaScript:
        1. Implicit Conversion - automatic type conversion
        2. Explicit Conversion - manual type conversion
*/

/* 1. Implicit Conversion */
/* Implicit Conversion to String */
// numeric string used with + gives string type
let result1;

result1 = '3' + 2;
console.log(result1); // "32"

result1 = '3' + true;
console.log(result1); // "3true"

result1 = '3' + null;
console.log(result1); // "3null"

/* Implicit Conversion to Number */
// numeric string used with - , / , * results number type
let result2;

result2 = '4' - '2';
console.log(result2); // 2

result2 = '4' - 2;
console.log(result2); // 2

result2 = '4' * 2;
console.log(result2); // 8

result2 = '4' / 2;
console.log(result2); // 2

// and many more types of Implicit Conversion... (https://www.programiz.com/javascript/type-conversion)

/* 2. Explicit Conversion */
/*
    Explicit Conversion allows you to use built-in methods to convert data types manually
*/

/* Convert to Number Explicitly */
/*
    To convert numeric strings and boolean values to numbers, you can use Number()
*/
let result3;

// string to number
result3 = Number('324');
console.log(result3); // 324

result3 = Number('324e-1');
console.log(result3); // 32.4

// boolean to number
result3 = Number(true);
console.log(result3); // 1

result3 = Number(false);
console.log(result3); // 0

// Empty Strings and null values return 0:
result3 = Number(null);
console.log(result3); // 0

result3 = Number(' ');
console.log(result3); // 0

/* Convert to String Explicitly */
/* 
    To convert other data types of Strings, you can use String() or toString()
*/
//number to string
let result;
result = String(324);
console.log(result); // "324"

result = String(2 + 4);
console.log(result); // "6"

//other data types to string
result = String(null);
console.log(result); // "null"

result = String(undefined);
console.log(result); // "undefined"

result = String(NaN);
console.log(result); // "NaN"

result = String(true);
console.log(result); // "true"

result = String(false);
console.log(result); // "false"

// using toString()
result = (324).toString();
console.log(result); // "324"

result = true.toString();
console.log(result); // "true"

/* Convert to Boolean Explicitly */
/*
    To convert other data types to a boolean, you can use Boolean().
*/
// In JavaScript, undefined, null, 0, NaN, '' converts to false.
let result4;
result4 = Boolean('');
console.log(result4); // false

result4 = Boolean(0);
console.log(result4); // false

result4 = Boolean(undefined);
console.log(result4); // false

result4 = Boolean(null);
console.log(result4); // false

result4 = Boolean(NaN);
console.log(result4); // false

// All other values give "true":
result = Boolean(324);
console.log(result); // true

result = Boolean('hello');
console.log(result); // true

result = Boolean(' ');
console.log(result); // true
