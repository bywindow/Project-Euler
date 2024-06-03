package week6

var isPrime = BooleanArray(1001){ true }


fun makePrime() {
    isPrime[1] = false
    for(i in 2 until isPrime.size) {
        if (isPrime[i].not()) continue
        if (i+i >= isPrime.size) continue
        for (j in i+i until isPrime.size step i) {
            isPrime[j] = false
        }
    }
}

fun main() {
    makePrime()
    var a = 0
    var b = 0
    var result = 0
    while (a < 1001) {
        a++
        if (isPrime[a].not()) continue
        while (b < 1000) {
            b++
            if (isPrime[b].not()) continue
            var cnt = 0
            while (true) {
                var cur = cnt*cnt + cnt*a + b
            }
        }
    }
}