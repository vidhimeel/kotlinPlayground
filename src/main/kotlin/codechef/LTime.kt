package codechef

fun main() {

    val testCase = readln().toInt()

    repeat(testCase) {
        val a = readln().toInt()

        if (a in 1..4) {
            println("YES")
        } else {
            println("NO")
        }

    }
}

