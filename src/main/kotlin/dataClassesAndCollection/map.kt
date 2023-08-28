//map, just like in other programming language.
val capital = mapOf(
    "Jakarta" to "Indonesia",
    "London" to "England",
    "New Delhi" to "India"
)

fun main() {
    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))
    print(capital.values)
    print(capital.keys)


    //to change value of a map we could use change them to mutable first.
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
    print(mutableCapital)
}