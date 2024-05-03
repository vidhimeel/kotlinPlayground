package codechef

fun canBuyIceCreams(x: Int, y: Int): String {

    return if (y >= 2 * x) {
        "YES"
    } else {
        "NO"
    }
}

fun main() {

    val (x, y) = readln().split(" ").map { it.toInt() }

    println(canBuyIceCreams(y, x))
}