package week5

import kotlin.math.pow

fun main() {

    var isPrime = BooleanArray(10001) { true }
    isPrime[1] = false
    for (i in 2 until isPrime.size) {
        if (isPrime[i].not()) continue
        for (j in i + i until isPrime.size step i) {
            isPrime[j] = false
        }
    }

    val list = mutableListOf<Int>(0, 0)
    (2..10000).forEach {
        if (isPrime[it]) {
            list.add(1)
        } else {
            var div = 2
            var cur = it
            val map = mutableMapOf<Int, Int>()
            while (cur > 1) {
                if (cur % div == 0) {
                    val prev = map[div] ?: 0
                    map[div] = prev + 1
                    cur /= div
                } else {
                    div++
                }
            }
            var sum = 1
            map.forEach { (t, v) ->
                sum *= ((t.toDouble().pow(v + 1) - 1) / (t-1)).toInt()
            }
            sum -= it
//            println(sum)
            list.add(sum)
        }
    }
    var answer = 0L
    list.forEach {
        if (it > 10000) return@forEach
        if (list[it] == it) answer += it
    }
    println(answer)
}