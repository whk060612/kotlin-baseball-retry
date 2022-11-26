package baseball.view

import baseball.exception.Validator
import camp.nextstep.edu.missionutils.Console

class InputView {

    val validator = Validator()

    fun readPlayerNumber(): List<Int> {
        val input = Console.readLine()
        return validator.checkPlayerNumber(input)
    }

    fun readCommand(): Int {
        val input = Console.readLine()
        return validator.checkCommand(input)
    }
}