/* ---------- JavaScript Variables ---------- */
// There are 3 ways to declare a JavaScript variable:
// • Using "var"
// • Using "let"
// • Using "const"

// This chapter uses var.
// The let and const keywords are explained in the next chapters.

/* ---------- Variables (var) ---------- */
// Variables are containers for storing data (values).
// In this example, x, y, and z, are variables, declared with the var keyword:
var x = 5;
var y = 6;
var z = x + y;

/* ---------- Much Like Algebra ---------- */
// In this example, price1, price2, and total, are variables:
var price1 = 5;
var price2 = 6;
var total = price1 + price2;

// In programming, just like in algebra, we use variables (like price1) to hold values.
// In programming, just like in algebra, we use variables in expressions (total = price1 + price2).
// From the example above, you can calculate the total to be 11.

/* ---------- JavaScript identifiers ---------- */
// All JavaScript variables must be identified with unique names - called identifiers.
// Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume)
// The general rules for constructing names for variables (unique identifiers) are:
// • Names can contain letters, digits, underscores, and dollar signs.
// • Names must begin with a letter
// • Names can also begin with $ and _ (but we will not use it in this tutorial)
// • Names are case sensitive (y and Y are different variables)
// • Reserved words (like JavaScript keywords) cannot be used as names

/* ---------- The Assignment Operator ---------- */
// In JavaScript, the equal sign (=) is an "assignment" operator, not an "equal to" operator.
// This is different from algebra. The following does not make sense in algebra:
x = x + 5;
// In JavaScript, however, it makes perfect sense: it assigns the value of x + 5 to x.
// (It calculates the value of x + 5 and puts the result into x. The value of x is incremented by 5.)

/* ---------- JavaScript Data Types ---------- */
// JavaScript variables can hold numbers like 100 and text values like "John Doe".
// In programming, text values are called text strings.
// JavaScript can handle many types of data, but for now, just think of numbers and strings.
// Strings are written inside double or single quotes. Numbers are written without quotes.
// If you put a number in quotes, it will be treated as a text string.
var pi = 3.14;
var person = 'John Doe';
var answer = 'Yes I am!';

/* ---------- Declaring (Creating) JavaScript Variables ---------- */
// Creating a variable in JavaScript is called "declaring" a variable.
// You declare a JavaScript variable with the var keyword:
var carName;

// After the declaration the variable has no value (technically it has the value of undefined).
// To assign a value to the variable, use the equal sign:
carName = 'Volvo';

// You can also assign a value to the variable when you declare it:
var carName = 'Volvo';

// In the example below, we create a variable called carName and assign the value "Volvo" to it.
// Then we "output" the value inside an HTML paragraph with id="demo":
{
  /* <p id="demo"></p>
<script>
var carName = "Volvo";
document.getElementById("demo").innerHTML = carName;
</script> */
}

/* ---------- One Statement, Many Variables ---------- */
// You can declare many variables in one statement.
// Start the statement with var and separate the variables by comma:
var person = 'John Doe',
  carName = 'Volvo',
  price = 200;

// A declaration can span multiple lines:
var person = 'John Doe',
  carName = 'Volvo',
  price = 200;

/* ---------- Value = Undefined ---------- */
// In computer programs, variables are often declared without a value. The value can be
// something that has to be calculated, or something that will be provided later, like user input.
// A variable declared without a value will have the value undefined.
// The variable carName will have the value undefined after the execution of this statement:
var carName;

/* ---------- Re-Declaring JavaScript Variables ---------- */
// If you re-declare a JavaScript variable, it will not lose its value.
// The variable carName will still have the value "Volvo" after the execution of these statements:
var carName = 'Volvo';
var carName;

/* ---------- JavaScript Arithmetic ---------- */
// As with algebra, you can do arithmetic with JavaScript variables, using operators like = and +:
var x = 5 + 2 + 3;

// You can also add strings, but strings will be concatenated:
var x = 'John' + '' + 'Doe';

// If you put a number in quotes, the rest of the numbers will be treated as strings, and concatenated:
var x = '5' + 2 + 3; // Should print: 523
var x = 2 + 3 + '5'; // Should print: 55

/* ---------- JavaScript Dollar Sign $ ---------- */
// Remember that JavaScript identifiers (names) must begin with:
// • A letter (A-Z or a-z)
// • A dollar sign ($)
// • Or an underscore (_)
// Since JavaScript treats a dollar sign as a letter, identifiers containing $ are valid variable names:
var $$$ = 'Hello World';
var $ = 2;
var $myMoney = 5;

// Using the dollar sign is not very common in JavaScript, but professional programmers often use it as an
// alias for the main function in a JavaScript library.
// In the JavaScript library jQuery, for instance, the main function $ is used to select HTML elements.
// In jQuery $("p"); means "select all p elements".

/* ---------- JavaScript Underscore ( _ ) ---------- */
// Since JavaScript treats underscore as a letter, identifiers containing _ are valid variable names:
var _lastName = 'Johnson';
var _x = 2;
var _100 = 5;
