package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val a = input[0].toInt()*10
        val b = input[1].toInt()
        val c = input[2].toInt()

        if(a>b){
            println(b*c)
        }else{
            println(a*c)
        }
    }
}