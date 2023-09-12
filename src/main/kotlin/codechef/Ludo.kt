package codechef

fun main() {

    val testCase = readln().toInt()

    repeat(testCase){

        val input = readln().split(" ")

        val ludo = input[0].toInt()

        if (ludo >= 6 ){
            println("YES")
        } else {
            println("NO")
        }

    }


}