package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().toInt()

        if(input > 20){
            println("Hot")
        }else{
            println("Cold")
        }
    }
}