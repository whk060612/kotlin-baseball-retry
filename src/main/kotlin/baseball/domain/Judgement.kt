package baseball.domain

class Judgement {

    private val compare = Compare()

    fun judge(player: List<Int>, computer: List<Int>): String {
        val result = compare.countBallAndStrike(player, computer)
        if ((result[0] == 0) and (result[1] == 0)) return Result.NOTHING.message
        if (result[0] == 0) return "${result[1]}${Result.STRIKE.message}"
        if (result[1] == 0) return "${result[0]}${Result.BALL.message}"
        return "${result[0]}${Result.BALL.message} ${result[1]}${Result.STRIKE.message}"
    }

    enum class Result(val message: String) {
        BALL("볼"),
        STRIKE("스트라이크"),
        NOTHING("낫싱")
    }
}