//we could make a data type using function type.
//using typealias!
//it's like normal fucntion but with different code style tbh
typealias Artihmetic2 = (Int, Int) -> String
typealias Arithmetic = (Int, Int) -> Int
val sum: Arithmetic = {valueA, valueB -> valueA + valueB}
val multiply: Arithmetic = {valueA, valueB -> valueA * valueB}
val sum2: Artihmetic2 = {valueA, valueB -> "$valueA + $valueB"}


fun main() {
    val testing = sum2(10,10)
    println(testing)
}