package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")

        val a = input[0].toInt() * 2
        val b = input[1].toInt() * 5

        if(a>b){
            println("Chocolate")
        } else if(b>a){
            println("Candy")
        } else {
            println("Either")
        }
    }
}