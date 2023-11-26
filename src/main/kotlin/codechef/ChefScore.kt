package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val a = input[0].toInt()
        val b = input[1].toInt()
        val c = input[2].toInt()

        if ((a*b)%b == 0 && (c%b) == 0){
            println("Yes")
        }else{
            println("No")
        }
    }
}