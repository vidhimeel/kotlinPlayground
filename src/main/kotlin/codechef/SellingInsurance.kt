package codechef
fun main() {

    val t = readln().toInt()
    repeat(t) {

        val input = readln().split(" ")

        val x = readln().toInt()

        val a = input[0].toInt()
        println(Math.ceil(100 / (x * 0.2)).toInt())
    }
}
