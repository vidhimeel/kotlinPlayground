package codechef

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (aliceScore, bobScore) = readln().split(" ").map { it.toInt() }
        val result =
            if (aliceScore >= bobScore + 10) 0
            else if ((bobScore + 10 - aliceScore) % 3 == 0) (bobScore + 10 - aliceScore)/3
            else  (bobScore + 10 - aliceScore)/3 +1

        println(result)
    }
}