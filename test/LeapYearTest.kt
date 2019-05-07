import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class LeapYearTest {
    @Test
    fun `should not be leap when is not multiple of 4`() {
        val validator = LeapYearValidator()

        val isLeap = validator.isLeap(1)

        assertFalse { isLeap }
    }
}