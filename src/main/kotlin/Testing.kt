fun main() {
    val t = readln().toInt()

    repeat(t) {

        val input = readln().split(" ")
        val x = input[0].toInt()
        val y = input[1].toInt()

        val presses = Math.abs(y - x)
        println(presses)
    }
}



