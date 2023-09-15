package codechef

fun main() {

    val testCase = readln().toInt()

    repeat(testCase) {
        val input = readln().split(" ")
        val a = input[0].toInt()
        if (a > 100 ){
            println(a - 10)
        } else {
            println(a)
        }

    }

}


