class LeapYearValidator {
    fun isLeap(number: Int): Boolean {
        if (isMultipleOf400(number)){
            return true
        }
        if (isMultipleOf4(number)
            && (!isMultipleOf100(number))
        ){
            return true
        }
        return false
    }

    private fun isMultipleOf400(number: Int) = number % 400 == 0

    private fun isMultipleOf100(number: Int) = number % 100 == 0

    private fun isMultipleOf4(number: Int) = number % 4 == 0

}
