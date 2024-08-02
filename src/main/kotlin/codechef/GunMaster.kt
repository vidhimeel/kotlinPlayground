package codechef

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val input1 = readln().split(" ")
        val n = input1[0].toInt()
        val FD = input1[1].toInt()

        val input2 = readln().split(" ")
        val x = input2.map { it.toInt() }
        var Count = 0
        var holdingCloseRangeWeapon = true

        for (distance in x) {
            if (holdingCloseRangeWeapon) {
                if (distance > FD) {
                    Count += 1
                    holdingCloseRangeWeapon = false
                }
            } else {
                if (distance <= FD) {
                    Count += 1
                    holdingCloseRangeWeapon = true
                }
            }
        }
        println(Count)
    }
}
