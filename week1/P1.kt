package Euler

fun main() {
    var answer = 0
    (1 until 1000).forEach {
        if (it % 3 == 0 || it % 5 == 0) {
            answer += it
        }
    }
    print(answer)
}