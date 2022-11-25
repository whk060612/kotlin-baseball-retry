package baseball

import camp.nextstep.edu.missionutils.Randoms

fun main() {
    val randomNumberGenerator = RandomNumberGenerator()
    val computer = randomNumberGenerator.generate()
    val baseBallGame = BaseBallGame(computer)
}

