package Creational.AbstractFactory.Solution.MediumModels

import Creational.AbstractFactory.Models.Ability

class MediumAbility(
    cooldown: Int
) : Ability(cooldown) {
    fun heal(): String {
        return "Healing!"
    }
}