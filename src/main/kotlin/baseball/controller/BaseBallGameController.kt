package baseball.controller

import baseball.domain.Judgement
import baseball.domain.RandomNumberGenerator
import baseball.view.InputView
import baseball.view.OutputView
import java.lang.IllegalArgumentException

class BaseBallGameController {

    val outputView = OutputView()
    val inputView = InputView()
    var computer: List<Int>
    lateinit var player: List<Int>
    val judgement = Judgement()

    init {
        outputView.printStartMent()
        computer = RandomNumberGenerator().generate()
    }

    fun play() {
        do {
            player = readPlayerNumber()
            judgement.judge(player, computer)
        } while (player != computer)
        outputView.printSuccessMent()
    }

    private fun readPlayerNumber(): List<Int> {
        outputView.printInputNumberMent()
        return repeatInputProcess { inputView.readPlayerNumber() } as List<Int>
    }

    private fun repeatInputProcess(operation: () -> Any): Any {
        do {
            try {
                return operation()
            } catch (e: IllegalArgumentException) {
                outputView.printErrorMessage(e.message.toString())
            }
        } while (true)
    }
}