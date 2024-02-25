/*
    https://www.typescriptlang.org/docs/handbook/2/mapped-types.html

    Mapped Types build on the syntax of Index Signatures.

    A Mapped Type is a generic type which uses a union of PropertyKeys (frequently created via a
    keyof operator) to iterate through keys to create a type
*/

/*
    In the below example, OptionsFlags will take all the properties from the type "Type" and change their
    values to be a boolean type instead of being of type: () => void
*/
type OptionsFlags<Type> = {
  [Property in keyof Type]: boolean;
};

type Features = {
  darkMode: () => void;
  newUserProfile: () => void;
};

type FeatureOptions = OptionsFlags<Features>;

/*
    The above is the same as:

    type FeatureOptions = {
        darkMode: boolean;
        newUserProfile: boolean;
    }
*/
