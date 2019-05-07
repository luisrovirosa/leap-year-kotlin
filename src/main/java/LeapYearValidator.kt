class LeapYearValidator {
    fun isLeap(number: Int): Boolean {
        if (isMultipleOf400(number)){
            return true
        }
        if (isMultipleOf100(number)){
            return false
        }
        return isMultipleOf4(number)
    }

    private fun isMultipleOf400(number: Int): Boolean = isMultipleOf(number, 400)

    private fun isMultipleOf100(number: Int) = isMultipleOf(number, 100)

    private fun isMultipleOf4(number: Int) = isMultipleOf(number, 4)

    private fun isMultipleOf(number: Int, multipleOf: Int) = number % multipleOf == 0

}
