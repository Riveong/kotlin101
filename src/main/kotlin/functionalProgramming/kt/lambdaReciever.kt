//without lambda with reciever
fun buildString(): String {
    val stringBuilder = StringBuilder().apply {
        append("Hello")
        append("kotlin")
    }


    stringBuilder.append("Hello ")
    stringBuilder.append("from ")
    stringBuilder.append("lambda")
    return stringBuilder.toString()
}
// too many steps!
//with lambda with a reciever
fun buildString(action: StringBuilder.() -> Unit): String{
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}