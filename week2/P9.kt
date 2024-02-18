package week2

fun main() {

    for (a in 1 until 1000) {
        for (b in a until 1000) {
            val c = 1000 - a - b
            if (a*a + b*b == c*c && a + b + c == 1000) {
//                print("$a \t $b \t $c\n")
                print(a*b*c)
            }
        }
    }
}