/*
    https://dmitripavlutin.com/typescript-index-signatures/

    Index Signatures help to define the types of a objects of unknown structure when you
    only know the key and value types, and you don't know the actual properties itself
*/

// Suppose you have 2 objects that describe the salary of 2 software engineers
let salary1 = {
  baseSalary: 100000,
  bonus: 20000,
};

let salary2 = {
  contractSalary: 200000,
};

// You want to implement a function that returns the total renumeration based on the salary object
/*
    function totalSalary(salaryObject: ???) {
    let total = 0;
    for (const name in salaryObject) {
        total += salaryObject[name];
    }
    return total;
    }
*/

/*
    How would you annotate the "salaryObject" function parameter to accept objects with a 
    key as a string, and the value as a number? 

    The solution is to use an index signature.

    The syntax is to use the "key" operator

    type Example = {
        [key: KeyType]: ValueType
    }

    The following tells Typescript that "Example" has to be an object with a key of type "KeyType"
    and a value of type "ValueType"
*/
type SalaryObject = {
  [key: string]: number; // Index Signature
};

function totalSalary(salaryObject: SalaryObject) {
  let total = 0;
  for (const name in salaryObject) {
    total += salaryObject[name];
  }
  return total;
}
