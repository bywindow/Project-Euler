package week6

import kotlin.math.pow

fun main() {
    val list = mutableListOf(0)
    (1..9).forEach {
        list.add(it.toDouble().pow(5).toInt())
    }
    var sum = 0
    while (list.size < 1000000) {
        val nextIndex = list.lastIndex + 1
        val div = 10.toDouble().pow(nextIndex.toString().length - 1).toInt()
        val first = nextIndex / div
        val last = nextIndex % div
        list.add(list[first] + list[last])

        if (list.lastIndex == list.last()) sum += list.lastIndex
    }

    println(sum)
}