fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val a = input[0].toInt()
        val b = input[1].toInt()
        val c = input[2].toInt()
        val d = input[3].toInt()

        if(a >= b+c+d){
            println(0)
        }else if(a >= b+d || a >= c+d){
            println(1)
        } else {
            println(2)
        }
    }
}