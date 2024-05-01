package Structural.Adapter.ClassAdapterPattern

fun main() {
    // Create instance of the "Target Class"
    val circle = Circle("Red")

    // Invoking the "Target Class's" methods as expected
    circle.draw()
    circle.resize()

    // Create instance of the Adapter (TextShape)
    val textShape = TextShape("A quick brown fox jumped over the lazy dog")

    // Invoking the Adapter's methods (which should behave and adapt to the "Target Class's" methods)
    // TextShape is actually of a "TextView" class, but since it has been "adapted", we can invoke
    // "Shape" class methods on it.
    textShape.draw()
    textShape.resize()
}