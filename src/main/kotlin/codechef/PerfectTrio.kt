package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val a = input[0].toInt()
        val b = input[1].toInt()
        val c = input[2].toInt()

        if ((a == (b + c)) || (b == (a + c)) || (c == (b + a))) {
            println("YES")
        } else {
            println("NO")
        }
    }
}