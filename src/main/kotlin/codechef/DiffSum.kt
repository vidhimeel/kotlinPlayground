package codechef

fun main() {

        val input = readln().split(" ")
        val n1 = input[0].toInt()
        val n2 = input[1].toInt()

        if (n1 > n2) {
            println(n1 - n2)
        } else {
            println(n1 + n2)
        }

}