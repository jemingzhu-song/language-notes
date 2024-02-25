/*
    Type aliases and interfaces are very similar, and in many cases you can 
    choose between them freely. Almost all features of an interface are 
    available in type.
    
    The key distinction is that a type cannot be re-opened 
    to add new properties vs an interface which is always extendable.
*/

// ================ Interfaces ================ //

/* Extending an Interface */
interface Animal {
  name: string;
}

interface Bear extends Animal {
  honey: Boolean;
}

let bear: Bear = { name: 'Roary', honey: true };
console.log(bear.name);
console.log(bear.honey);

/* Adding New Fields to an Interface */
interface House {
  material: string;
}

interface House {
  bedrooms: number;
  bathrooms: number;
}

let h1: House = { material: 'Google Chrome 1', bedrooms: 3, bathrooms: 2 };

// ================ Type Aliases ================ //

/* Extending a Type via Intersections */
type Fruit = {
  colour: string;
};

type Apple = Fruit & {
  sugar: number;
};

let apple: Apple = { colour: 'Red', sugar: 10 };
console.log(apple.colour);
console.log(apple.sugar);

/* Adding New Fields to a Type - YOU CAN'T!!! */
type Apartment = {
  material: string;
};

// The below code will cause TS to throw "Error: Duplicate identifier 'Apartment'"

// type Apartment = {
//     bedrooms: number;
//     bathrooms: number;
// }
