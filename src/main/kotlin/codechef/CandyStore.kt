package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")
        val goal = input[0].toInt()
        val extra = input[1].toInt()

        if( goal < extra){
            println("${goal + (extra-goal) * 2}")
        }else if(goal == extra){
            println(goal)
        }else{
            println(extra)
        }

    }
}