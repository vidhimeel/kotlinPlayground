package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val x = readln().toInt()

        if(x < 4){
            println("MILD")
        } else if(x >= 4 && x < 7){
            println("MEDIUM")
        } else if(x >= 7){
            println("HOT")
        }
    }
}
