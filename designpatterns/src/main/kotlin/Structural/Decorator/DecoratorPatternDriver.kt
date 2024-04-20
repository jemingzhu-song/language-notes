package Structural.Decorator

import Structural.Decorator.Components.ImageView
import Structural.Decorator.Components.TextView
import Structural.Decorator.Decorators.BorderDecorator
import Structural.Decorator.Decorators.TransparencyDecorator

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