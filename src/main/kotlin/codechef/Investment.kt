package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")

        val x = input[0].toInt()
        val y = input[1].toInt()

        if(x>=(2*y)){
            println("yes")
        }
        else{
            println("no")
        }
    }
}