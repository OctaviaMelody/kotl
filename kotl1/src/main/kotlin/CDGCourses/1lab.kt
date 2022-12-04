package CDGCourses


fun main() {
    val testList = arrayListOf<FootballMatch>()
    val matchesList: MutableList<FootballMatch> = arrayListOf()
    val matchMaxSetTemp: MutableSet<FootballMatch> = mutableSetOf()
    val matchMaxSet: MutableSet<FootballMatch> = mutableSetOf()
    val firstMatch = FootballMatch(0,0)

    firstMatch.setFirstTeamScore(3)
    firstMatch.setSecondTeamScore(5)
    firstMatch.setGeneralScore(5,5)
    testList.add(firstMatch)

    for (index in 1..100) {
        testList.add(FootballMatch((0..5).random(), (0..5).random()))
    }

    println("10 elements without modifying")

    for (element in testList) {
        element.printMatches()
    }

    for (element in testList) {
        if (element.firstTeamScore != element.secondTeamScore) {
            matchesList.add(element)
        }
    }

    println("////////////////////////////////////////////")
    println("Matches without same score")

    for (element in matchesList) {
        element.printMatches()
    }

    var max = 0

    for (index in 0 until matchesList.size) {                //проверка на максимальный элемент с помощью модуля
        if (kotlin.math.abs(matchesList[index].firstTeamScore - matchesList[index].secondTeamScore) > max) {
            max = kotlin.math.abs(matchesList[index].firstTeamScore - matchesList[index].secondTeamScore)
        }
    }

    var i = 0

    do {                                                          //запись во множество всех элементов с максимальным разрывом
        if (kotlin.math.abs(matchesList[i].firstTeamScore - matchesList[i].secondTeamScore) == max) {
            matchMaxSetTemp.add(matchesList[i])
        }
        i++
    } while (i != matchesList.size)

    println("////////////////////////////////////////////")
    println("Elements with max score difference")

    for (element in matchMaxSetTemp) {
        element.simplePrint()
    }

    for (index in 0 until matchMaxSetTemp.size) {          //проверка на одинаковые элементы с разным кодом
        if (matchMaxSet.size <= 0) {
            matchMaxSet.add(matchMaxSetTemp.elementAt(index))
        }
        for (indexJ in 0 until matchMaxSet.size) {
            if (matchMaxSet.size > 1) {
                if (matchMaxSetTemp.elementAt(index).getMatches() == matchMaxSet.elementAt(indexJ)
                        .getMatches() && matchMaxSetTemp.elementAt(index).getMatches() == matchMaxSet.elementAt(indexJ)
                        .getMatches()
                ) {
                    continue
                }
            }
            if (matchMaxSet.size == 1) {
                if (matchMaxSetTemp.elementAt(index).getMatches() == matchMaxSet.elementAt(indexJ).getMatches()) {
                    continue
                } else {
                    matchMaxSet.add(matchMaxSetTemp.elementAt(index))

                }
            }
        }
    }

    println("////////////////////////////////////////////")
    println("Set of max score difference")

    for (element in matchMaxSet) {
        element.simplePrint()
    }
}



