package codechef

fun main() {

    val cafeMeasured = readln().toInt()

    repeat(cafeMeasured){

        val input = readln().split(" ")

        val x= input[0].toInt()

        if (x < 100 ){
            println("YES")
        } else {
            println("NO")
        }

    }


}