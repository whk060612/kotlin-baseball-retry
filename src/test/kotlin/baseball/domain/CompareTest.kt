package baseball.domain

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class CompareTest {

    private val compare = Compare()
    private val computer = listOf(1, 2, 3)

    @Test
    fun `3스트라이크`() {
        val result = compare.countBallAndStrike(listOf(1, 2, 3), computer)
        assertThat(result).isEqualTo(listOf(0, 3))
    }

    @Test
    fun `1스트라이크 2볼`() {
        val result = compare.countBallAndStrike(listOf(3, 2, 1), computer)
        assertThat(result).isEqualTo(listOf(2, 1))
    }

    @Test
    fun 낫싱() {
        val result = compare.countBallAndStrike(listOf(4, 5, 6), computer)
        assertThat(result).isEqualTo(listOf(0, 0))
    }
}