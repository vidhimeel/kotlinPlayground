package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().toInt()

        val result = input - input / 5
        println(result)
    }
}
