package CDGCourses

class FootballMatch(var firstTeamScore: Int, var secondTeamScore: Int) {

    @JvmName("setFirstTeamScore1")
    fun setFirstTeamScore(score: Int) {
        firstTeamScore = score
    }

    @JvmName("setSecondTeamScore1")
    fun setSecondTeamScore(score: Int) {
        secondTeamScore = score
    }

    fun setGeneralScore(firstTeamNewScore: Int, secondTeamNewScore: Int) {
        firstTeamScore = firstTeamNewScore
        secondTeamScore = secondTeamNewScore
    }

    fun printMatches() {
        when (firstTeamScore) {
            1 -> print("First team has scored $firstTeamScore goal, ")
            else -> {
                print("First team has scored $firstTeamScore goals, ")
            }
        }
        when (secondTeamScore) {
            1 -> println("second team has scored $secondTeamScore goal")
            else -> {
                println("second team has scored $secondTeamScore goals")
            }
        }

    }

    fun simplePrint() {
        println("T1 - $firstTeamScore, T2 - $secondTeamScore. ")
    }


    fun getMatches() = "$firstTeamScore$secondTeamScore".toInt()

}
