package Creational.AbstractFactory.Solution.HeavyModels

import Creational.AbstractFactory.Models.Weapon

class HeavyWeapon(
    capaity: Int, damage: Int
) : Weapon(capaity, damage) {
    fun stability(): String {
        return "Shooting stability"
    }
}