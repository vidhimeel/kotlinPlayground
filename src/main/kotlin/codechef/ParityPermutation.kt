package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase){

        val input = readln().split(" ")

        val a1 = input[0].toInt()
        val a2 = input[1].toInt()

        println((a1 - a2)%2)
    }
}
