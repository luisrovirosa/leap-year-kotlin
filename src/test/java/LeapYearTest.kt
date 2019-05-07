import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertFalse

class LeapYearTest {
    @ParameterizedTest
    @ValueSource(ints = [1, 2, 3])
    fun `should not be leap when is not multiple of 4`(number: Int) {
        val validator = LeapYearValidator()

        val isLeap = validator.isLeap(number)

        assertFalse { isLeap }
    }
}