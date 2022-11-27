package baseball.controller

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
                val judgement = Judgement()
                val result = judgement.judge(player, computer)
                outputView.printResult(result)
            } while (result != THREE_STRIKE)
            outputView.printSuccessMent()
        } while (readCommand() == RETRY)
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

    companion object {
        const val RETRY = 1
        const val THREE_STRIKE = "3스트라이크"
    }
}
