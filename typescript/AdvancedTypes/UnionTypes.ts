/*
    Union Types allow you to give a variable or a function parameters more than one type.

    To declare a union type, use the "|" operator to separate two different data types.
*/

/*
    In this function, the "weight" parameter can be of type "number" or "string", declared as a Union Type
    by the "|" operator separating the two data types "number" and "string".
*/
function kgToPounds(weight: number | string): number {
  /*
        Currently, the "weight" variable will only display methods that are common to both "number" and "string"
        data types. In order to "separate" the cases where "weight" might be a "number" or a "string", we use 
        a technique called Narrowing, by using the "typeof" keyword along with the "===" operator
    */
  // let result = weight * 2.2; // This will throw an error since the compiler here knows that weight can either be "number"
  // or "string" type
  if (typeof weight === 'number') {
    /*
            In this code block, the compiler knows that the "weight" will be of type "number", and hence will
            only display methods for the "number" data type
        */
    return weight * 2.2;
  } else {
    return parseInt(weight) * 2.2;
  }
}
