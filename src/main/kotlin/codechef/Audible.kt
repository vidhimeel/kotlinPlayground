package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val x = readln().toInt()
        if (x < 67 || x > 45000) {
            println("No")
        }else  {
            println("YES")
        }

    }
}
