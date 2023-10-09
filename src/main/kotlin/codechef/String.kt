package codechef
fun main() {
    val t = readln().toInt()
    repeat(t){
        val a = readln()
        var flag = false
        for(j in a.indices)
        {
            if(a[j]=='0' || a[j]=='5')
            {
                flag = true
                break
            }
        }

        if(flag)
        {
            println("Yes")
        }
        else
        {
            println("No")
        }
    }
}