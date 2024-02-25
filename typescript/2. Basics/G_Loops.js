/*
    Loops
 */
var people = ["Michael", "Adam", "Kenny", "William", "James", "Zac"];
/*
    1. for..in returns a list of keys on the object being iterated
 */
for (var i_1 in people) {
    console.log(i_1); // This will log the INDEXES: 0, 1, 2, 3, 4, 5
}
/*
    2. for..of returns a list of values of the numeric properties of the object being iterated.
 */
for (var _i = 0, people_1 = people; _i < people_1.length; _i++) {
    var name_1 = people_1[_i];
    console.log(name_1); // This will log the actual elements: Michael, Adam, Kenny, ...
}
/*
    3. Classic for loop
 */
for (var i_2 = 0; i_2 < people.length; i_2++) {
    console.log(people[i_2]);
}
/*
    4. Classic While loop
 */
var i = 0;
while (i < people.length) {
    console.log(people[i]);
    i++;
}
