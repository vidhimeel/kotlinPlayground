package codechef

fun main(){
    val a = readln().toInt()
    val b  = readln().toInt()

    val area = (a*b)
    val peri = 2*(a+b)
    if(area > peri){
    println("Area")
    println(area)
    } else if(area < peri){
    println("Peri")
    println(peri)
    } else {
    println("Eq")
    println(peri)
}
}