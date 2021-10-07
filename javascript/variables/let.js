/* ---------- JavaScript Let ---------- */
// Variables defined with let cannot be Redeclared.
// Variables defined with let must be Declared before use.
// Variables defined with let have Block Scope.

/* ---------- Cannot be Redeclared ---------- */
// Variables defined with let cannot be redeclared - you cannot accidentally redelcare a variable.
// With "let", you can not do this:
let x = 'John Doe';
let x = 0;
// SyntaxError: "x" has already been declared

// With "var", you can:
var x = 'John Doe';
var x = 0;

/* ---------- Block Scope ---------- */
// Variables declared inside a { } block cannot be accessed from outside the block:
{
  let x = 2;
}
// x can NOT be used here

// Variables declared with the var keyword can NOT have block scope.
// Variables declared inside a { } block can be accessed from outside the block.
{
  var x = 2;
}
// x CAN be used here

/* ---------- Redeclaring Variables ---------- */
// Redeclaring a variable using the "var" keyword can impose problems.
// Redeclaring a variable inside a block will also declare the variable outside the block:
var x = 10;
// Here x is 10
{
  var x = 2;
  // Here x is 2
}
// Here x is 2

// Redeclaring a variable using the "let"" keyword can solve this problem.
// Redeclaring a variable inside a block will not redeclare the variable outside the block:
let x = 10;
// Here x is 10
{
  let x = 2;
  // Here x is 2
}
// Here x is 10

/* ---------- Redeclaring ---------- */
// Redeclaring a JavaScript variable with var is allowed anywhere in a program:
var x = 2;
// Now x is 2

var x = 3;
// Now x is 3

// With "let", redeclaring a variable in the same block is NOT allowed:
var x = 2; // Allowed
let x = 3; // Not allowed

{
  let x = 2; // Allowed
  let x = 3; // Not allowed
}

{
  let x = 2; // Allowed
  var x = 3; // Not allowed
}

// Redeclaring a variable with "let", in another block, IS allowed:
let x = 2; // Allowed

{
  let x = 3; // Allowed
}

{
  let x = 4; // Allowed
}

/* ---------- Let Hoisting ---------- */
// Variables defined with "var" are hoisted to the top and can be initialised at any time, i.e.
// you can use the variable BEFORE it is declared:
carName = 'Volvo';
var carName;

// Variables defined with "let" are also hoisted to the top of the block, but NOT initialised, i.e.
// using a "let" variable before it is declared will result in a ReferenceError:
carName = 'Saab';
let carName = 'Volvo';
