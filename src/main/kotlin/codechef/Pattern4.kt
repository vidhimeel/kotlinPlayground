package codechef


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
}

