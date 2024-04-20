package Behavioural.Decorator.Decorators

import Behavioural.Decorator.Components.VisualComponent

class TransparencyDecorator(
    val transparency: Int,
    component: VisualComponent
) : Decorator(component) {

    override fun view(): String {
        return super.view() + " with Transparency {$transparency}%..."
    }

}