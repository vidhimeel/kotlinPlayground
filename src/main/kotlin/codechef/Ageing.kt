package codechef

fun main() {

    val testCase = readln().toInt()

    repeat(testCase) {
        val input = readln().split(" ")
        val a = input[0].toInt()
        val b = input[1].toInt()

        if (a < b) {
            print("Profit")
        } else if (a > b) {
            print("Loss")
        } else {
            print("Neutral")
        }

        println()

    }
}



