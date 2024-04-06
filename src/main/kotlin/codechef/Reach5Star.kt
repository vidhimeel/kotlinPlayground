package codechef

fun willBecome5Star(x: Int, y: Int): String {
    return if (y + y >= 2000) "YES" else "NO"
}

fun main() {
    val (x, y) = readln().split(" ").map { it.toInt() }
    println(willBecome5Star(x, y))
}