package Creational.AbstractFactory.Solution.MediumModels

import Creational.AbstractFactory.Models.Weapon

class MediumWeapon(
    damage: Int,
    capacity: Int
) : Weapon(damage, capacity) {
    fun extraAmmo(): String {
        return "2 extra ammo reserve"
    }
}