//parameters are inside curly brackets
val message = { println("hello!") }
//if we want to add some parameters in lambda we could write like:
val printMessage = { message: String -> println(message) }
//another example
val somethingidk = { num1: Int, num2: Int -> println(num1+num2) }
fun main() {
    printMessage("hello from lambda")
    somethingidk(1,2)
    lambdacoba(2,2)
}
//val sum: (Int, Int) -> Int = {valueA, valueB -> valueA, valueB}


val lambdacoba = { value1: Int, value2: Int -> {
    val hasil = value1 + value2
    println(hasil)}}

