package Structural.Adapter.ClassAdapterPattern

// "Adaptee" - the existing interface (the class in this case) that needs Adapting
open class TextView(val text: String) {
    fun displayText() {
        println("Text Displayed: $text")
    }
}