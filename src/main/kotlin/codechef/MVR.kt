package codechef

fun main() {

        val input = readln().split(" ")

        val x = input[0].toInt()*2 + input[1].toInt()*1
        val y = input[2].toInt()*2 + input[3].toInt()*1
        if (x > y) {
            println("Messi")
        } else if (x < y) {
            println("Ronaldo")
        } else {
            println("Equal")
        }

    }
