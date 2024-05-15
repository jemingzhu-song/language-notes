package Structural.Adapter.ObjectAdapterPattern

// "Adapter" - adapts the interface of Adaptee (Turkey) to the Target using multiple inheritence
class TurkeyAdapter(
    val turkey: Turkey // Maintains a reference to the "Adaptee" class
) : Duck {
    override fun quack() {
        // Turkeys don't quack, they Gobble, so we delegate/forward this logic to the "turkey" instance
        turkey.gobble()
    }

    override fun fly() {
        // Turkeys can't fly very long distances, so it only flies for 5 flaps
        for (i in 0..5) {
            turkey.fly()
        }
    }

}