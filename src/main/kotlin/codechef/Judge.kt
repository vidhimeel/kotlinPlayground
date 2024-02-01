package codechef

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val judgesRes= readln().split(" ").map { it.toInt() }

        val count = judgesRes.count { it == 1 }

        if (count >= 4) {
            println("YES")
        } else {
            println("NO")
        }
    }
}