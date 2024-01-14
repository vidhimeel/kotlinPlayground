package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")

        val k = input[0].toInt()
        val x = input[1].toInt()

        println(k - x)
    }
}

