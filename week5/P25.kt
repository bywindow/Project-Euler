package week5

import java.math.BigInteger

fun main() {
    val arr = mutableListOf<BigInteger>(BigInteger("1"), BigInteger("1"))
    var cnt = 2
    while (true) {
        val next = arr[cnt-1] + arr[cnt-2]
        arr.add(next)
        if (next.toString().length == 1000) break
        cnt += 1
    }

    println(cnt+1)
}