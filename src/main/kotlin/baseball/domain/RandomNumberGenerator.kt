package baseball.domain

import baseball.data.MAXIMUM_NUMBER
import baseball.data.MINIMUM_NUMBER
import baseball.data.SIZE
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
}
