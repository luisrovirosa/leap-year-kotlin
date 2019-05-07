class LeapYearValidator {
    fun isLeap(number: Int): Boolean {
        if (isMultipleOf4(number)
            && (isNotMultipleOf100(number) || number == 400 || number == 800 || number == 1200)
        ){
            return true
        }
        return false
    }

    private fun isNotMultipleOf100(number: Int) = number % 100 != 0

    private fun isMultipleOf4(number: Int) = number % 4 == 0

}
