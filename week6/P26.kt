package week6

import kotlin.math.max

/**
 * 1. 소수점을
 * 1. 숫자 9개 연속되는 정수를 찾기
 * 2. 9가 연속되면, 그 아래 자리 숫자들이 모두 0인지 확인
 */
fun main() {
    var d = 2 // 1000 under
    var result = 0
    val matchNine = Regex("^9+")
    val matchZero = Regex("^0+$")
    while (d <= 512) {
        var mul = 1
        while (true) {
            val numToString = (d * mul).toString()
            val match = matchNine.find(numToString)
            if (match == null) {
                mul++
                continue
            }
            if (match.value == numToString) {
                result = max(result, numToString.length)
                println("$d : ${numToString.length}")
                break
            }
            val right = numToString.substring(match.value.length)
            if (right.matches(matchZero)) {
                result = max(result, match.value.length)
                println("$d : ${match.value.length}")
                break
            }
            mul++
        }
        d++
    }
    println(result)
}