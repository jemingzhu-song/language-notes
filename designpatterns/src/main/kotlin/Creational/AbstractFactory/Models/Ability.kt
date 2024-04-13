package Creational.AbstractFactory.Models

open class Ability(
    var cooldown: Int
) {
    override fun toString(): String {
        return "Ability | Cooldown: $cooldown"
    }
}