/*
    Enums in Typescript are similar to Enums in Java or Kotlin, they allow us to "group" constant values
    together. Syntax:

    enum <enumName> {
        <enumName1> = <enumValue1>,
        <enumName2> = <enumValue2>,
        <enumName3> = <enumValue3>
    }

    The data types of each enum value do not necessarily have to be all the same.
*/

enum Size {
  Small = 5,
  Medium = 10,
  Large = 15,
}

/* To use an enum value */
var smallCoffee: Size = Size.Small;
console.log(smallCoffee); // This will print out: "5"

// The data types of each enum value do not necessarily have to be all the same.
enum Random {
  Price = 5,
  Peach = 'Fruit',
  Score = 87.93,
}
