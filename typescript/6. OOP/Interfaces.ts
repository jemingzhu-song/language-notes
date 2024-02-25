/*
    https://www.typescriptlang.org/docs/handbook/2/classes.html#class-heritage

    You can use the "implements" keyword to check that a class satisfies a particular interface.
*/

interface Pingable {
  ping(): void;
}

class Sonar implements Pingable {
  ping() {
    console.log('ping!');
  }
}

/*
    It’s important to understand that an implements clause is only a check that the class can 
    be treated as the interface type. It doesn’t change the type of the class or its methods 
    at all. A common source of error is to assume that an implements clause will change 
    the class type - it doesn’t!
*/

interface Basketball {
  shoot(power: string, height: number): void;
}

class WilsonBasketball implements Basketball {
  shoot() {
    // Even if we don't pass in the method parameters, no error!
    console.log('shoot!');
  }
}
