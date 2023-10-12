package codechef
fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val (x, y) = readln().split(" ").map { it.toInt() }

        val maxNeighbours = x / y

        if (maxNeighbours <= 20) {
            println(maxNeighbours)
        } else {
            println(20)
        }
    }
}