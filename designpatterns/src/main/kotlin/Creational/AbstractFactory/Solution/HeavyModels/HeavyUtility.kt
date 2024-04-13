package Creational.AbstractFactory.Solution.HeavyModels

import Creational.AbstractFactory.Models.Utility

class HeavyUtility(
    effect: String
): Utility(effect) {
    fun shield(): String {
        return "Shield from incoming damage"
    }
}