fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val r1 = input[0].toInt()
        val r2 = input[1].toInt()
        val r3 = input[2].toInt()
        val r4 = input[3].toInt()
        val r5 = input[4].toInt()

        if (r1 == 1 || r2 == 1 || r3 == 1 || r4 == 1 || r5 == 1) {
            println("yes")
        } else {
            println("no")
        }
    }
}



