package Pattern

fun main() {
    val rows = 5

    for (i in rows downTo 1) {
        for (space in 1..rows - i) {
            print(" ")
        }
        for (j in 1..i){
            print("*")}
        println()

    }
}
