package Euler

fun main() {
    var answer = 0
    (100..999).forEach { first ->
        (100..999).forEach { second ->
            val temp = first * second
            val strTemp = temp.toString()
            if (strTemp == strTemp.reversed() && answer < temp) {
                answer = temp
            }
        }
    }
    print(answer)
}