package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")

        val a = input[0].toInt()
        val b = input[1].toInt()
        val c = input[2].toInt()

        if (a + b == c) {
            println("Yes")
        } else {
            println("No")
        }

    }
}
