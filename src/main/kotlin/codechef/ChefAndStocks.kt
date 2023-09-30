package codechef

fun main(){
    val t = readln().toInt()
    repeat(t){
        val a = readln().toInt()
        val input = readln().split(" ").map{it.toInt()}
        var min = input[0]
        var sum = 0
        for(i in input){
            sum += i
            min = minOf(min,i)
        }
        println(sum - min)
    }
}
