package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")

        val x = input[0].toInt()
        val y = input[1].toInt()
        val z = input[2].toInt()

        val perWallPrize = (x * y * 2)
        val totalWalls = (z/perWallPrize)

        println(totalWalls)
    }
}