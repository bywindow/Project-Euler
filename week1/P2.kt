package Euler

fun main() {
    var first = 1
    var second = 1
    var target = first + second

    var answer = 0

    while (target < 4000000) {
        if (target % 2 == 0) {
            answer += target
        }
        first = second
        second = target
        target = first + second
    }
    print(answer)
}