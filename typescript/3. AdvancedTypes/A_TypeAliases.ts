/*
    Consider the "employee1" object below. There are three problems with it:
        1. If we want to create another "employee" object, we have to repeat this structure
        2. If we want to create another "employee" object, it might have additional properties/fields
        3. This structure/syntax makes it harder to understand
*/
let employee1: {
  id: number;
  name: string;
  mobile?: string;
} = {
  id: 1,
  name: 'James Chen',
};

/*
    There problems can be solved by Type Aliases, which allow us to define a "type blueprint". Syntax:

    type <typeAliasName> = {
        <field1Name>: <dataType>;
        <field2Name>: <dataType>;
        <field3Name>: <dataType>;
    };

    Now to create a variable with that blueprint:

    let employee2: Employee = {
        id: 21,
        name: "Kim Jones",
        mobile: "0203999323"
    }
*/
type Employee = {
  id: number;
  name: string;
  mobile?: string;
};

let employee2: Employee = {
  id: 52,
  name: 'Honas Brut',
  mobile: '0402993222',
};
