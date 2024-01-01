package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")

        val a = input[0].toInt()
        val b = input[1].toInt()

        val max = maxOf(a,b)
        println(7-max)
    }
}

