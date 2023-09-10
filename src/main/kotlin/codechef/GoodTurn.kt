package codechef

fun main() {

    val testCase = readln().toInt()

    repeat(testCase){

        val input = readln().split(" ")

        val chefScore = input[0].toInt()
        val chefinaScore = input[1].toInt()

        if (chefScore + chefinaScore > 6 ){
            println("YES")
        } else {
            println("NO")
        }

    }


}