import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class LeapYearTest {
    @ParameterizedTest
    @ValueSource(ints = [1, 2, 3, 2001])
    fun `should not be leap when is not multiple of 4`(number: Int) {
        val validator = LeapYearValidator()

        val isLeap = validator.isLeap(number)

        assertFalse { isLeap }
    }

    @ParameterizedTest
    @ValueSource(ints = [4, 8, 12, 104, 1996])
    fun `should be leap when is multiple of 4 and not of 100`(number: Int) {
        val validator = LeapYearValidator()

        val isLeap = validator.isLeap(number)

        assertTrue { isLeap }
    }

    @ParameterizedTest
    @ValueSource(ints = [100, 200, 300, 500, 1900])
    fun `should not be leap when is multiple of 100 and not of 400`(number: Int) {
        val validator = LeapYearValidator()

        val isLeap = validator.isLeap(number)

        assertFalse { isLeap }
    }

    @ParameterizedTest
    @ValueSource(ints = [400, 800, 1200, 2000])
    fun `should be leap when is multiple of 400`(number: Int) {
        val validator = LeapYearValidator()

        val isLeap = validator.isLeap(number)

        assertTrue { isLeap }
    }
}