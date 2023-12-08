package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().toInt()

        val x = input % 4

        if (x == 2) {
            println("YES")
        } else {
            println("NO")
        }
    }
}

