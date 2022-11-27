package baseball.domain

import baseball.data.Result.*

class Judgement {

    fun judge(player: List<Int>, computer: List<Int>): String {
        val compare = Compare()
        val result = compare.countBallAndStrike(player, computer)
        if ((result[0] == 0) and (result[1] == 0)) return NOTHING.message
        if (result[0] == 0) return "${result[1]}${STRIKE.message}"
        if (result[1] == 0) return "${result[0]}${BALL.message}"
        return "${result[0]}${BALL.message} ${result[1]}${STRIKE.message}"
    }

}
