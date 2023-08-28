package fundamental

fun main() {
    //string template

        val name = "Kotlin"
        print("My name is $name")

    //we could also use expression
    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")



}