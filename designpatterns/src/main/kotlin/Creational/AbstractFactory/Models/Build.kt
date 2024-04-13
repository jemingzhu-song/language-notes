package Creational.AbstractFactory.Models

class ContestantBuild() {
    var weapon: Weapon? = null
    var ability: Ability? = null
    var utility: Utility? = null

    fun assignWeapon(weapon: Weapon) {
        this.weapon = weapon
    }

    fun assignAbility(ability: Ability) {
        this.ability = ability
    }

    fun assignUtility(utility: Utility) {
        this.utility = utility
    }

    override fun toString(): String {
        return "Contestant: Weapon: $weapon | Ability: $ability | Utility: $utility"
    }
}