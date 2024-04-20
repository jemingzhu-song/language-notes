package Behavioural.Decorator.Decorators

import Behavioural.Decorator.Components.VisualComponent

/*
    The "Decorator" is an Abstract Class that maintains a reference/field to the Component.

    The default implementation of the "Decorator" class's "VisualComponent" function is to just forward
    the request/function call to the VisualComponent reference/instance
*/

abstract class Decorator(val component: VisualComponent) : VisualComponent {
    override fun view(): String {
        return component.view()
    }
}