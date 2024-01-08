package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val n = input[0].toFloat()
        val x = input[1].toFloat()

        if(x*2 >= n) println("Yes")
        else println("No")
    }
}