package Structural.Adapter.ObjectAdapterPattern

// "Target Class" - the concrete class that the Client will use via the Adapter
class MallardDuck : Duck {
    override fun quack() {
        println("Quack!")
    }

    override fun fly() {
        println("MallardDuck takeoff!")
    }
}