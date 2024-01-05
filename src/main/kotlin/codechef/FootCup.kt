package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val a = input[0].toInt()
        val b = input[1].toInt()

        if (a > 0 && b > 0 && a == b) println("yes")
        else println("no")
    }
}


