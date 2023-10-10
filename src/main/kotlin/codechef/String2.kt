package codechef

fun main() {
    val t = readln().toInt()
    repeat(t){
        val n = readln().toInt()
        val divisors = IntArray(n)
        var i = 1
        var j = 0
        while(i <= n)
        {

            if (n%i == 0)
            {

                divisors[j] = i

                j++
            }
            i++
        }
        for(l in 0..<j)
        {
            print("${divisors[l]} ")
        }
        println()
    }
}