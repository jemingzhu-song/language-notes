package Behavioural.Decorator.Decorators

import Behavioural.Decorator.Components.VisualComponent

/*
    This Decorator adds a Border to the VisualComponent
*/
class BorderDecorator(
    val borderColor: String,
    val borderWidth: Int,
    component: VisualComponent
) : Decorator(component) {

    override fun view(): String {
        return super.view() + " with Border of ${borderWidth}px wide and $borderColor color..."
    }

}