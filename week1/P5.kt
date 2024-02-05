package Euler

import kotlin.math.pow

fun main() {
    //20 이하 소수인 것을 가지고 있는다
    val n = 20
    val isPrime = BooleanArray(n+1) { true }
    isPrime[1] = false
    val primes = mutableMapOf<Int, Int>()

    for (p in 2..n) {
        if (isPrime[p]) {
            primes[p] = 0
            var i = p * 2
            while (i <= n) {
                isPrime[i] = false
                i += p
            }
            var temp = p
            while (temp <= n) {
                primes[p] = (primes[p] ?: 0) + 1
                temp *= p
            }
        }
    }
//    print(primes)

    var answer = 1
    primes.entries.forEach { (key, value) ->
        answer *= (key.toDouble().pow(value.toDouble()).toInt())
    }
    print(answer)
}