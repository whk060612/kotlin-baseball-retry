package baseball.domain

import camp.nextstep.edu.missionutils.Randoms

class RandomNumberGenerator {
    fun generate(): List<Int> {
        val computer = mutableListOf<Int>()
        while (computer.size < SIZE) {
            val randomNumber = Randoms.pickNumberInRange(MINIMUM_NUMBER, MAXIMUM_NUMBER)
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber)
            }
        }
        return computer
    }

    companion object {
        const val MINIMUM_NUMBER = 1
        const val MAXIMUM_NUMBER = 9
        const val SIZE = 3
    }
}
