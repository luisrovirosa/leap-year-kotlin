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

    private fun isMultipleOf400(number: Int) = number % 400 == 0

    private fun isMultipleOf100(number: Int) = number % 100 == 0

    private fun isMultipleOf4(number: Int) = number % 4 == 0

}
