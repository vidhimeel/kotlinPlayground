package Pattern

fun main() {
    val rows = 5

    for (i in 1..rows) {
        for (j in 1..i){
            print("*")
        }
        println()
    }
}