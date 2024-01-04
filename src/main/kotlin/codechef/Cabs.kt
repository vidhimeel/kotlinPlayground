package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val x = input[0].toInt()
        val y = input[1].toInt()

        println(if (x < y) "First" else if (x > y) "Second" else "Any")
    }
}