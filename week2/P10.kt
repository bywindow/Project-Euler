package week2

fun main() {
    var isPrime = BooleanArray(2000001){true}
    isPrime[1] = false
    var answer = 0L
    for (i in 2 until isPrime.size) {
        if (isPrime[i]) {
            for (j in i + i until isPrime.size step i) {
                isPrime[j] = false
            }
        }
    }
    isPrime.forEachIndexed { index, b ->
        if (b) {
            answer += index
        }
    }
    print(answer)
}