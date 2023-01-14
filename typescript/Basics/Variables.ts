/*
    Javascript has the following Data Types:
        • number
        • string
        • boolean
        • null
        • undefined
        • object 
    
    Typescript has all of the above Javascript types, as well as:
        • any
        • unknown
        • never
        • enum
        • tuple
*/

/* ========== Javascript Types ========== */
// 1. number - supports both integers and decimals
let nInt: number = 500;
let nDec: number = 99.95;

// 2. string
let s: string = 'Typescript';

// 3. boolean
let b: boolean = true;

// 4. null
let n: null = null;

// 5. undefined
let u: undefined = undefined;

/* ========== Typescript-Specific Types ========== */
// 1. any
/*
    The "any" type allows the variable to be essentially 'any' data type. It is not good practice
    to use this type, as by using this type you are basically losing all the benefits of using
    Typescript, however you can use this if you can't explicitly state what data type a variable
    is.
*/
// For example, suppose the "document" type can't be explicitly stated, so we just use "any" type
function render(document: any) {
  console.log(document);
}
