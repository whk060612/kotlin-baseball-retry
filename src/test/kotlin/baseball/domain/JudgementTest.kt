package baseball.domain

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class JudgementTest {
    val judgement = Judgement()
    val computer = listOf(1, 2, 3)

    @Test
    fun `3스트라이크`() {
        val result = judgement.judge(listOf(1, 2, 3), computer)
        assertThat(result).isEqualTo("3스트라이크")
    }

    @Test
    fun `2볼 1스트라이크`() {
        val result = judgement.judge(listOf(3, 2, 1), computer)
        assertThat(result).isEqualTo("2볼 1스트라이크")
    }

    @Test
    fun 낫싱() {
        val result = judgement.judge(listOf(4, 5, 6), computer)
        assertThat(result).isEqualTo("낫싱")
    }
}