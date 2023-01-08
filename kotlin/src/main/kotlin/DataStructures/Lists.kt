package DataStructures

/* ==================== Lists ==================== */
fun main() {
    /*
        There are multiple options to create different types of Lists in Kotlin:

        1. listOf()
        Creates a new read-only List.

        Example:
            // Implicit Declaration
            val names = listOf("Michael", "Kim", "Jenny")
            // Explicit Declaration
            val names: List<String> = listOf<String>("Michael", "Jenny", "Kim")

        2. listOfNotNull()
        Basically the same as listOf(), but without null values. Even empty strings are skipped.
            // Implicit Declaration
            val names = listOfNotNull("Michael", "Kim", "Jenny")
            // Explicit Declaration
            val names: List<String> = listOfNotNull<String>("Michael", "Jenny", "Kim")

        3. arrayListOf()
        Creates an ArrayList. This time you can modify (add/remove) elements.
            // Implicit Declaration
            val names = arrayListOf("Michael", "Kim", "Jenny")
            // Explicit Declaration
            val names: ArrayList<String> = arrayListOf<String>("Michael", "Jenny", "Kim")

        4. mutableListOf()
        Behaves like arrayListOf(). Actually, mutableListOf() internally uses ArrayLists.
            // Implicit Declaration
            val names = mutableListOf("Michael", "Kim", "Jenny")
            // Explicit Declaration
            val names: MutableList<String> = mutableListOf<String>("Michael", "Jenny", "Kim")

     */

    /*  ==================== ArrayLists ==================== */
    println("========== ArrayLists ==========")
    val people1: ArrayList<String> = arrayListOf<String>()
    println(people1)

    // 1. Add to List: .add()
    people1.add("Michael");
    people1.add("Jenny");
    people1.add("Adam");
    people1.add("Kenny");
    people1.add("Charles");
    people1.add("Brian");
    people1.add("Zion");

    println(people1)

    // 2. Get from List: .get() or []
    println(people1.get(2)); // Adam
    println(people1[5]); // Brian

    // 3. Edit List: .set() or []
    people1.set(0, "MICHAEL");
    people1[2] = "ADAM";
    println(people1)

    // 4. Remove from List: .remove(<element>) or removeAt(<index>)
    people1.remove("Jenny")
    people1.removeAt(2);
    println(people1)

    /*  ==================== Lists ==================== */
    println("========== Lists ==========")
    val people2: MutableList<String> = mutableListOf()
    println(people2)

    // 1. Add to List: .add(<index>, <element>) or .add(<element>)
    people2.add(0, "Michael")
    people2.add("Adam")
    people2.add("Charles")
    people2.add(1, "Zion")
    people2.add("Brian")

    println(people1)

    // 2. Get from List: .get() or []
    println(people2.get(2)); // Adam
    println(people2[3]); // Brian

    // 3. Edit List: .set() or []
    people2.set(0, "MICHAEL");
    people2[2] = "ADAM";
    println(people2)

    // 4. Remove from List: .remove(<element>) or removeAt(<index>)
    people2.remove("Jenny") // Doesn't exist
    people2.removeAt(2);
    println(people2)
}