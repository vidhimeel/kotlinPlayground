package codechef

fun main(){

    val t = readln().toInt()

    repeat(t){

        val x = readln().toInt()

        if(x<3){

            println("LIGHT")
        }else if(x>3 && x<7 || x==3){

            println("MODERATE")
        }else{
            println("HEAVY")
        }
    }
}