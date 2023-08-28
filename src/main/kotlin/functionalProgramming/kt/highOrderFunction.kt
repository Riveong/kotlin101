fun main() {
    printResult(10){ value -> value+value }
}

/*fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var sur: (Int) -> Int = { value -> value + value }

*/
inline fun printResult(value: Int, sur: (Int) -> Int) {
    val result = sur(value)
    println(result)
}