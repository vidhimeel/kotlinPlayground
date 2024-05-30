package codechef

fun main() {

    val input = readln().split(" ")
    val x = input[0].toInt()
    val y = input[1].toInt()

    val result = 2*(x + y)
    if ( result == 2*(x+y)) {
        println("YES")
    } else {
        println("NO")
    }
}
