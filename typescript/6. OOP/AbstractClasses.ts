/*
    https://www.tutorialsteacher.com/typescript/abstract-class

    - Use the "abstract" keyword
    - Can't instantiate an abstract class
*/

abstract class Animal {
  // Normal property
  species: string;

  // Abstract property - classes which extend this abstract class must call the "super()" method
  abstract action: string;

  constructor(species: string) {
    this.species = species;
  }

  // Normal Method
  animal(): string {
    return 'This animal is of species: ' + this.species;
  }

  // Abstract Method
  abstract performAction(): string;
}

class Fish extends Animal {
  // Implement the Abstract Property
  action: string;

  constructor(species: string, action: string) {
    super(species);
    this.action = action;
  }

  performAction(): string {
    return 'Animal action: ' + this.action;
  }
}
