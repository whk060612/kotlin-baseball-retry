package baseball.domain

class Compare {

    fun countSamePlace(player: List<Int>, computer: List<Int>): List<Int> {
        var strike = 0
        val count = countSameNumber(player, computer)
        for ((index, number) in player.withIndex()) {
            if (number == computer.get(index)) strike += 1
        }
        val ball = count - strike
        return listOf(ball, strike)
    }

    private fun countSameNumber(player: List<Int>, computer: List<Int>): Int {
        var count = 0
        for (number in player) {
            if (number in computer) count += 1
        }
        return count
    }
}