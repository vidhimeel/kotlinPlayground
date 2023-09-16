package codechef

fun main() {

    val x = readln().toInt()
    repeat(x) {
        val input = readln().split(" ")

        val a: Int = input[0].toInt()
        val b: Int = input[1].toInt()

        println(a - b)

    }
}