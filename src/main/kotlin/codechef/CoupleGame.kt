package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")

        val g = input[0].toInt()
        val b = input[1].toInt()

        println(b - g)
    }
}
