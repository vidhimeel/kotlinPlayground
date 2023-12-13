fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val n = input[0].toFloat()
        val k = input[1].toFloat()

        val a = (Math.floor(n /(k + 1.0)).toInt())

        val b = ((n - a * k).toInt())
        println(b)

    }
}



