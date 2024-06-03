package week4

fun main() {
    var arr = IntArray(1001) { 0 }
    arr[1] = 3
    arr[2] = 3
    arr[3] = 5
    arr[4] = 4
    arr[5] = 4
    arr[6] = 3
    arr[7] = 5
    arr[8] = 5
    arr[9] = 4
    arr[10] = 3
    arr[11] = 6
    arr[12] = 6
    arr[13] = 8 //thirteen
    arr[14] = 8 //fourteen
    arr[15] = 7 //fifteen
    arr[16] = 7
    arr[17] = 9
    arr[18] = 8 //eighteen
    arr[19] = 8 //nineteen
    arr[20] = 6 //twenty
    arr[30] = 6 //thirty
    arr[40] = 5 //forty
    arr[50] = 5 //fifty
    arr[60] = 5 //sixty
    arr[70] = 7 //seventy
    arr[80] = 6 //eighty
    arr[90] = 6 //ninety
    arr[100] = 7 //hundred
    arr[1000] = 11//one thousand

    for(i in 1..1000) {
        if (arr[i] != 0) continue
        if (i < 100) {
            arr[i] = arr[(i / 10) * 10] + arr[i%10]
            continue
        }
        arr[i] = arr[i / 100] + arr[100] + 3 + arr[i % 100]
    }

    var answer = 0
    for (i in 1..1000) {
        answer += arr[i]
    }
    println(answer)
}