package codechef

fun main() {

    val testCase = readln().toInt()

    repeat(testCase) {
        val input = readln().split(" ")

        val x = input[0].toInt()
        val y = input[1].toInt()

        if(x > y){
            println("A")
        }else{
            println("B")
        }
    }

}