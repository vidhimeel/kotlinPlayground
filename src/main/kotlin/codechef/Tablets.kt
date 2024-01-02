package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")

        val x = input[0].toInt()
        val y = input[1].toInt()

        if(x * 3 <= y){
            println("YES")
        }else {
            println("NO")
        }
    }
}