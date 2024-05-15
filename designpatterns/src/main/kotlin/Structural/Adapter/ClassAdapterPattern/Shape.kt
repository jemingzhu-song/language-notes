package Structural.Adapter.ClassAdapterPattern

// "Target" - the interface that the Client will use via the Adapter
interface Shape {
    fun draw(): Unit

    fun resize(): Unit
}