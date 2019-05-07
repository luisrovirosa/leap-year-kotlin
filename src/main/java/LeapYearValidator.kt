class LeapYearValidator {
    fun isLeap(number: Int): Boolean {
        if (number % 4 == 0){
            return true
        }
        return false
    }

}
