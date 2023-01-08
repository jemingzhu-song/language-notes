package OOP

/* ==================== Enum Classes ==================== */
/*
    Enum Classes in Kotlin are very similar to Enum Classes in Java
*/

enum class Difficulty {
    EASY,
    MEDIUM,
    HARD;

    /*
        This function uses the "name" property of an ENUM class, and allows us to format it
    */
    fun getFormattedName() {
        name.lowercase()
    }
}