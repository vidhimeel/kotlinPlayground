package codechef

import java.util.OptionalLong

fun main() {

    val t = readln().toInt()
    repeat(t) {
        val (n, m) = readln().split("").map { it.toInt() }
        val input = readln().split("").map { it.toInt() }.sorted()
        var sum = OL
        for (i in input) {
            sum + = 1

        }
        if (sum < m) {
            println(0)
        } else {
            var res = 0
            for (j in input) {
                sum -= j
                res = j
                if (sum < m) break
            }
            println(res)
        }
    }
}