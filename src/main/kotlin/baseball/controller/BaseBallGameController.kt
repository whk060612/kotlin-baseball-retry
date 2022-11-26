package baseball.controller

import baseball.domain.Judgement
import baseball.domain.RandomNumberGenerator
import baseball.view.InputView
import baseball.view.OutputView
import java.lang.IllegalArgumentException

class BaseBallGameController {

    private val outputView = OutputView()
    private val inputView = InputView()
    var computer: List<Int>
    lateinit var player: List<Int>
    private val judgement = Judgement()

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
        val command = readCommand()
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