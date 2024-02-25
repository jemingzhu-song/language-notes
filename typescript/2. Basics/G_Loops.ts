/*
    Loops
 */

var people = ["Michael", "Adam", "Kenny", "William", "James", "Zac"];

/*
    1. for..in returns a list of keys on the object being iterated
 */
for (let i in people) {
    console.log(i) // This will log the INDEXES: 0, 1, 2, 3, 4, 5
}

/*
    2. for..of returns a list of values of the numeric properties of the object being iterated.
 */
for (let name of people) {
    console.log(name); // This will log the actual elements: Michael, Adam, Kenny, ...
}

/*
    3. Classic for loop
 */
for (let i = 0; i < people.length; i++) {
    console.log(people[i]);
}

/*
    4. Classic While loop
 */
var i = 0
while (i < people.length) {
    console.log(people[i]);
    i++;
}