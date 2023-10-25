package codechef

fun main() {

    val input1 = readln().split(" ")

    val n = input1[0].toInt()
    val m = input1[1].toInt()

    val input2 = readln().split(" " )
    val x = input2[0].toInt()
    val y = input2[1].toInt()

    val bones = (n * x)
    val blood = (m * y)

    println(bones + blood)
}




