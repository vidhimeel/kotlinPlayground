package codechef

fun main() {

    val testCase = readln().toInt()

    repeat(testCase) {
        val input = readln().split(" ")

        val week = input[0].toInt()
        val days = input[1].toInt()

        println(week *7 - days)
        }
    }
