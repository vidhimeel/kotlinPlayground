package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val n = readln().toInt()
        if ( n * 4 > 1000) {
            println("No")
        }else  {
            println("Yes")
        }

    }
}