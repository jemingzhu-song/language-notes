package Structural.Adapter.ClassAdapterPattern

// "Target Class" - the concrete class that the Client will use via the Adapter
class Circle(val color: String) : Shape {
    override fun draw() {
        println("Drawing a Circle")
    }

    override fun resize() {
        println("Resizing the Circle")
    }
}