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
let numbers: number[] = [1, 2, 3];

/*
    However, Typescript also lets you declare arrays of any type. You can do this by just
    not specifying the data type of the Array, with just the normal Javascript Syntax:

        let <variableName> = [<elem1>, <elem2>, ...]
*/
let stuff = [1, 'Michael', 50.22, true, 'C'];

/*
    If you want to declare an empty Array with a certain data type, you must declare the
    data types of the array objects, otherwise you'll end up with an array of any type.
*/
let names: string[] = []; // This will be an array of strings only
let namesAny = []; // This will be an "any-type" array
