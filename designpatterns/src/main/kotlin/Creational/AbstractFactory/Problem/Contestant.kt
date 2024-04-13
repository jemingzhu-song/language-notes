package Creational.AbstractFactory.Problem

import Creational.AbstractFactory.Models.ContestantBuild

class Contestant(
    var name: String,
    var rank: Rank,
    var contestantBuild: ContestantBuild,
) {
    enum class Rank {
        BRONZE,
        SILVER,
        GOLD,
        DIAMOND
    }
}