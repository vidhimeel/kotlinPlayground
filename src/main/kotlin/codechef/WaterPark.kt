package codechef

fun main() {

    val input = readln().split(" ")
    val w = input[0].toInt()
    val h = input[1].toInt()

    if (w >= 60 && h <= 130) {
        println("YES")
    } else {
        println("NO")
    }

}

