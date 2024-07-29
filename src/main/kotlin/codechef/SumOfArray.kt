package codechef

fun main (){
    val input = intArrayOf(5,5,5,5,5,25)
    val AliceWin = canAliceWin(input)
    println(AliceWin)

}



fun canAliceWin(nums: IntArray): Boolean {
    var a = 0
    var b = 0

    for (number in nums){

        if (isSingleDigit(number)){
            a = a + number
        }else{
            b = b + number
        }
    }

    if (a == b){
        return false
    }else {
        return true
    }
}

fun isSingleDigit(number:Int) : Boolean{
    if (number/10 < 1){
        return true
    } else {
        return false
    }

}