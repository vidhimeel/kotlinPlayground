package codechef

fun main() {

    val input = readln().split(" ")
    val a = input[0].toInt()
    val b = input[1].toInt()
    val c = input[2].toInt()

    val result1 = a * c
    val result2 = b * c

    if(result1 > result2){
        println(result1)
    }else{
        println(result2)
    }
}
