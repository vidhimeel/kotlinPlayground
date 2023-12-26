package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

    val x = readln().toInt()


    if(x<=3) println("BRONZE")
    else if(x<=6) println("SILVER")
    else println("GOLD")
}
}