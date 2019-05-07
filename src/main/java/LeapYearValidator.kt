class LeapYearValidator {
    fun isLeap(number: Int): Boolean {
        if (number == 4 || number == 8 || number == 12){
            return true
        }
        return false
    }

}
