package codechef

fun main() {
    val t = readln().toInt()
    for(i in 1..t) {
        val (n, x) = readln().split(' ').map{ it.toInt() }

        var count = 0
        var r = 0
        while(n - r >= (x*3)) {
            r += 3*x
            count += 1
        }
        println("$count")
    }
}