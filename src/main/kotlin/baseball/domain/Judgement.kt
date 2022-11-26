package baseball.domain

import baseball.view.OutputView

class Judgement {

    private val compare = Compare()
    private val outputView = OutputView()

    fun judge(player: List<Int>, computer: List<Int>) {
        val result = compare.countSamePlace(player, computer)
        if ((result[0] == 0) and (result[1] == 0)) outputView.printNothing()
        if ((result[0] == 0) and (result[1] != 0)) outputView.printStrike(result[1])
        if ((result[0] != 0) and (result[1] == 0)) outputView.printBall(result[0])
        if ((result[0] != 0) and (result[1] != 0)) outputView.printBallAndStrike(result[0], result[1])
    }
}