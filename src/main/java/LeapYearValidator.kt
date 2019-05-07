class LeapYearValidator {
    fun isLeap(number: Int): Boolean {
        if (isMultipleOf(number, 400)){
            return true
        }
        if (isMultipleOf(number, 100)){
            return false
        }
        return isMultipleOf(number, 4)
    }

    private fun isMultipleOf(number: Int, multipleOf: Int) = number % multipleOf == 0

}
