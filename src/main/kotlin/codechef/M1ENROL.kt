package codechef

fun main(){

    val t: Int = readln().toInt()

    repeat(t){

        val(x, y) = readln().split(" ").map{it.toInt()}

        val seats = y-x

        if(x>y){
            println("0")
        }else{
            println(seats)
        }
    }
}