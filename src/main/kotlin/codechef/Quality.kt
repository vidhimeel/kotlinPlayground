package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val x = input[0].toInt()
        val a = input[1].toInt()
        val b = input[2].toInt()

        if(x <= a+(2*b)){
            println("Qualify")
        }else{
            println("NotQualify")
        }
    }
}