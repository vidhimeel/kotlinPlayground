package codechef
fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val n = readln().toInt()
        if ( (n == 1 || n % 2 == 0)) {
            println("Yes")
        }else  {
            println("No")
        }

    }
}

