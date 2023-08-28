//we can make vararg for making many variable in argument
fun sizeNumbers(vararg number: Int): Int{
    return number.size


}
//we also could make vararg with array
val array1 = intArrayOf(1,2,3,4,5)
fun withArray(vararg number: Int): Int{
    return number.sum()
}


fun main() {

    println(sizeNumbers(10,10,10,10,10))
    println(withArray(*array1))


}





/*fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}*/