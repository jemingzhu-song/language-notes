/* Arrays */
/*
    There are various methods for JavaScript arrays. The most common methods are:

    Method	        Description
    concat()	joins two or more arrays and returns a result
    indexOf()	searches an element of an array and returns its position
    find()	    returns the first value of an array element that passes a test
    findIndex()	returns the first index of an array element that passes a test
    forEach()	calls a function for each element
    includes()	checks if an array contains a specified element
    push()	    adds a new element to the end of an array and returns the new length of an array
    unshift()	adds a new element to the beginning of an array and returns the new length of an array
    pop()	    removes the last element of an array and returns the removed element
    shift()	    removes the first element of an array and returns the removed element
    sort()	    sorts the elements alphabetically in strings and in ascending order
    slice()	    selects the part of an array and returns the new array
    splice()	removes or replaces existing elements and/or adds new elements
*/

/* 1. Creating an Array */
/*
    Arrays can be created using 2 ways:
        1. Array Literal
            const array1 = []
            const array2 = ["eat", "sleep"]
        2. Using the "new" keyword
            const array2 = new Array()
            const array2 = new Array("eat", "sleep")
*/
const names = ['Adam', 'Jenny', 'Charles', 'Michael', 'Xavier', 'Ben'];

/* 2. Accessing Elements of an Array */
/*
    You can access the elements of an array using the bracket notation:
        arrayName[index]
*/
console.log(names[2]); // Charles

/* 3. Adding an Element To An Array */
/*
    To add elements to an array, use the "push()" and "unshift()" methods or add a new index
*/
// Add element using bracket notation
const week = [];
console.log(week);
week[0] = 'Monday';
week[1] = 'Tuesday';
console.log(week);

// push() adds an element to the END of the array
const days = [];
console.log(days); // []
days.push('Monday');
days.push('Tuesday');
days.push('Wednesday');
console.log(days); // [Monday, Tuesday, Wednesday]

// unshift() adds an element to the START of the array
const rest = [];
console.log(rest); // []
rest.unshift('Monday');
rest.unshift('Sunday');
rest.unshift('Saturday');
console.log(rest); // [Saturday, Sunday, Monday]

/* 4. Edit Elements of Array */
/*
    To edit the elements of the array, you can access the index value and modify the value
*/
let dailyActivities = ['eat', 'sleep', 'exercise', 'study'];

// Edit element at index 2 ("exercise")
console.log(dailyActivities);
dailyActivities[2] = 'walk dog';
console.log(dailyActivities);

/* 5. Remove Elements of Array */
/*
    To remove elements from the array, you can use the "pop()" or "shift()" methods
*/
// pop() removes the LAST element from the array
let names1 = ['James', 'Michael', 'Adam'];
console.log(names1.pop()); // Adam
console.log(names1.pop()); // Michael
console.log(names1.pop()); // James

// shift() removes the FIRST element from the array
let names2 = ['Charles', 'Benny', 'Luis'];
console.log(names2.shift()); // Charles
console.log(names2.shift()); // Benny
console.log(names2.shift()); // Luis

// splice(index, number_elements_to_remove) removes elements STARTING AT the specified INDEX from the array
let names3 = ['Tommy', 'Bill', 'Xavier'];
console.log(names3);
console.log(names3.splice(1, 1));
console.log(names3);

/* 6. Length of Array */
/*
    You can find the length of an array using the "length" property
*/
const today1 = ['eat', 'sleep'];
// this gives the total number of elements in an array
console.log(dailyActivities.length); // 2
