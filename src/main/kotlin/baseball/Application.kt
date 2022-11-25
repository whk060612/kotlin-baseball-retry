package baseball

import camp.nextstep.edu.missionutils.Randoms

fun main() {
    val randomNumberGenerator = RandomNumberGenerator()
    val computer = randomNumberGenerator.generate()
    val baseBallGame = BaseBallGame(computer)
}

fun generateComputerNumber(): List<Int> {
    val computer = mutableListOf<Int>()
    while (computer.size < 3) {
        val randomNumber = Randoms.pickNumberInRange(1, 9)
        if (!computer.contains(randomNumber)) {
            computer.add(randomNumber)
        }
    }
    return computer
}