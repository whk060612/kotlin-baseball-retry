package baseball.controller

import baseball.domain.BaseBallGame
import baseball.domain.RandomNumberGenerator
import baseball.view.InputView
import baseball.view.OutputView
import java.lang.IllegalArgumentException

class BaseBallGameController {

    val outputView = OutputView()
    val inputView = InputView()
    val baseBallGame = BaseBallGame()
    lateinit var computer: List<Int>
    lateinit var player: List<Int>

    init {
        outputView.printStartMent()
        computer = RandomNumberGenerator().generate()
    }

    fun play() {
        readPlayerNumber()
        println(player)
    }

    fun readPlayerNumber() {
        outputView.printInputNumberMent()
        player = repeatInputProcess { inputView.readPlayerNumber() } as List<Int>
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