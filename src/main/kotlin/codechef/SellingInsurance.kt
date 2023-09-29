package codechef
fun main() {

    val t = readln().toInt()
    for (i in 1..t) {

        val x = readln().toInt()

        println(Math.ceil(100 / (x * 0.2)).toInt())
    }
}
