package Creational.AbstractFactory

import Creational.AbstractFactory.Models.Ability
import Creational.AbstractFactory.Models.ContestantBuild
import Creational.AbstractFactory.Models.Utility
import Creational.AbstractFactory.Models.Weapon
import Creational.AbstractFactory.Problem.Contestant
import Creational.AbstractFactory.Solution.ContestantFactory

class Profile {
    fun createContestant(): Contestant {
        var contestant = Contestant(
            name = "Jeming",
            rank = Contestant.Rank.GOLD,
            contestantBuild = ContestantBuild()
        )

        // PROBLEM - This is NOT Flexible - what if you want different underlying implementations of
        // how a ContestantBuild is implemented?
        contestant.contestantBuild.assignAbility(
            Ability(20)
        )
        contestant.contestantBuild.assignWeapon(
            Weapon(45, 60)
        )
        contestant.contestantBuild.assignUtility(
            Utility("Explodes")
        )

        return contestant
    }

    fun createContestantWithFactory(factory: ContestantFactory): Contestant {
        var contestant = Contestant(
            name = "Jeming",
            rank = Contestant.Rank.GOLD,
            contestantBuild = ContestantBuild()
        )

        // SOLUTION - Use Factory Method - will create a Contestant depending on whether the
        // base ContestantFactory is passed in, a MediumContestantFactory, or HeavyContestantFactory
        val ability = factory.makeAbility(20)
        val weapon = factory.makeWeapon( 45, 60)
        val utility = factory.makeUtility("Explodes")

        contestant.contestantBuild.assignAbility(ability)
        contestant.contestantBuild.assignWeapon(weapon)
        contestant.contestantBuild.assignUtility(utility)

        return contestant
    }
}