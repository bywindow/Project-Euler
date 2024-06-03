fun main() {
    val list = mutableListOf<Int>().apply {
        add(1)
        add(1)
        add(2)
    }
    for (i in 3..9) {
        list.add(list.last() * i)
    }

    var answer = 0L

    for (i in 10..1000000) {
        var result = 0
        var cur = i
        while (cur > 0) {
            val div = cur % 10
            result += list[div]
            cur /= 10
        }
        if (result == i) {
            answer += result
        }
    }

    print(answer)
}
