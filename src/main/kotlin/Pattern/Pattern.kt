package Pattern

fun main() {
    repeat(5){ i ->
        repeat(5){ j->

            val t = if (i+j==5-1) "*" else "-"

            print(t)
        }

        println()
    }

}

