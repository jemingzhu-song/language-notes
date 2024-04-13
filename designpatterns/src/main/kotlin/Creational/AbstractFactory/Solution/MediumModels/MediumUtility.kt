package Creational.AbstractFactory.Solution.MediumModels

import Creational.AbstractFactory.Models.Utility

class MediumUtility(
    effect: String
) : Utility(effect) {
    fun fastCooldown(): String {
        return "Cooldown reduced by 5 seconds"
    }
}