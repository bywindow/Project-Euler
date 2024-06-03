package week7

fun main() {
    val list = mutableListOf<Int>().apply {
        add(1)
        add(2)
    }
    for (i in 2..19) {
        list.add(list.last() * 2)
    }

    var answer = 0L

    for (i in 0 until 1_000_000) {
        val str = i.toString()
        val rev = str.reversed()
        if (str != rev) continue
        var cur = i
        val result = mutableListOf<Int>()
        var isStart = false
        for (j in list.lastIndex downTo 0) {
            if (cur >= list[j]) {
                isStart = true
                result.add(1)
                cur -= list[j]
            } else if (isStart) {
                result.add(0)
            }
        }
        val resStr = result.joinToString("")
        val revResStr = resStr.reversed()
        if (resStr == revResStr) {
            answer += i
        }
    }

    print(answer)
}