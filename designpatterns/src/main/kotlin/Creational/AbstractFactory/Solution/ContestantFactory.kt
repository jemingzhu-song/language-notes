package Creational.AbstractFactory.Solution

import Creational.AbstractFactory.Models.Ability
import Creational.AbstractFactory.Models.Utility
import Creational.AbstractFactory.Models.Weapon

// Can be Abstract Class as well (if you don't want a DEFAULT implementation of this factory)
open class ContestantFactory {
    open fun makeAbility(cooldown: Int): Ability {
        return Ability(cooldown)
    }

    open fun makeWeapon(damage: Int, capacity: Int): Weapon {
        return Weapon(damage, capacity)
    }

    open fun makeUtility(effect: String): Utility {
        return Utility(effect)
    }
}