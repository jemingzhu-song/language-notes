/*
    https://www.typescriptlang.org/docs/handbook/2/generics.html#generic-types

    In previous sections, we created generic identity functions that worked over a 
    range of types. In this section, we’ll explore the type of the functions themselves 
    and how to create generic interfaces.

    The type of generic functions is just like those of non-generic functions, with 
    the type parameters listed first, similarly to function declarations:
*/

function identityType<Type>(arg: Type): Type {
  return arg;
}

// Assign variable "myIdentity" to the function "identityType"
let myIdentity: <Type>(arg: Type) => Type = identityType;
let myIdentity2 = identityType; // alternatively, we don't need to define the type explicilty

/*
    We could also have used a different name for the generic type parameter in the 
    type, so long as the number of type variables and how the type variables are used line up.
*/
function identityInput<Input>(arg: Input): Input {
  // Use "Input" instead of "Type"
  return arg;
}

let myIdentity3: <Input>(arg: Input) => Input = identityInput;

/*
    Generic Interface

    Which leads us to writing our first generic interface. 
    Let’s take the object literal from the previous example and move it to an interface:
*/

interface GenericIdentityFn {
  <Type>(arg: Type): Type;
}

function identityTypeInterface<Type>(arg: Type): Type {
  return arg;
}

let myIdentityGeneric: GenericIdentityFn = identityTypeInterface;

/*
    In a similar example, we may want to move the generic parameter 
    to be a parameter of the whole interface. This lets us see what 
    type(s) we’re generic over (e.g. Dictionary<string> rather than just Dictionary). 
    
    This makes the type parameter visible to all the other members of the interface.
*/
interface GenericIdentityFnWithParam<Type> {
  // Now takes in the <Type> as a parameter to the interface
  (arg: Type): Type;
}

function identityTypeGenericInterface<Type>(arg: Type): Type {
  return arg;
}

let myIdentityGenericParam: GenericIdentityFnWithParam<number> = identityTypeGenericInterface;
