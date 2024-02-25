/*
    Tuples are unique to Typescript, and is a fixed length Array where each element has a particular type.
    Tuples are often used to store pairs of values.
    Best practice is to keep Tuples to of length 2 values
*/

// In this example, the Array "user" is of fixed length of 2. The first element must be a "number" type, and
// the second element must be a "string" type
let user: [number, string] = [1, 'Michael'];
// Here, this Tuple is of length 4
let additionalUser: [number, string, string, number] = [1, 'Jason', 'Kim', 23];
