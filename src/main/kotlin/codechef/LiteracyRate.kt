package codechef


fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val a = input[0].toInt()
        val b = input[1].toInt()
        val c = (b*100)/a
        if(c>=75){
            println("YES")
        } else {
            println("NO")
        }
    }
}