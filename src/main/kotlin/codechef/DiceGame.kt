package codechef

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val n = readln().toInt()
        if (n % 2 != 0) {
            println(((n / 2) * 13) + 6)
        } else {
            println((n / 2) * 13)
        }
    }
}