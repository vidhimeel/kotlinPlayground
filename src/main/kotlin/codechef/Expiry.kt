package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val x = input[0].toInt()
        val y = input[1].toInt()
        val z = input[2].toInt()

        if(x <= y*z){
            println("YES")
        } else {
            println("NO")
        }
    }
}