package Creational.AbstractFactory.Solution

import Creational.AbstractFactory.Models.Ability
import Creational.AbstractFactory.Models.Utility
import Creational.AbstractFactory.Models.Weapon
import Creational.AbstractFactory.Solution.MediumModels.MediumAbility
import Creational.AbstractFactory.Solution.MediumModels.MediumUtility
import Creational.AbstractFactory.Solution.MediumModels.MediumWeapon

class MediumContestantFactory() : ContestantFactory() {
    override fun makeAbility(cooldown: Int): Ability {
        return MediumAbility(cooldown)
    }

    override fun makeWeapon(damage: Int, capacity: Int): Weapon {
        return MediumWeapon(damage, capacity)
    }

    override fun makeUtility(effect: String): Utility {
        return MediumUtility(effect)
    }
}