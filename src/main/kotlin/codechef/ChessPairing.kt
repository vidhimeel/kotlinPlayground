package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val n = input[0].toInt()
        val x = input[1].toInt()

        val ratedPlayer = 2 * n
        val unratedPlayer = 2 * n - x

        val result = ratedPlayer - unratedPlayer


            println(result)
        }

    }

