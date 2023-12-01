package codechef

fun main() {

        val input = readln().split(" ")
        val a = input[0].toInt()
        val b = input[1].toInt()

        if (a == 1 && b == 1) {
            println("https://discuss.codechef.com")
        } else if (a == 0) {
            println("https://www.codechef.com/practice")
        } else if (a == 1) {
            println("https://www.codechef.com/contests")
        }
    }
