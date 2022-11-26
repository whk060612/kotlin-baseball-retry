package baseball.view

private enum class Message(val message: String) {
    START_MENT("숫자 야구 게임을 시작합니다."),
    INPUT_NUMBER_MENT("숫자를 입력해주세요 : "),
    BALL("볼"),
    STRIKE("스트라이크"),
    NOTHING("낫싱"),
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

    fun printStrike(count: Int) {
        println("$count${Message.STRIKE.message}")
    }

    fun printBall(count: Int) {
        println("$count${Message.BALL.message}")
    }

    fun printBallAndStrike(ball: Int, strike: Int) {
        println("$ball${Message.BALL.message} $strike${Message.STRIKE.message}")
    }

    fun printNothing() {
        println(Message.NOTHING.message)
    }

    fun printSuccessMent() {
        println(Message.SUCCESS_MENT.message)
    }

    fun printInputCommandMent(){
        println(Message.INPUT_COMMAND_MENT.message)
    }
}