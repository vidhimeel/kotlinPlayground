package codechef

fun main() {

    val input = readln().split(" ")
    val a = input [0].toInt()
    val b = input [1].toInt()
    val c = input [2].toInt()

    if (a > b){
        println("a")
    }else if (b > c){
        println("b")
    }else { (c > a )
        println("c")
    }
    println()
}