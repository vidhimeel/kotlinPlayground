package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")

        val x = input[0].toInt()
        val p = input[1].toInt()
        val q = input[2].toInt()

        println((p - q) * x)
    }
}
