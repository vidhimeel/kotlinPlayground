package Pattern

fun main() {
    val input = readln().split(" ")
    val a = input[0].toInt()
    val b = input[1].toInt()
    val c = input[2].toInt()
    val d = input[3].toInt()

   /* val x = input.map { it.toInt() }
    for(d in x){
        var count = 0
        if (d > D){
            count++
        }
    }*/

    val cuboid = a*b*c
    val cube = d*d*d

    if (cuboid > cube){
        print("cuboid" )
    }else if (cube > cuboid){
        print("cube")
    }else {
        print("equal")
    }

    println()

}
