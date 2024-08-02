package Pattern

fun main() {
    val rows = 5

    for (i in 1..rows) {
        for (space in 1..rows - i) {
            print(" ")
        }
        for (j in 1..i){
            print("*")}
        println()

    }

    for (i in 4 downTo 1) {
        for (space in 1..5 - i) {
            print(" ")
        }
        for (j in 1..i ){
            print("*")}
        println()

    }
}