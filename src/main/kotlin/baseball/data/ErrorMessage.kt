package baseball.data

enum class ErrorMessage(val message: String) {
    ILLEGAL_NUMBER("1부터 9사이의 숫자를 입력해주세요."),
    DUPLICATE("중복 없이 입력해주세요."),
    ILLEGAL_SIZE("숫자 세 개를 입력해주세요."),
    ILLEGAL_COMMAND("1 또는 2 를 입력해주세요.")
}