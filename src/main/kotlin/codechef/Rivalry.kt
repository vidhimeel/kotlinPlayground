package codechef

fun main() {

    val input1 = readln().split(" ")

    val r1 = input1[0].toInt()
    val r2 = input1[1].toInt()

    val input2 = readln().split(" ")
    val d1 = input2[0].toInt()
    val d2 = input2[1].toInt()

    val result1 = (r1 + d1)
    val result2 = (r2 + d2)

    if (result1 > result2 ) {
        println("Dominate4r")
    } else {
        println("Everule")
    }

}

