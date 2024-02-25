/*
    https://www.typescriptlang.org/docs/handbook/2/generics.html

    To start off, let's look at the identity function:
    The identity function is a function that will return back whatever is passed in. 
    You can think of this in a similar way to the echo command.
*/

/* Without generics, we would either have to give the identity function a specific type: */
function identity_number(arg: number): number {
  return arg;
}

/* Or, we would describe the identity function using the "any" type */
function identity_any(arg: any): any {
  return arg;
}

/*
    Whilst using "any" is generic, it will cause the function to lose the information
    about what that type was when the function returns it.

    e.g. If we passed in a number, the only information we have when we get the result is that
    "any" type could be returned
*/
let number1 = 5;
let result1 = identity_any(number1);
number1.toExponential(); // This function call auto-completes
result1.toExponential(); // This function call does not auto-complete - it doesn't exist

/*
    Instead, we need a way of capturing the type of the argument in a way that we can
    also use to denote what is being returned. Here, we will use a type variable.
*/

function identityFun<Type>(arg: Type): Type {
  return arg;
}

let output = identityFun<string>('my-String'); // let output: string
// below, we can still use all the available string functions
output.split('-');
output.match('my');
