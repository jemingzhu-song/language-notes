/*
    By default, Typescript is very strict with using "null" or "undefined" values. 
    
    For example, consider the function below...
*/
function greet(name: string) {
  console.log(name.toUpperCase());
}

// Here, we cannot pass in "null" or "undefined" because Typescript doesn't allow us to do so
greet('Hello!'); // This is valid
// The following code below will throw an error
// greet(null); // This will throw an error

/*
    To pass in a "null" or "undefined" type into a function parameter, we must use the Union Operator
*/
function greet2(name: String | null | undefined) {
  if (name) {
    // If name != null || name != undefined
    console.log(name);
  } else {
    console.log('Hello :)');
  }
}
greet2(null); // This is valid now

/*
    Non-null Assertion Operator (Postfix !)

    TypeScript also has a special syntax for removing null and undefined from a type 
    without doing any explicit checking. Writing ! after any expression is effectively a 
    type assertion that the value isn’t null or undefined:
*/
function liveDangerously(x?: number | null) {
  // No error
  console.log(x!.toFixed());
}
