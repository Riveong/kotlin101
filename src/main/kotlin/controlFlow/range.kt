//here you could make a variable with range
fun main() {
    val rangeInt = 1..10
    print(rangeInt.step)
}

//we also can define a range's step with initializing step
/*fun main() {
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)
}*/

//we also can print each of the range with these lines:
/*fun main() {
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)*/




// we could also define range with downTo and rangeTo
// val rangeInt = 1.rangeTo(10)
// val downInt = 10.downTo(1) -> the output should be 10,9,8,7,6,5,4,3,2,1

//we could also make range with char!
//val rangeChar = 'A'.rangeTo('F')



