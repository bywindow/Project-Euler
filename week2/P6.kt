package week2

fun main() {
    var answer = 0
    for(i in 1 until 100) {
        for (j in i+1..100) {
            answer += 2 * i * j
        }
    }
    print(answer)
}