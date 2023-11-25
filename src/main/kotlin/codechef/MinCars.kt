package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().toInt()

        if (input % 4 == 0) {
            val result = input / 4
            println(result)
        } else {
            val result = input / 4
            println(result + 1)
        }

    }

}