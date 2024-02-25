/*
    https://www.typescriptlang.org/docs/handbook/2/classes.html#extends-clauses
*/
class Building {
    // Static Field
    static country = "Australia"

    material: string;

    type(): string {
        return "Residential Building"
    }

    // Static Method
    static state(): string {
        return "NSW"
    }
}

console.log(Building.country) // Accessing static field
console.log(Building.state()) // Accessing static method

class House extends Building {
    stories: number;

    // You don't need to use the "override" keyword to override methods
    type(): string {
        return super.type() + " -> House"
    }
}

console.log(House.country) // Accessing static field from inherited class