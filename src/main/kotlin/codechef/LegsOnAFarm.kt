package codechef

fun main() {
    val testCases = readln().toInt()
    repeat(testCases) {
        val totalLegs = readln().toInt()

        var minAnimals = Int.MAX_VALUE
        for (cows in 0..totalLegs / 4) {
            val chickens = (totalLegs / 2) - (2 * cows)
            if (chickens >= 0 && (cows + chickens) < minAnimals) {
                minAnimals = cows + chickens
            }
        }
        println(minAnimals)
    }
}
