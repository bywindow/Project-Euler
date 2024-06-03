package week5

fun main() {
    val list = mutableListOf<Int>()
    (1..28123).forEach {
        var divSum = 0
        (1 until it).forEach { div ->
            if (it % div == 0) divSum += div
        }
        if (it < divSum) list.add(it)
    }

    for (i in 0 until list.size) {
        for (j in i until list.size) {

        }
    }
}