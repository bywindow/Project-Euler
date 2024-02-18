package week2

import kotlin.math.sqrt

fun main() {
    var index = 2
    var count = 1
    var answer: Int
    while (true) {
        index += 1
        if (index % 2 == 0) continue
        var isPrime = true
        for (i in 3..sqrt(index.toDouble()).toInt()) {
            if (index % i == 0) isPrime = false
        }
        if (isPrime) {
            count += 1
            if (count == 10001) {
                answer = index
                break
            }
        }
    }
    print(answer)
}