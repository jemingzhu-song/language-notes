/*
    Literal Types allows us to limit the values that can be assigned to a variable.

    For example, suppose we want to declare a variable called "quantity", which can only have a value between
    0 to 100. If we define it as this:
        let quantity: number;
    The "quantity" can take ANY number, not just limited to 0-100.
*/
let quantity1: number;

/*
    To use a Literal Type, we set the Data Type to the actual value we want to restrict it to.

    The below example restricts the "quantity2" variable to only be able to be equal to 50.
*/
let quantity2: 50 = 50;

/*
    This might not be useful, but we can combine this with a Union Type, such that "quantity3" can be
    equal to either 50 or 100 or 200
*/
let quantity3: 50 | 100 | 200 = 200;

/*
    We can go even further. Instead of hardcoding the above values one by one, we can define a
    custom type using the Type Alias
*/
type QuantityValues = 50 | 100 | 200;
let quantity4: QuantityValues = 100;

/*
    Literal Types are not only restricted to "number", but also "string", and other Data Types
*/
