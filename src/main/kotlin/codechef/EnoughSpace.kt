package codechef

fun main() {

    val testCase = readln().toInt()

    repeat(testCase) {
        val input = readln().split(" ")

        val n = input[0].toInt()
        val x = input[1].toInt()
        val y = input[2].toInt()

        if (n >= x+2*y){
            println("Yes")
        }else{
            println("No")
        }
    }
}