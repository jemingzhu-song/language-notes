package OOP

/* ==================== Getters and Setters ==================== */
// https://www.programiz.com/kotlin-programming/getters-setters

public class iPhone(model: Int, name: String) {
    var model: Int = model
    var name: String = name
    /*
        The following code "var name: String = name" shown above is equivalent to:
    */
        get() = field
        set(value) {
            field = value
        }

}