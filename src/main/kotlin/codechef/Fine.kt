package codechef

fun main() {
    val t = readln().toInt()
    repeat(t){
        val speed = readln().toInt()

        if(speed <= 70){
            println("0")
        } else if(speed > 70 && speed <= 100){
            println("500")
        } else if(speed > 100){
            println("2000")
        }
    }
}