package Creational.AbstractFactory.Solution

import Creational.AbstractFactory.Models.Ability
import Creational.AbstractFactory.Models.Utility
import Creational.AbstractFactory.Models.Weapon
import Creational.AbstractFactory.Solution.HeavyModels.HeavyAbility
import Creational.AbstractFactory.Solution.HeavyModels.HeavyUtility
import Creational.AbstractFactory.Solution.HeavyModels.HeavyWeapon

class HeavyContestantFactory() : ContestantFactory() {
    override fun makeAbility(cooldown: Int): Ability {
        return HeavyAbility(cooldown)
    }

    override fun makeWeapon(damage: Int, capacity: Int): Weapon {
        return HeavyWeapon(damage, capacity)
    }

    override fun makeUtility(effect: String): Utility {
        return HeavyUtility(effect)
    }
}