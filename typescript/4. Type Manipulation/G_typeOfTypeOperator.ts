/*
    https://www.typescriptlang.org/docs/handbook/2/typeof-types.html
    
    The typeof operator is used to refer to the type of a variable or property
*/
let s1 = 'hello';
let n1: typeof s; // This is the same as: let n: string;

/*
    Combined with other type operators, you can use typeof to express many patterns.

    For example, there is a predefined type: ReturnType<T>, which takes a function type
    and produces its return type
*/
type Predicate = (x: unknown) => boolean;
type K = ReturnType<Predicate>; // This is the same as: type K = boolean;

/*
    If we try to use ReturnType on a function name, we'll get an error
*/
function f1() {
  return { x: 10, y: 3 };
}
// The below code throws the following TS error: 'f1' refers to a value, but is being used as a type here.
// Did you mean 'typeof f'?
// type P1 = ReturnType<f>;

/*
    Remember that values and types aren't the same thing. To refer to the "type" of that value "f1" has,
    we have to use the typeof operator
*/
type P1 = ReturnType<typeof f1>;
