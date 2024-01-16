package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val a = input[0].toInt()
        val b = input[1].toInt()
        val c = input[2].toInt()

        if(a+b > c && a!=b && a!= c && b!=c) {
            println("YES")
        } else {
            println("NO")
        }
    }
}