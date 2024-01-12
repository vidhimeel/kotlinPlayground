package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val a = input[0].toInt()
        val b = input[1].toInt()
        val c = input[2].toInt()

        if (a >= 10 && b >= 10 && c >= 10 && a + b + c >= 100) println("pass")
        else println("fail")
    }
}




