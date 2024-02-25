/*
    https://www.typescriptlang.org/docs/handbook/2/keyof-types.html

    The "keyof" operator takes an object type and produces a string or numeric literal union
    of its keys.
*/

type Coordinates = {
  x: number;
  y: number;
};

type P = keyof Coordinates; // The following is the same as: type P = "x" | "y"

/*
    If the type has a string or number index signature, keyof will return those types instead
*/
type Arrayish = {
  [n: number]: unknown;
};

type A = keyof Arrayish; // The following is the same as: type A = number

type Mapish = {
  [k: string]: boolean;
};

type M = keyof Mapish; // The following is the same as: type M = string | number
