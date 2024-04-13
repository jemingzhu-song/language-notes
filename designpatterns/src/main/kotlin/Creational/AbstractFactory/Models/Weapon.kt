package Creational.AbstractFactory.Models

open class Weapon(
    var damage: Int,
    var capacity: Int
) {
    override fun toString(): String {
        return "Weapon | Damage: $damage Capacity: $capacity"
    }
}