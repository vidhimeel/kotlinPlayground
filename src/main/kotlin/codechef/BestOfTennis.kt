package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val sonu = input[0].toInt()
        val titu = input[1].toInt()

        if (sonu > titu) {
            val result = (sonu + sonu - 1)
            println(result)
        }else {
            val result = (titu + titu - 1)
            println(result)
        }
    }
}
