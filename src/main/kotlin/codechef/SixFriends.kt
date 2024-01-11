package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")

        val x = input[0].toInt()*3
        val y = input[1].toInt()*2


        println(minOf(x, y))
    }
}