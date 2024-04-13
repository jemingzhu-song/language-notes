package Creational.AbstractFactory

import Creational.AbstractFactory.Solution.ContestantFactory
import Creational.AbstractFactory.Solution.HeavyContestantFactory
import Creational.AbstractFactory.Solution.HeavyModels.HeavyAbility
import Creational.AbstractFactory.Solution.HeavyModels.HeavyUtility
import Creational.AbstractFactory.Solution.HeavyModels.HeavyWeapon
import Creational.AbstractFactory.Solution.MediumContestantFactory
import Creational.AbstractFactory.Solution.MediumModels.MediumAbility
import Creational.AbstractFactory.Solution.MediumModels.MediumUtility
import Creational.AbstractFactory.Solution.MediumModels.MediumWeapon

fun main() {
    val profile = Profile()

    // No Factory Method
    val contestantNoFactory = profile.createContestant()

    println(contestantNoFactory.contestantBuild.toString())

    // Using Factory
    val normalContestant = profile.createContestantWithFactory(
        ContestantFactory()
    )

    println(normalContestant.contestantBuild.ability)
    println(normalContestant.contestantBuild.weapon)
    println(normalContestant.contestantBuild.utility)

    val mediumContestant = profile.createContestantWithFactory(
        MediumContestantFactory()
    )

    println((mediumContestant.contestantBuild.ability as MediumAbility).heal())
    println((mediumContestant.contestantBuild.weapon as MediumWeapon).extraAmmo())
    println((mediumContestant.contestantBuild.utility as MediumUtility).fastCooldown())

    val heavyContestant = profile.createContestantWithFactory(
        HeavyContestantFactory()
    )

    println((heavyContestant.contestantBuild.ability as HeavyAbility).charge())
    println((heavyContestant.contestantBuild.weapon as HeavyWeapon).stability())
    println((heavyContestant.contestantBuild.utility as HeavyUtility).shield())
}