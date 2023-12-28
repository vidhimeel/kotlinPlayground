package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val km = readln().toInt()

        if(km < 300){
            println(300*10)
        }else{
            println(km*10)
        }
    }
}