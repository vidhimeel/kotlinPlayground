package codechef
fun main() {
    val testCase = readln().toInt()
    repeat(testCase){

        val input = readln().split(" ")

        val a = input[0].toInt()
        val b = input[1].toInt()

        if (a > b){
            println(a - b)
        }else {
            println (0)
            }

        println()
    }

}
