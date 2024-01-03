package codechef

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {

        val n = readln().toInt()

        var min = 0
        if (n%2==0){
            min = n/2
        }
        else{
            min = (n/2)+1
        }

        var max = n
        println("$min $max")
    }
}