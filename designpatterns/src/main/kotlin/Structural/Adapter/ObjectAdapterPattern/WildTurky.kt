package Structural.Adapter.ObjectAdapterPattern

// "Adaptee Class" - an example of a Concrete Class implementing the "Adaptee" interface
class WildTurky : Turkey {
    override fun gobble() {
        println("Gobble Gobble Gobble")
    }

    override fun fly() {
        println("Turkey flap!")
    }

}