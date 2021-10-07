/* ---------- JavaScript Array map() ---------- */
// Example:
// Return a new array with the square root of all the original values:
const numbers = [4, 9, 16, 25];
const newArr = numbers.map(Math.sqrt);

/* ---------- Definition and Usage ---------- */
// The map() method creates a new array with the results of calling a function for every array element.
// The map() method calls the provided function once for each element in an array, in order.
// map() does not execute the function for empty elements.
// map() does not change the original array.

// Syntax
// array.map(function(currentValue, index, arr), thisValue)

// Parameter	                                Description
// function(currentValue, index, arr)	        Required. A function to be run for each element in the array.
//      Function Arguments:
//      Argument	        Description
//      currentValue	    Required. The value of the current element
//      index	            Optional. The array index of the current element
//      arr	                Optional. The array object the current element belongs to.
// thisValue	                                Optional. A value to be passed to the function to be used as its "this"
//                                              value. If this parameter is empty, the value "undefined" will be
//                                              passed as its "this" value

// Return Value:
// An Array containing the results of calling the provided function for each element in the original array.

// Example
// Multiply all the values in array with 10:
const numbers = [65, 44, 12, 4];
const newArr = numbers.map(myFunction);

function myFunction(num) {
  return num * 10;
}
// Arrow Function Notation/Short Format
const newArr = numbers.map((num) => {
  num * 10;
});

// Example
// Get the full name for each person in the array:
const persons = [
  { firstname: 'Malcom', lastname: 'Reynolds' },
  { firstname: 'Kaylee', lastname: 'Frye' },
  { firstname: 'Jayne', lastname: 'Cobb' },
];

persons.map(getFullName);

function getFullName(item) {
  return [item.firstname, item.lastname].join(' ');
}
