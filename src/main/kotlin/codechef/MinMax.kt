package codechef

import kotlin.math.min

fun main() {

    val testCase = readln().toInt()

    repeat(testCase) {

        val input = readln().split(" ")

        val a = input[0].toInt()
        val b = input[1].toInt()
        val c = input[2].toInt()

        val min = minOf(a, min(b,c))
        val max = maxOf(a, maxOf(b, c))
        val result = a + b + c - max + min

        println(result)

    }
}