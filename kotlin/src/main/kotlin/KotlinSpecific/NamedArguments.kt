package KotlinSpecific

/* ==================== Named Arguments and Default Values ==================== */
/*
    Named Arguments allow you to specify which parameter this argument value is going to be used for.
    This allows you to define the name of the parameter, and then the equal sign, and then the value.
    This means the order in which you pass in the parameters of a function won't matter as long as you
    use named arguments
*/
fun greetPerson(greeting: String, name: String) = println("$greeting $name")

/*
    Default Values allow us to define a "default value" of a parameter of a function, meaning
    if no parameter is passed in, then the parameter will take the value of that default value you have
    defined.

    This gives you the flexibility to not pass in certain parameters of a function, and the function
    will not throw an error as long as there exists a default value for that parameter.
*/
fun goodbyePerson(goodbye: String = "Goodbye", name: String) = println("$goodbye $name")

fun main() {
    /* In this case, without named parameters, the order in which you pass in the parameters matters.
    Here, this would result in the incorrect "behaviour" of this greetPerson function. It'll print
    "Nate Hello" instead of the "correct behaviour": "Hello Nate" */
    greetPerson("Nate", "Hello")

    /*
        Using named arguments allow us to mix up this order, resulting in the same behaviour for the
        function.
    */
    greetPerson(greeting = "Nate", name = "Hello")

    /*
        Using default values means we don't have to pass in the "goodbye" parameter if we
        don't want to.
     */
    goodbyePerson(name = "Kenny")
    goodbyePerson(goodbye = "Cya", "Adam")
}

/*
    LIMITATION

    A limitation of Named Arguments is that once you use named argument syntax for one parameter,
    you must use it for all other parameters for that function.

    For example, in the examples above, this will throw an error, since you are only using the
    named argument syntax for the "greeting" parameter, and not the "name" parameter (even if it
    is in the correct order):

    // This will throw an error:
    greetPerson(greeting = "Welcome", "Charles")
*/

