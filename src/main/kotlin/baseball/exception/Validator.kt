package baseball.exception

import baseball.data.*
import baseball.data.ErrorMessage.*
import java.lang.IllegalArgumentException

class Validator {
    fun checkPlayerNumber(input: String): List<Int> {
        val numbers = mutableListOf<Int>()
        for (char in input) {
            val number = char.digitToIntOrNull() ?: throw IllegalArgumentException(ILLEGAL_NUMBER.message)
            if (number in numbers) throw IllegalArgumentException(DUPLICATE.message)
            if ((number < MINIMUM_NUMBER) or (number > MAXIMUM_NUMBER)) throw IllegalArgumentException(ILLEGAL_NUMBER.message)
            numbers.add(number)
        }
        if (numbers.size != SIZE) throw IllegalArgumentException(ILLEGAL_SIZE.message)
        return numbers
    }

    fun checkCommand(input: String): Int {
        val command = input.toIntOrNull() ?: throw IllegalArgumentException(ILLEGAL_COMMAND.message)
        if ((command != RETRY) and (command != QUIT)) throw IllegalArgumentException(ILLEGAL_COMMAND.message)
        return command
    }
}
