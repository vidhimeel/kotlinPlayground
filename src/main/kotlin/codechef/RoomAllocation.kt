package codechef

fun minRoomsNeeded(n: Int, a: List<Int>): Int {
    var totalRooms = 0
    for (num in a) {
        totalRooms += (num + 1) / 12
    }
    return totalRooms
}

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val n = readln().toInt()
        val a = readln().split(" ").map { it.toInt() }

        println(minRoomsNeeded(n, a))
    }
}