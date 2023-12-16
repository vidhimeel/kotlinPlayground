package codechef

fun main() {

    val testCase = readln().toInt()

    repeat(testCase) {
        val input = readln().split(" ")
        val a = input[0].toInt()
        val b = input[1].toInt()

        if(a/6==0){
            println(b)
        } else {
            if(a%6!=0){
                println(((a/6)+1)*b)
            }else{
                println(a/6*b)
            }

        }
    }
}