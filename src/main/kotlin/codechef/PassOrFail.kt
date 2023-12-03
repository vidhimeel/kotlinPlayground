package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val n = input[0].toInt()
        val x = input[1].toInt()
        val p = input[2].toInt()

        if ((x * 3) - (n - x) >= p) {
            println("Pass")
        } else {
            println("Fail")
        }
    }
}