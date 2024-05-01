package Structural.Adapter.ObjectAdapterPattern

// "Target" - the interface that the Client will use via the Adapter
interface Duck {
    fun quack(): Unit

    fun fly(): Unit
}