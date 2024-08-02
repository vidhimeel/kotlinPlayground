package Pattern

fun main() {
    val rows = 5
    var k = 0

    for (i in 1..rows) {
        for (space in 1..rows - i) {
            print("-")
        }

        print("*")

        while (k != 2 * i - 1) {
            if (i != 1)
            print("-")
            k++
        }
        if (i != 1)
        print("*")

        for (j in 1 downTo i - 3){
            print("-")}

        k = 2
        println()

    }
}
