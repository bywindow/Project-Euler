package week6

fun main() {
    var index = 1
    var result = 1L
    while (index < 1001) {
        index += 2
        for (i in 0 until 4) {
            result += (index*index - (index-1)*i)
        }
    }
    println(result)
}