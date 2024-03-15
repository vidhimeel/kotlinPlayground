package codechef

fun main(){
    val t = readln().toInt()
    repeat(t){
        val(x, y) =readln().split(" ").map{it.toInt()}
        if(x < 50 ){
            println("Z")
        }else if(y  < 50 && x >= 50 ){
            println("F")
        }else{
            println("A")
        }
    }
}

