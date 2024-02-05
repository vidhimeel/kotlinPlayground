package codechef

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val scores = readln().split(" ")

        if ("WWW" in scores.joinToString("")) {
            println("YES")
        } else {
            println("NO")
        }
    }
}
