package codechef

fun main() {

    val input = readln().split(" ")
    val x = input[0].toInt()
    val y = input[1].toInt()

    if (x < y) {
        print("INCREASED")
    } else if (x > y) {
        print("DECREASED")
    } else {
        print("SAME")
    }

    println()

}
