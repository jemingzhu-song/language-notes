package Structural.Adapter.ClassAdapterPattern

// "Adapter" - adapts the interface of Adaptee (TextView) to the Target using multiple inheritence
class TextShape(text: String) : TextView(text), Shape {
    override fun draw() {
        // We can override the Adaptee's functions
        println("Drawing a TextShape")
        // We delegate to the Adaptee's method
        super.displayText()
    }

    override fun resize() {
        // We can override the Adaptee's functions - in this case, the Adaptee doesn't have a
        // corresponding "resize()" method behaviour, so we need to implement/handle this behaviour
        // ourselves
        println("Resizing the Text")
    }
}