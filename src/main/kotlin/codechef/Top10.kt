package codechef

fun main() {

    val testCase = readln().toInt()

    repeat(testCase){

        val input = readln().split(" ")

        val masterCafe = input[0].toInt()

        if (masterCafe <= 10 ){
            println("YES")
        } else {
            println ("NO")
        }

    }


}