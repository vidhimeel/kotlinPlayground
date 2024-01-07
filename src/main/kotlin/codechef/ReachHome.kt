package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val fuel = input[0].toInt()
        val km = input[1].toInt()

        if((fuel*5)>=km){
            println("Yes")
        }
        else{
            println("No")
        }

    }
}