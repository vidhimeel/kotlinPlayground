package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().toInt()
        var numberOfTimes = input/7
        if (input % 7 > 1) {
            numberOfTimes +=  1
        }
        println(numberOfTimes)
    }
}
