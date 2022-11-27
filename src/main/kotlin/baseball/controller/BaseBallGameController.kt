package baseball.controller

import baseball.data.RETRY
import baseball.data.THREE_STRIKE
import baseball.domain.Judgement
import baseball.domain.RandomNumberGenerator
import baseball.view.InputView
import baseball.view.OutputView
import java.lang.IllegalArgumentException

class BaseBallGameController {

    private val outputView = OutputView()
    private val inputView = InputView()

    init {
        outputView.printStartMent()
    }

    fun play() {
        do {
            val computer = RandomNumberGenerator().generate()
            do {
                val player = readPlayerNumber()
                val result = judge(player, computer)
                outputView.printResult(result)
            } while (result != THREE_STRIKE)
            outputView.printSuccessMent()
        } while (readCommand() == RETRY)
    }

    private fun judge(player: List<Int>, computer: List<Int>): String {
        val judgement = Judgement()
        return judgement.judge(player, computer)
    }

    private fun readCommand(): Int {
        outputView.printInputCommandMent()
        return repeatInputProcess { inputView.readCommand() } as Int
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
