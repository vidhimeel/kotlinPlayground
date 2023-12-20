package codechef

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val n = readln().toInt()
        val result = zero(n)
        if (result) {
            println("YES")
        } else {
            println("NO")
        }
    }
}
fun zero(n: Int): Boolean {
    if (n == 0) {
        return true
    }
    if (n < 0) {
        return false
    }
    return zero(n - 3) || zero(n - 4)
}



