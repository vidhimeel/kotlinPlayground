package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().toInt()
        val result = (input * 24 * 1000)

        println(result)
    }
}
