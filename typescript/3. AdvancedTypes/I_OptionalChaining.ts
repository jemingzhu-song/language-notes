/*
    When working with "null", we often need to do "null" checks.
*/
type Customer = {
  birthday: Date;
};

function getCustomer(id: number): Customer | null | undefined {
  return id === 0 ? null : { birthday: new Date() };
}

let customer = getCustomer(0);
// We need this check because getCustomer() may return a "null" or "undefined" value
if (customer !== null && customer !== undefined) {
  console.log(customer.birthday);
}

/* 
    There is a simpler way to write the above statement without the "if" statement check, called
    the Optional Property Access Operator, using the "?" symbol
*/
let customer2 = getCustomer(0);
/*
    This code will only be executed if "customer2" is not "null" or "undefined"
*/
console.log(customer2?.birthday);

/*
    There is also something called Optional Element Access Operator, for Arrays.

    For example, if we have a list of Customers, some of which can be "null", we would need to check
    whether or not the current Customer is "null".

    Suppose we want to access the first element of this Array and we need to check if it is "null".

    Instead of doing:

        if (customers[0] !== null) {
            console.log(customers[0])
        }
        
    We can use the Optional Element Access Operator, using the "?." operator
        
        customers?.[0]
*/
