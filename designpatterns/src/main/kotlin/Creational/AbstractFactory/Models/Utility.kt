package Creational.AbstractFactory.Models

open class Utility(
    var effect: String,
) {
    override fun toString(): String {
        return "Utility | Effect: $effect"
    }
}