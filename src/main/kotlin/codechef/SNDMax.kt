package codechef

fun main() {
    val testcase = readln().toInt()
    repeat(testcase){

        println(
            readln().split(" ").map { it.toInt() }.sorted()[1]
        )

    }

}