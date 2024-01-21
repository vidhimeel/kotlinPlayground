package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val n = input[0].toInt()*2
        val m = input[1].toInt()*4

        println(n+m)
    }
}