package baseball.view

private enum class Message(val message: String) {
    START_MENT("숫자 야구 게임을 시작합니다."),
    INPUT_NUMBER_MENT("숫자를 입력해주세요 : "),
    BALL("볼"),
    STRIKE("스트라이크"),
    NOTHING("낫싱")
}

class OutputView {
    fun printStartMent(){
        println(Message.START_MENT.message)
    }

    fun printInputNumberMent(){
        print(Message.INPUT_NUMBER_MENT.message)
    }

    fun printErrorMessage(message:String){
        println(message)
    }
}