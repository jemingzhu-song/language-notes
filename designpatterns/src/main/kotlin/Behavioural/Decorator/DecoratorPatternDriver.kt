package Behavioural.Decorator

import Behavioural.Decorator.Components.ImageView
import Behavioural.Decorator.Components.TextView
import Behavioural.Decorator.Decorators.BorderDecorator
import Behavioural.Decorator.Decorators.TransparencyDecorator

fun main() {
    // Create a "TextView" plain POJO
    val textViewPlain = TextView()
    println(textViewPlain.view())

    // Create a "TextView" with a Border
    val textViewBorder = BorderDecorator(
        borderColor = "Red",
        borderWidth = 5,
        component = TextView()
    )
    println(textViewBorder.view())

    // Create an "ImageView" with a Border AND make it Transparent
    val imageViewBorderAndTransparent = TransparencyDecorator(
        transparency = 20,
        component = BorderDecorator(
            borderColor = "Black",
            borderWidth = 10,
            component = ImageView()
        )
    )
    println(imageViewBorderAndTransparent.view())
}