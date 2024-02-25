/*
    https://www.typescriptlang.org/docs/handbook/2/generics.html#generic-classes

    A generic class has a similar shape to a generic interface.
    Generic classes have a generic type parameter list in angle brackets (<>) following
    the name of the class
*/
class GenericClass<Type> {
  zeroValue: Type;
  combine: (x: Type, y: Type) => Type;
}

let myGenericNumber = new GenericClass<number>();
myGenericNumber.zeroValue = 0;
myGenericNumber.combine = function (x, y) {
  return x + y;
};

let resultNumber = myGenericNumber.combine(1, 2);

let myGenericString = new GenericClass<string>();
myGenericString.zeroValue = '';
myGenericString.combine = function (x, y) {
  return x.concat(y);
};

let resultString = myGenericString.combine('Hello', 'world');
