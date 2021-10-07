/* ---------- JavaScript Array Methods ---------- */
/* ---------- Converting Arrays to Strings ---------- */
// The JavaScript method toString() converts an array to a string of (comma separated) array values.
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
document.getElementById('demo').innerHTML = fruits.toString();
// Result:
// Banana,Orange,Apple,Mango

// The join() method also joins all array elements into a string.
// It behaves just like toString(), but in addition you can specify the separator:
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
document.getElementById('demo').innerHTML = fruits.join(' * ');
// Result:
// Banana * Orange * Apple * Mango

/* ---------- Popping and Pushing ---------- */
// When you work with arrays, it is easy to remove elements and add new elements.
// This is what popping and pushing is:
// Popping items out of an array, or pushing items into an array.

/* ---------- Popping ---------- */
// The pop() method removes the last element from an array:
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
fruits.pop(); // Removes "Mango" from fruits

// The pop() method returns the value that was "popped out":
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
let x = fruits.pop(); // x = "Mango"

/* ---------- Pushing ---------- */
// The push() method adds a new element to an array (at the end):
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
fruits.push('Kiwi'); // Adds "Kiwi" to fruits

// The push() method returns the new array length:
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
let x = fruits.push('Kiwi'); //  x = 5

/* ---------- Shifting Elements ---------- */
// Shifting is equivalent to popping, working on the first element instead of the last.
// The shift() method removes the first array element and "shifts" all other elements to a lower index.
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
fruits.shift(); // Removes "Banana" from fruits

// The shift() method returns the value that was "shifted out":
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
let x = fruits.shift(); // x = "Banana"

// The unshift() method adds a new element to an array (at the beginning), and "unshifts" older elements:
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
fruits.unshift('Lemon'); // Adds "Lemon" to fruits

// The unshift() method returns the new array length.
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
fruits.unshift('Lemon'); // Returns 5

/* ---------- Changing Elements ---------- */
// Array elements are accessed using their index number:
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
fruits[0] = 'Kiwi'; // Changes the first element of fruits to "Kiwi"

// The length property provides an easy way to append a new element to an array:
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
fruits[fruits.length] = 'Kiwi'; // Appends "Kiwi" to fruits

/* ---------- Deleting Elements ---------- */
// Since JavaScript arrays are objects, elements can be deleted by using the JavaScript operator delete:
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
delete fruits[0]; // Changes the first element in fruits to undefined

/* ---------- Splicing an Array ---------- */
// The splice() method can be used to add new items to an array:
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
fruits.splice(2, 0, 'Lemon', 'Kiwi');
// Original Array:
// Banana,Orange,Apple,Mango
// New Array:
// Banana,Orange,Lemon,Kiwi
// Removed Items:
// Apple,Mango

// The first parameter (2) defines the position where new elements should be added (spliced in).
// The second parameter (0) defines how many elements should be removed.
// The rest of the parameters ("Lemon" , "Kiwi") define the new elements to be added.
// The splice() method returns an array with the deleted items:
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
fruits.splice(2, 2, 'Lemon', 'Kiwi');
// New Array:
// Orange,Apple,Mango

/* ---------- Use splice() to Remove Elements ---------- */
// With clever parameter setting, you can use splice() to remove elements without leaving "holes" in the array:
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
fruits.splice(0, 1); // Removes the first element

// The first parameter (0) defines the position where new elements should be added (spliced in).
// The second parameter (1) defines how many elements should be removed.
// The rest of the parameters are omitted. No new elements will be added.

/* ---------- Merging (Concatenating) Arrays ---------- */
// The concat() method creates a new array by merging (concatenating) existing arrays:
// The concat() method does not change the existing arrays. It always returns a new array.
const myGirls = ['Cecilie', 'Lone'];
const myBoys = ['Emil', 'Tobias', 'Linus'];

// Concatenate (join) myGirls and myBoys
const myChildren = myGirls.concat(myBoys);

// The concat() method can take any number of array arguments:
const arr1 = ['Cecilie', 'Lone'];
const arr2 = ['Emil', 'Tobias', 'Linus'];
const arr3 = ['Robin', 'Morgan'];
const myChildren = arr1.concat(arr2, arr3);

// The concat() method can also take strings as arguments:
const arr1 = ['Emil', 'Tobias', 'Linus'];
const myChildren = arr1.concat('Peter');

/* ---------- Slicing an Array ---------- */
// The slice() method slices out a piece of an array into a new array.
// This example slices out a part of an array starting from array element 1 ("Orange"):
const fruits = ['Banana', 'Orange', 'Lemon', 'Apple', 'Mango'];
const citrus = fruits.slice(1);
// New Array:
// Orange,Lemon,Apple,Mango

// The slice() method creates a new array. It does not remove any elements from the source array.
// This example slices out a part of an array starting from array element 3 ("Apple"):
const fruits = ['Banana', 'Orange', 'Lemon', 'Apple', 'Mango'];
const citrus = fruits.slice(3);

// The slice() method can take two arguments like slice(1, 3).
// The method then selects elements from the start argument, and up to (but not including) the end argument.
const fruits = ['Banana', 'Orange', 'Lemon', 'Apple', 'Mango'];
const citrus = fruits.slice(1, 3);

// If the end argument is omitted, like in the first examples, the slice() method slices out the rest of the array.
const fruits = ['Banana', 'Orange', 'Lemon', 'Apple', 'Mango'];
const citrus = fruits.slice(2);

/* ---------- Automatic toString() ---------- */
// JavaScript automatically converts an array to a comma separated string when a primitive value is expected.
// This is always the case when you try to output an array.
// These two examples will produce the same result:
const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
document.getElementById('demo').innerHTML = fruits.toString();

const fruits = ['Banana', 'Orange', 'Apple', 'Mango'];
document.getElementById('demo').innerHTML = fruits;

/* ---------- Finding Max and Min Values in an Array ---------- */
// There are no built-in functions for finding the highest or lowest value in a JavaScript array.
