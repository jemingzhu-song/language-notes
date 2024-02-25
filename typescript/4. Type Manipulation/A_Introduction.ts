/*
    TypeScript’s type system is very powerful because it allows expressing types in 
    terms of other types.

    The simplest form of this idea is generics. Additionally, we have a wide variety of type 
    operators available to use. It’s also possible to express types in terms of values that 
    we already have.

    By combining various type operators, we can express complex operations and values in 
    a succinct, maintainable way. In this section we’ll cover ways to express a new type in 
    terms of an existing type or value.

        Generics - Types which take parameters
        Keyof Type Operator - Using the keyof operator to create new types
        Typeof Type Operator - Using the typeof operator to create new types
        Indexed Access Types - Using Type['a'] syntax to access a subset of a type
        Conditional Types - Types which act like if statements in the type system
        Mapped Types - Creating types by mapping each property in an existing type
        Template Literal Types - Mapped types which change properties via template literal strings
*/
