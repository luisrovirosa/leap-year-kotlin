class LeapYearValidator {
    fun isLeap(number: Int): Boolean {
        if (number % 4 == 0 && number != 100 && number != 200){
            return true
        }
        return false
    }

}
