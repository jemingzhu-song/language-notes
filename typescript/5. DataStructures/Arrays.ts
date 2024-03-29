/*
    In Javascript, we would normally declare arrays like this:

        let numbers = [1, 2, 3]
    
    Arrays in Javascript can also contain different variable types, for example:

        let stuff = [1, "Michael", 50.22, true, 'C']
*/

/*
    Typescript allows you to specify the data type of the Array, with the Syntax:

        let <variableName>: <variableType>[] = [<elem1>, <elem2>, ...]
*/
var numbers: number[] = [1, 2, 3];

/*
    However, Typescript also lets you declare arrays of any type. You can do this by just
    not specifying the data type of the Array, with just the normal Javascript Syntax:

        let <variableName> = [<elem1>, <elem2>, ...]
*/
var stuff = [1, 'Michael', 50.22, true, 'C'];

/*
    If you want to declare an empty Array with a certain data type, you must declare the
    data types of the array objects, otherwise you'll end up with an array of any type.
*/
var names: string[] = []; // This will be an array of strings only
var namesAny = []; // This will be an "any-type" array

// 0. Declare Array
var people: string[] = [];

// 1. Add Array Elements: .push()
people.push("Adam");
people.push("Michael");
people.push("William");
people.push("Brian");
people.push("Zac");
people.push("Xavier");
people.push("Nathan");
console.log(people);

// 2. Get Array Element
console.log(people[2]);
console.log(people[3]);

// 3. Edit Array Element
people[2] = "WILLIAM"
console.log(people);

// 4. Remove Array Element
// a) By Index: .splice()
people.splice(1, 1); // Remove "Michael"
console.log(people);
// b) By Element: .indexOf() with .splice()
people.splice(people.indexOf("Zac"));
console.log(people);