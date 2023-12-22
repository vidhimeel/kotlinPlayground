package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")

        val n = input[0].toInt()
        val k= input[1].toInt()

        if ( n < k) {
            println("Yes")
        }else  {
            println("No")
        }

    }
}