//we could make a new function for a class without implementing inheritance on that class
// there are 2 type of extensions :
//extension function

fun Int.printInt() {
    println("value $this")
}
//we could also make return to the extensions
fun Int.plusThree(): Int{
    return this + 3
}
fun main() {
    val number1 = 10
    number1.printInt()
    println(number1.plusThree())

}


//extension properties
val Int.slice: Int
    get() = this / 2

/*
fun main() {
    println(10.slice)
}*/