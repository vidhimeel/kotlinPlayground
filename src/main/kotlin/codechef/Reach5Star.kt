package codechef

fun willBecome5Star(x: Int, y: Int): String {
    return if (x + y >= 6000) "YES" else "NO"
}

fun main() {
    val (x, y) = readln().split(" ").map { it.toInt() }
    println(willBecome5Star(x, y))
}