package baseball.view

import baseball.data.OutputMessage.*

class OutputView {
    fun printStartMent() {
        println(START_MENT.message)
    }

    fun printInputNumberMent() {
        print(INPUT_NUMBER_MENT.message)
    }

    fun printErrorMessage(message: String) {
        println(message)
    }

    fun printResult(result: String) {
        println(result)
    }

    fun printSuccessMent() {
        println(SUCCESS_MENT.message)
    }

    fun printInputCommandMent() {
        println(INPUT_COMMAND_MENT.message)
    }
}
