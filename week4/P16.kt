package week4

import java.math.BigInteger

fun main() {
    val result = BigInteger("2").pow(1000).toString()
    println(result)

    var answer = 0

    for (i in 0..result.lastIndex) {
        answer += (result[i].toChar() - '0')
    }

    println(answer)
}