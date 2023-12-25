package codechef

fun main() {

        val input = readln().split(" ")

        val x = input[0].toInt()
        val y = input[1].toInt()

        if (x < y) {
            println("Old")
        } else if (x > y) {
            println("New")
        } else {
            println("Same")

        }
    }
