package Structural.Adapter.ObjectAdapterPattern

import Structural.Adapter.ClassAdapterPattern.Circle
import Structural.Adapter.ClassAdapterPattern.TextShape

fun main() {
    // Create instance of the "Target Class"
    val mallardDuck = MallardDuck()

    // Invoking the "Target Class's" methods as expected
    mallardDuck.fly()
    mallardDuck.quack()

    // Create instance of the "Adaptee Class"
    val wildTurky = WildTurky()
    // Create instance of the Adapter (TurkeyAdapter)
    val turkeyAdapter = TurkeyAdapter(wildTurky)

    // Invoking the Adapter's methods (which should behave and adapt to the "Target Class's" methods)
    // TurkeyAdapter is actually of a "Turkey" class, but since it has been "adapted", we can invoke
    // "Duck" class methods on it.
    turkeyAdapter.fly()
    turkeyAdapter.quack()
}