package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val n = readln().toInt()
        if ( n % 3 == 0) {
            println("Yes")
        }else  {
            println("No")
        }

    }
}