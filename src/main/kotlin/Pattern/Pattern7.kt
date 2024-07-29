package Pattern

fun main() {
    repeat(5){ i ->
        repeat(5){ j->

        val t = if (i==0 || i==4 || j==0 || j==4) " * " else "   "

            print(t)
        }

            println()
    }

}