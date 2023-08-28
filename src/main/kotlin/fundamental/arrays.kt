package fundamental

fun main() {

    //array with any type of data
    val array = arrayOf(1,2,3,4,5,"a")
    //array with int
    val array2 = intArrayOf(1,2,2)
    //references

    /*
    intArrayOf() : IntArray

    booleanArrayOf() : BooleanArray

    charArrayOf() : CharArray

    longArrayOf() : LongArray

    shortArrayOf() : ShortArray

    byteArrayOf() : ByteArray
    */

    //printing array
    println(array[0])
    for (element in array){
        println("index ke $element"+element)
    }


}