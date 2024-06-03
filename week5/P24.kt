package week5

fun main() {
    val numbers = mutableListOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
    var target = 1000000 - 1
    var answer = ""

    for (i in numbers.size - 1 downTo 0) {
        var factorial = 1
        var cnt = 1
        while (cnt <= i) {
            factorial *= cnt
            cnt++
        }
        val index = target / factorial
        target %= factorial

        answer += numbers[index]
        numbers.removeAt(index)

        if (target == 0) {
            break
        }
    }

    answer += numbers.joinToString("")

    println("$answer")
}