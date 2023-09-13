package codechef

fun main() {

    val testCase = readln().toInt()

    repeat(testCase){

        val input = readln().split(" ")

        val a1= input[0].toInt()
        val a2 = input[1].toInt()
        val b1 = input[2].toInt()
        val b2 = input[3].toInt()

        val surplusA = (a1 - a2)
        val surplusB = (b1 - b2)

        val surplusC = (surplusA + surplusB)
        if( surplusC < 0 ){
            println("YES")
        } else {
            println("NO")
        }

    }
}