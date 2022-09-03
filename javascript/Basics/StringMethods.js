/* JavaScript String Methods */
/* 
    JavaScript Strings are "let", "var", or "const" variables surrounded by single quotes,
    double quotes or backticks.

    There are many string methods:
    Method	                Description
    charAt(index)	        returns the character at the specified index
    concat()	            joins two or more strings
    replace()	            replaces a string with another string
    split()	                converts the string to an array of strings
    substr(start, length)	returns a part of a string
    substring(start,end)	returns a part of a string
    slice(start, end)	    returns a part of a string
    toLowerCase()	        returns the passed string in lower case
    toUpperCase()	        returns the passed string in upper case
    trim()	                removes whitespace from the strings
    includes()	            searches for a string and returns a boolean value
    search()	            searches for a string and returns a position of a match
*/

/* Accessing String Characters */
/*
    There are two ways of accessing string characters:
        1. Treating strings as an array, and using bracket notation:
            stringName[index]
        2. Using the "charAt()" method
            stringName.charAt(index)
*/
// Using bracket notation
const string1 = 'This is a sentence';
console.log(string1[2]); // i

// Using charAt() method
console.log(string1.charAt(2)); // i

/* Strings are Immutable */
// Characters of Strings cannot be changed
let a = 'hello';
a[0] = 'H';
console.log(a);

/* 1. charAt() */
let string2 = 'This is a sentence';
console.log(string2.charAt(2)); // i

/* 2. concat() */
/*
    string1.concat(string2, string3, string4, ... stringN)
*/
let joined1 = 'Greetings'.concat(' ladies ', 'and ', 'gentlemen!');
console.log(joined1);

/* 3. split() - split a string into an array of strings */
/*
    stringName.split(splitOperator)
        • splitOperator - how the string should be split by
*/
let string3 = 'A quick brown fox jumped over the lazy dog';
let splitted = string3.split(' '); // split by space " "
console.log(splitted);

/* 4. slice(), substring(), substr()
/* 
    • slice(start, end)
    • substring(start, end)
    • substr(start, length)
*/
let str = 'Apple, Banana, Kiwi';
let part = str.slice(7, 13);
console.log(part); // Banana

/* 5. toUpperCase(), toLowerCase()
/*
    stringName.toUpperCase() - convert all letters to upper case
    stringName.toLowerCase() - convert all letters to lower case
*/
let string4 = 'A quick brown fox jumped over the lazy dog';
console.log(string4.toUpperCase());
console.log(string4.toLowerCase());

/* 6. Check if String in a String using: .includes() */
/*
    stringName.includes(subString)
*/
let string5 = 'A quick brown fox jumped over the lazy dog';
console.log(string5.includes('quick')); // true
console.log(string5.includes('quicK')); // false

/* 7. Search for position of a String inside another String using .search() */
/*
    stringName.search(subString)
*/
let string6 = 'A quick brown fox jumped over the lazy dog';
console.log(string6.search('brown')); // 8
console.log(string6.search('broWN')); // -1
