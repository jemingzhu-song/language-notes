/*
    https://www.typescriptlang.org/docs/handbook/2/conditional-types.html

    Conditional types have a form that looks like conditional expressions:

        condition ? trueExpression : falseExpression
*/

interface Animal {
  live(): void;
}
interface Dog extends Animal {
  woof(): void;
}

type Example1 = Dog extends Animal ? number : string; // type Example1 = number;

type Example2 = RegExp extends Animal ? number : string; // type Example2 = string;

/*
    Conditional types are useful in Generics.

    For example, suppose we have the following "createLabel" function.

    There are multiple overloads for the "createLabel" function, which makes a choice depending
    on the types of its inputs:
        - If a library has to make the same sort of choice over and over throughout its API, 
          this becomes cumbersome.
        - We have to create three overloads: one for each case when we’re sure of the type 
          (one for string and one for number), and one for the most general case 
          (taking a string | number). For every new type createLabel can handle, the number
          of overloads grows exponentially.
*/
interface IdLabel {
  id: number /* some fields */;
}
interface NameLabel {
  name: string /* other fields */;
}

function createLabel(id: number): IdLabel;
function createLabel(name: string): NameLabel;
function createLabel(nameOrId: string | number): IdLabel | NameLabel;
function createLabel(nameOrId: string | number): IdLabel | NameLabel {
  throw 'unimplemented';
}

/*
    Instead, we can simplify this logic in a conditional type
*/
type NameOrId<T extends number | string> = T extends number ? IdLabel : NameLabel;

/*
    We can then use that conditional type above to simplify the overloads down to a single function
*/
function createLabelSimplified<T extends number | string>(idOrName: T): NameOrId<T> {
  throw 'unimplemented';
}
