package codechef

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val digit = readln().toInt()
        // isSingleDigit(digit)
       val isDouble = isDoubleDigit(digit)
           println(isDouble)

    }
}

fun isSingleDigit1 (digit: Int){
    if (digit / 10 < 1) {
        println("Single digit")
    } else {
        println("Double digit")
    }
}

fun isDoubleDigit (digit : Int): Boolean{

    if (digit / 10 >= 1){
       return true
    }else{
        return false
    }
}