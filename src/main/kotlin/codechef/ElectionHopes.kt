package codechef

fun main() {

    val input = readln().split(" ")
    val x = input[0].toInt()
    val y = input[1].toInt()

    if (x >= y*2) {
        println("YES")
    } else {
        println("NO")
    }
}