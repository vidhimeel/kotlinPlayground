package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")

        val a = input[0].toInt()
        val b = input[1].toInt()

        if(b >= a && b <= a+200){
            println("YES")
        }else{
            println("NO")
        }
    }
}