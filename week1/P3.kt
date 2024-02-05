package Euler

fun main() {
    var num = 600851475143
    var div = 2
    var answer = 0

    while (num.toInt() != 1) {
        if ((num % div).toInt() == 0) {
            num /= div
            answer = div
        } else {
            div += 1
        }
    }

    print(answer)
}