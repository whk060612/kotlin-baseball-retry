package baseball.view

private enum class Message(val message: String) {
    START_MENT("숫자 야구 게임을 시작합니다."),
    INPUT_NUMBER_MENT("숫자를 입력해주세요 : "),
    SUCCESS_MENT("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    INPUT_COMMAND_MENT("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
}

class OutputView {
    fun printStartMent() {
        println(Message.START_MENT.message)
    }

    fun printInputNumberMent() {
        print(Message.INPUT_NUMBER_MENT.message)
    }

    fun printErrorMessage(message: String) {
        println(message)
    }

    fun printResult(result: String) {
        println(result)
    }

    fun printSuccessMent() {
        println(Message.SUCCESS_MENT.message)
    }

    fun printInputCommandMent() {
        println(Message.INPUT_COMMAND_MENT.message)
    }
}
