package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val a = input[0].toInt()*100
        val b = input[1].toInt()*10

        if (a>=b) println("cloth")
        else println("Disposable")
    }
}