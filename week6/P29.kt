package week6

import java.math.BigInteger

fun main() {
    val sets = mutableSetOf<BigInteger>()
    for (i in 2..100) {
        for (j in 2..100) {
            val value = BigInteger("$i").pow(j)
            sets.add(value)
        }
    }
    println(sets.size)
}