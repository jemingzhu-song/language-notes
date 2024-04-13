package Creational.AbstractFactory.Solution.HeavyModels

import Creational.AbstractFactory.Models.Ability

class HeavyAbility(
    cooldown: Int
) : Ability(cooldown) {
    fun charge(): String {
        return "Charge!"
    }
}