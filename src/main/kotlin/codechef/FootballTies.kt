package codechef

fun main() {
    val n = readln().toInt()
    repeat(n) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        if (a % 3 == 0) {
            println(0)
        } else {
            println(a % 3)
        }
    }
}